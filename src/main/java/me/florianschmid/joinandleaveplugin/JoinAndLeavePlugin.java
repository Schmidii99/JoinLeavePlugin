package me.florianschmid.joinandleaveplugin;

import me.florianschmid.joinandleaveplugin.commands.SetJoinMessage;
import me.florianschmid.joinandleaveplugin.commands.SetLeaveMessage;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinAndLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new MyListeners(), this);

        this.getCommand("setJoinMessage").setExecutor(new SetJoinMessage());
        this.getCommand("setLeaveMessage").setExecutor(new SetLeaveMessage());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
