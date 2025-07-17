package me.bluqen.easyHologram.utils;

import me.bluqen.easyHologram.EasyHologram;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.ArrayDeque;
import java.util.List;

public class SpawnHologram {

    static EasyHologram plugin;

    public SpawnHologram(EasyHologram plugin) {
        this.plugin = plugin;
    }

    public static void spawnHologram(Player player, Location location, String text){

        ArmorStand hologram = (ArmorStand) player.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);
        hologram.setVisible(false);
        hologram.setCustomName(ChatColor.translateAlternateColorCodes('&', text));
        hologram.setCustomNameVisible(true);
        hologram.setGravity(false);

        plugin.holograms.computeIfAbsent(player, k -> new ArrayDeque<>()).push(hologram);

    }

    public static void spawnHolograms(Player player, Location location, String[] text, double distance) {
        double yOffset = 0;
        for (String line : text) {
            Location hologramLocation = location.clone().add(0, yOffset, 0);
            spawnHologram(player, hologramLocation, line);
            yOffset -= distance;
        }
    }

}
