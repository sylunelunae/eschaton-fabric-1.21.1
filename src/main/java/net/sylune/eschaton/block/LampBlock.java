package net.sylune.eschaton.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.random.Random;
import net.sylune.eschaton.sound.ModSounds;

public class LampBlock extends Block {

    public static final BooleanProperty LIT = Properties.LIT;
    public static final BooleanProperty COOLDOWN = BooleanProperty.of("cooldown");

    public LampBlock(AbstractBlock.Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));

        // DEFAULT STATE: ON and no cooldown
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(LIT, true)
                .with(COOLDOWN, false)
        );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, COOLDOWN);
    }

    // Makes sure the block is placed ON
    @Override
    public BlockState getPlacementState(net.minecraft.item.ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(LIT, true)
                .with(COOLDOWN, false);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos,
                                 PlayerEntity player, BlockHitResult hit) {

        if (player.shouldCancelInteraction()) return ActionResult.PASS;

        // Prevent clicking during cooldown
        if (state.get(COOLDOWN)) return ActionResult.FAIL;

        if (world.isClient) return ActionResult.SUCCESS;

        boolean newLit = !state.get(LIT);

        // Toggle lamp
        world.setBlockState(pos,
                state.with(LIT, newLit).with(COOLDOWN, true),
                Block.NOTIFY_ALL
        );

        // Play toggle sound
        world.playSound(
                null,
                pos,
                ModSounds.LAMP_TOGGLE,
                SoundCategory.BLOCKS,
                0.5f,
                newLit ? 1.0f : 0.6f
        );

        // Schedule cooldown reset in 10 ticks (0.5 seconds)
        ((ServerWorld) world).scheduleBlockTick(pos, this, 10);

        return ActionResult.SUCCESS;
    }

    // Called after the cooldown timer ends
    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.setBlockState(pos,
                state.with(COOLDOWN, false),
                Block.NOTIFY_ALL
        );
    }
}
