package me.bluqen.easyHologram;

import me.bluqen.easyHologram.commands.DespawnAllHologramscommand;
import me.bluqen.easyHologram.commands.DespawnHologramCommand;
import me.bluqen.easyHologram.commands.SpawnHologramCommand;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public final class EasyHologram extends JavaPlugin {

    public static final Map<Player, Deque<ArmorStand>> holograms = new HashMap<>();


    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("spawnhologram").setExecutor(new SpawnHologramCommand());
        getCommand("despawnhologram").setExecutor(new DespawnHologramCommand(this));
        getCommand("despawnallholograms").setExecutor(new DespawnAllHologramscommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
