package net.sylune.eschaton.item.FoodCustoms;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.sylune.eschaton.item.ModItems;

public class WaterElixir extends Item {

    public WaterElixir(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 32; // drinking duration
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);

        if (!world.isClient) {
            if (stack.isEmpty()) {
                return new ItemStack(ModItems.ELIXIR_BOTTLE);
            } else {
                if (user instanceof PlayerEntity player) {
                    player.getInventory().insertStack(new ItemStack(Items.GLASS_BOTTLE));
                }
            }
        }

        return stack;
    }
}
