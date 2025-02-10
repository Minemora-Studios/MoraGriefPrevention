package net.minemora.griefprevention;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class MoraGp implements Listener {

    private static MoraGp instance;

    private final HashMap<UUID, MoraGpPlayer> players = new HashMap<>();

    private final JavaPlugin plugin;

    public MoraGp(JavaPlugin plugin) {
        instance = this;
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public static MoraGp getInstance() {
        return instance;
    }

    public JavaPlugin getPlugin()
    {
        return plugin;
    }

    public MoraGpPlayer getPlayer(Player player)
    {
        return players.get(player.getUniqueId());
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        players.put(event.getPlayer().getUniqueId(), new MoraGpPlayer(event.getPlayer().getUniqueId()));
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        players.remove(event.getPlayer().getUniqueId());
    }

    public void playerHoldsShovel(Player player) {
        getPlayer(player).startClaimEditingMode();
    }

    public void playerReleaseShovel(Player player) {
        getPlayer(player).scheduleStopClaimEditingMode();
    }
}
