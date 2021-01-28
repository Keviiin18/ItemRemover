package de.kevin.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

public class Clear implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if(command.getName().equalsIgnoreCase("clear")) {
            if(args.length == 0) {

                for(World world : Bukkit.getWorlds()) {
                    for(Entity entity : player.getWorld().getEntities()) {
                        if(entity instanceof Item) {
                            entity.remove();
                        }
                    }
                }

                player.sendMessage("Es wurden alle herumliegenden Items entfernt!");

            }
        }

        return false;
    }
}
