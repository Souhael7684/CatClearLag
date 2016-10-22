package me.time6628.clag.sponge.runnables;

import me.time6628.clag.sponge.CatClearLag;
import org.spongepowered.api.Game;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

/**
 * Created by TimeTheCat on 7/20/2016.
 */
public class ItemClearingWarning implements Runnable {

    private int seconds;
    private CatClearLag plugin;

    public ItemClearingWarning(int seconds, CatClearLag game) {
        this.seconds = seconds;
        this.plugin = game;
    }

    @Override
    public void run() {
        plugin.game.getServer().getBroadcastChannel().send(Text.builder().append(plugin.prefix).color(TextColors.RED).append(Text.of("All ground items have been cleared.")).build());
    }
}