package de.joeakeem.plugin.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class DiamonAxeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            PlayerInventory inventory = player.getInventory();
            ItemStack itemstack = new ItemStack(Material.DIAMOND_PICKAXE, 1);
            inventory.addItem(itemstack);
            player.sendMessage("Dann hack mal los!!");
        } else {
            sender.sendMessage("You must be a player!");
            return false;
        }
        return false;
    }
}
