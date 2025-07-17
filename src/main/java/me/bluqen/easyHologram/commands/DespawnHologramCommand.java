package me.bluqen.easyHologram.commands;

import me.bluqen.easyHologram.EasyHologram;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

import java.util.Deque;

public class DespawnHologramCommand implements CommandExecutor {

    EasyHologram plugin;

    public DespawnHologramCommand(EasyHologram plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player player) {

            Deque<ArmorStand> stack = plugin.holograms.get(player);
            if (stack != null && !stack.isEmpty()) {
                ArmorStand hologram = stack.pop();
                if (!hologram.isDead()) {
                    hologram.remove();
                }

                if (stack.isEmpty()) {
                    plugin.holograms.remove(player);
                }

                player.sendMessage(ChatColor.GREEN + "Removed latest hologram");
            } else {
                player.sendMessage(ChatColor.RED + "You have no holograms to remove");
            }

            return true;
        }
        return true;
    }
}
