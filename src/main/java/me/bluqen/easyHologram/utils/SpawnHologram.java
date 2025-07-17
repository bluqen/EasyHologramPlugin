package me.bluqen.easyHologram.utils;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.List;

public class SpawnHologram {

    public static void spawnHologram(Player player, Location location, String text){

        ArmorStand hologram = (ArmorStand) player.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);
        hologram.setVisible(false);
        hologram.setCustomName(text);
        hologram.setGravity(false);

    }

    public static void spawnHolograms(Player player, Location location, String[] text, double distance){
        int yOffset = 0;
        for (String i : text){
            spawnHologram(player, player.getLocation().add(0, yOffset, 0), i);
            yOffset += distance;
        }
    }

}
