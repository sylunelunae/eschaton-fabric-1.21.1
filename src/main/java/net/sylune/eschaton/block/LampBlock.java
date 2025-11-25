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
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.sylune.eschaton.sound.ModSounds;

public class LampBlock extends Block {

    public static final BooleanProperty LIT = Properties.LIT;

    public LampBlock(AbstractBlock.Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
        this.setDefaultState(this.stateManager.getDefaultState().with(LIT, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (world.isClient) return ActionResult.SUCCESS;

        boolean newState = !state.get(LIT);

        world.setBlockState(pos, state.with(LIT, newState), Block.NOTIFY_ALL);

        world.playSound(
                null,
                pos,
                ModSounds.LAMP_TOGGLE,
                SoundCategory.BLOCKS,
                1.0f,
                newState ? 1.2f : 0.8f
        );

        return ActionResult.SUCCESS;
    }
}
