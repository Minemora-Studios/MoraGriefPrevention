package net.minemora.griefprevention.events;

import me.ryanhamshire.GriefPrevention.Claim;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PreDeleteClaimEvent extends Event implements Cancellable {

    private final @NotNull Claim claim;
    private boolean cancelled = false;

    public PreDeleteClaimEvent(@NotNull Claim claim)
    {
        this.claim = claim;
    }

    public final @NotNull Claim getClaim()
    {
        return this.claim;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public static HandlerList getHandlerList()
    {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers()
    {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled()
    {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled)
    {
        this.cancelled = cancelled;
    }
}
