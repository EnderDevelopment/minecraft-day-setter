package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SetDayPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("SetDayPlugin has been disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("setday")) {
            if (sender.hasPermission("setday.use")) {
                getServer().dispatchCommand(getServer().getConsoleSender(), "time set day");
                sender.sendMessage("Time set to day!");
                return true;
            } else {
                sender.sendMessage("You do not have permission to use this command.");
                return false;
            }
        }
        return false;
    }
}