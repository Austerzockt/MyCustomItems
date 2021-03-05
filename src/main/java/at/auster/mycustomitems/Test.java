package at.auster.mycustomitems;

import at.auster.customitems.items.CustomItem;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Test extends CustomItem {
    @Override
    public void onItemStackCreate(ItemStack itemStack) {

    }

    @Override
    public ShapedRecipe setRecipe(ShapedRecipe shapedRecipe) {
        return null;
    }

    @Override
    public void leftClickAirAction(Player player, ItemStack itemStack) {

    }

    @Override
    public void leftClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {

    }

    @Override
    public void rightClickAirAction(Player player, ItemStack itemStack) {

    }

    @Override
    public void rightClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {

    }

    @Override
    public void shiftLeftClickAirAction(Player player, ItemStack itemStack) {

    }

    @Override
    public void shiftLeftClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {

    }

    @Override
    public void shiftRightClickAirAction(Player player, ItemStack itemStack) {

    }

    @Override
    public void shiftRightClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {

    }

    @Override
    public void hitEntityAction(Player player, EntityDamageByEntityEvent entityDamageByEntityEvent, Entity entity, ItemStack itemStack) {

    }

    @Override
    public void breakBlockAction(Player player, BlockBreakEvent blockBreakEvent, Block block, ItemStack itemStack) {

    }
}
