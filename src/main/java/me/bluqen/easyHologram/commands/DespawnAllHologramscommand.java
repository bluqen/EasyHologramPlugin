package me.bluqen.easyHologram.commands;

import me.bluqen.easyHologram.EasyHologram;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

import java.util.Deque;

public class DespawnAllHologramscommand implements CommandExecutor {

    EasyHologram plugin;

    public DespawnAllHologramscommand(EasyHologram plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player player){
            Deque<ArmorStand> stack = plugin.holograms.remove(player); // removes entire list
            if (stack != null) {
                for (ArmorStand holo : stack) {
                    if (!holo.isDead()) {
                        holo.remove();
                    }
                }
            }
        }

        return true;

    }
}
