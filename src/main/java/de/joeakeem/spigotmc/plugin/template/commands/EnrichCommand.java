package de.joeakeem.spigotmc.plugin.template.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class EnrichCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            PlayerInventory inventory = player.getInventory();
            ItemStack itemstack = new ItemStack(Material.DIAMOND, 64);
            inventory.addItem(itemstack);
            player.sendMessage("You got 64 diamonds!!");
        } else {
            sender.sendMessage("You must be a player!");
            return false;
        }
        return false;
    }
}
