package de.joeakeem.spigotmc.plugin.template;

import de.joeakeem.spigotmc.plugin.template.commands.*;
import de.joeakeem.spigotmc.plugin.template.event.MovementListener;
import org.bukkit.plugin.java.JavaPlugin;

public class TemplatePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("enrich").setExecutor(new EnrichCommand());
        getLogger().info("Added the 'enrich' command.");
    }
}