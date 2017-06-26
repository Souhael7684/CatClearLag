package me.time6628.clag.sponge.commands;

import com.google.inject.Inject;
import me.time6628.clag.sponge.CatClearLag;
import me.time6628.clag.sponge.Texts;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

/**
 * Created by TimeTheCat on 10/28/2016.
 */
public class ForceGCCommand implements CommandExecutor {
    @Inject private CatClearLag plugin;

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        src.sendMessage(Text.builder().append(Texts.getPrefix()).color(TextColors.LIGHT_PURPLE).append(Text.of("Requesting Garbage Collection...")).build());
        System.gc();
        src.sendMessage(Text.builder().append(Texts.getPrefix()).color(TextColors.LIGHT_PURPLE).append(Text.of("Garbage Collection Requested.")).build());
        return CommandResult.success();
    }
}
