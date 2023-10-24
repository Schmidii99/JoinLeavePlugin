package me.florianschmid.joinandleaveplugin.commands;

import me.florianschmid.joinandleaveplugin.MyListeners;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SetJoinMessage implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            return false;
        }

        MyListeners.joinMessage = String.join(" ", strings);
        final Player player = (Player) commandSender;
        player.sendMessage("Join message set to '" + MyListeners.joinMessage +"'");

        return true;
    }
}
