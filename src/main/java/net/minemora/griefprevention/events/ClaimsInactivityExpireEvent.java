package net.minemora.griefprevention.events;

import me.ryanhamshire.GriefPrevention.Claim;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class ClaimsInactivityExpireEvent extends Event {
    private final @Nullable UUID playerUUID;
    private final @NotNull List<Claim> expiredClaims;

    public ClaimsInactivityExpireEvent(@Nullable UUID playerUUID, @NotNull List<Claim> expiredClaims) {
        this.playerUUID = playerUUID;
        this.expiredClaims = expiredClaims;
    }

    public @Nullable UUID getPlayerUUID() {
        return this.playerUUID;
    }

    public @NotNull List<Claim> getExpiredClaims() {
        return this.expiredClaims;
    }

    public int getTotalClaimBlocksFreed() {
        int total = 0;
        for (Claim claim : expiredClaims) total += claim.getArea();
        return total;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }
}
