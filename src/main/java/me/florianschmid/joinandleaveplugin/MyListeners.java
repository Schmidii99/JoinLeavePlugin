package me.florianschmid.joinandleaveplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MyListeners implements Listener {
    public static String leaveMessage = ChatColor.BLUE + "%PLAYER%" + ChatColor.YELLOW + " has left the Server!";
    public static String joinMessage = ChatColor.BLUE + "%PLAYER%" + ChatColor.YELLOW + " has joined the Server!";
    @EventHandler
    public void joinEvent(final PlayerJoinEvent e) {
        final Player player = e.getPlayer();
        e.setJoinMessage(joinMessage.replace("%PLAYER%", player.getName()));

        final ItemStack itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
        final ItemMeta gapMeta = itemStack.getItemMeta();
        gapMeta.setDisplayName(ChatColor.BLUE + "Small starter boost!");
        gapMeta.addEnchant(Enchantment.KNOCKBACK, 10, true);
        itemStack.setItemMeta(gapMeta);
        player.getInventory().addItem(itemStack);
    }

    @EventHandler
    public void leaveEvent(final PlayerQuitEvent e) {
        final Player player = e.getPlayer();
        e.setQuitMessage(leaveMessage.replace("%PLAYER%", player.getName()));
    }
}
