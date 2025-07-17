package me.bluqen.easyHologram;

import me.bluqen.easyHologram.commands.SpawnHologramCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class EasyHologram extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("hologram").setExecutor(new SpawnHologramCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
