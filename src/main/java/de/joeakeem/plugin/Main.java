package de.joeakeem.plugin;

import de.joeakeem.plugin.commands.*;
import de.joeakeem.plugin.event.MovementListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new MovementListener(this);
        this.getCommand("reich").setExecutor(new EnrichCommand());
        this.getCommand("hack").setExecutor(new DiamonAxeCommand());
        this.getCommand("bogen").setExecutor(new BogenCommand());
        this.getCommand("pfeil").setExecutor(new PfeilComand());
        this.getCommand("fakel").setExecutor(new FakelComand());
    }
}