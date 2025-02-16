package net.minemora.griefprevention.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class ClaimBlocksUpdateEvent extends PlayerEvent {

    private final int previousClaimBlocks;
    private final int currentClaimBlocks;

    /**
     * Construct a new {@code ClaimBlocksUpdateEvent}.
     *
     * @param player the {@link Player} whose claim blocks are being updated
     * @param previousClaimBlocks the claim blocks the player had before the update
     * @param currentClaimBlocks the claim blocks the player has after the update
     */
    public ClaimBlocksUpdateEvent(@NotNull Player player, int previousClaimBlocks, int currentClaimBlocks) {
        super(player);
        this.previousClaimBlocks = previousClaimBlocks;
        this.currentClaimBlocks = currentClaimBlocks;
    }

    /**
     * Get the number of claim blocks the player had before the update.
     *
     * @return the previous claim block count
     */
    public int getPreviousClaimBlocks() {
        return previousClaimBlocks;
    }

    /**
     * Get the current number of claim blocks the player has after the update.
     *
     * @return the current claim block count
     */
    public int getCurrentClaimBlocks() {
        return currentClaimBlocks;
    }

    // Listenable event requirements
    private static final HandlerList HANDLERS = new HandlerList();

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }
}

