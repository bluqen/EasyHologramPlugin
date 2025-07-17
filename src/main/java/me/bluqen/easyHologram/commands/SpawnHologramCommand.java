package me.bluqen.easyHologram.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.bluqen.easyHologram.utils.SpawnHologram;
import org.bukkit.entity.Player;

public class SpawnHologramCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player player) {

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < strings.length; i++) {
                builder.append(strings[i]).append(" ");
            }

            String combinedArgs = builder.toString();

            String[ ] parts = combinedArgs.split(";");

            SpawnHologram.spawnHolograms(player, player.getLocation(), parts, 0.3);
        }

        return true;
    }
}
