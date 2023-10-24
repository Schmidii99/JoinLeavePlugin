package me.florianschmid.joinandleaveplugin.commands;

import me.florianschmid.joinandleaveplugin.MyListeners;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetLeaveMessage implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            return false;
        }

        MyListeners.leaveMessage = String.join(" ", strings);

        final Player player = (Player) commandSender;
        player.sendMessage("Leave message set to '" + MyListeners.leaveMessage +"'");

        return true;
    }
}