package net.minemora.griefprevention;


import com.griefprevention.visualization.BoundaryVisualization;
import com.griefprevention.visualization.VisualizationType;
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.ClaimPermission;
import me.ryanhamshire.GriefPrevention.DataStore;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import me.ryanhamshire.GriefPrevention.Messages;
import me.ryanhamshire.GriefPrevention.PlayerData;
import me.ryanhamshire.GriefPrevention.ShovelMode;
import me.ryanhamshire.GriefPrevention.TextMode;
import me.ryanhamshire.GriefPrevention.events.ClaimInspectionEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.Set;
import java.util.UUID;

public class MoraGpPlayer {

    private final UUID uuid;
    private boolean claimEditingMode;
    private BukkitTask stopEditingTask;

    public MoraGpPlayer(UUID uuid) {this.uuid = uuid;}

    public boolean isClaimEditingMode()
    {
        return claimEditingMode;
    }

    public void startClaimEditingMode()
    {
        if(stopEditingTask != null) {
            stopEditingTask.cancel();
            stopEditingTask = null;
        }

        if(claimEditingMode) return;

        claimEditingMode = true;

        Player player = Bukkit.getPlayer(uuid);

        if(player == null) return;

        PlayerData playerData = getData();

        //reset any work he might have been doing
        playerData.lastShovelLocation = null;
        playerData.claimResizing = null;
        getData().setVisibleBoundaries(null);

        //always reset to basic claims mode
        if (playerData.shovelMode != ShovelMode.Basic)
        {
            playerData.shovelMode = ShovelMode.Basic;
            GriefPrevention.sendMessage(player, TextMode.Info, Messages.ShovelBasicClaimMode);
        }

        //tell him how many claim blocks he has available
        int remainingBlocks = playerData.getRemainingClaimBlocks();
        GriefPrevention.sendMessage(player, TextMode.Instr, Messages.RemainingBlocks, String.valueOf(remainingBlocks));

        //link to a video demo of land claiming, based on world type
        if (GriefPrevention.instance.creativeRulesApply(player.getLocation()))
        {
            GriefPrevention.sendMessage(player, TextMode.Instr, Messages.CreativeBasicsVideo2, DataStore.CREATIVE_VIDEO_URL);
        }
        else if (GriefPrevention.instance.claimsEnabledForWorld(player.getWorld()))
        {
            GriefPrevention.sendMessage(player, TextMode.Instr, Messages.SurvivalBasicsVideo2, DataStore.SURVIVAL_VIDEO_URL);
        }

        //visualize nearby claims
        Set<Claim> claims = GriefPrevention.instance.dataStore.getNearbyClaims(player.getLocation());

        // alert plugins of a claim inspection, return if cancelled
        ClaimInspectionEvent inspectionEvent = new ClaimInspectionEvent(player, null, claims, true);
        Bukkit.getPluginManager().callEvent(inspectionEvent);
        if (inspectionEvent.isCancelled()) return;

        //visualize boundaries
        BoundaryVisualization.visualizeNearbyClaims(player, inspectionEvent.getClaims(), player.getEyeLocation().getBlockY());
        GriefPrevention.sendMessage(player, TextMode.Info, Messages.ShowNearbyClaims, String.valueOf(claims.size()));
    }

    private void stopClaimEditingMode() {
        if(!claimEditingMode) return;
        claimEditingMode = false;
        stopEditingTask = null;

        getData().setVisibleBoundaries(null);
    }

    public void scheduleStopClaimEditingMode() {
        if(stopEditingTask != null) {
            stopEditingTask.cancel();
        }
        stopEditingTask = new BukkitRunnable() {
            @Override
            public void run()
            {
                stopClaimEditingMode();
            }
        }.runTaskLater(MoraGp.getInstance().getPlugin(), 8*20);
    }

    public PlayerData getData() {
        return GriefPrevention.instance.dataStore.getPlayerData(uuid);
    }
}