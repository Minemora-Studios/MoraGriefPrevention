package net.minemora.griefprevention.events;

import me.ryanhamshire.GriefPrevention.Claim;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class StartClaimResizeEvent extends PlayerEvent implements Cancellable
{

    private final @NotNull Claim claim;
    private final @NotNull Block clickedBlock;
    private boolean cancelled = false;

    public StartClaimResizeEvent(@NotNull Player who, @NotNull Claim claim, @NotNull Block clickedBlock)
    {
        super(who);
        this.claim = claim;
        this.clickedBlock = clickedBlock;
    }

    public final @NotNull Claim getClaim()
    {
        return this.claim;
    }

    public final @NotNull Block getClickedBlock()
    {
        return this.clickedBlock;
    }

    // Listenable event requirements
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
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled)
    {
        this.cancelled = cancelled;
    }
}
