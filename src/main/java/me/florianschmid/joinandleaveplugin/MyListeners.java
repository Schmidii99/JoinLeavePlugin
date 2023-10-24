package me.florianschmid.joinandleaveplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MyListeners implements Listener {
    @EventHandler
    public void JoinEvent(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.BLUE + player.getName() + ChatColor.YELLOW + " has joined!");
    }

    @EventHandler
    public void LeaveEvent(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.BLUE + player.getName() + ChatColor.YELLOW + " has left the Server!");
    }
}
