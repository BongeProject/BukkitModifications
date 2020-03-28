package org.bukkit.command;

import org.bonge.Bonge;
import org.bonge.bukkit.command.CommandState;
import org.bonge.convert.InterfaceConvert;
import org.bonge.util.ArrayUtils;
import org.spongepowered.api.command.CommandCallable;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.serializer.TextSerializers;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class SpongeCommandWrapping implements CommandCallable {

    private CommandState state;

    public SpongeCommandWrapping(CommandState state){
        this.state = state;
    }

    @Override
    public CommandResult process(CommandSource source, String arguments) throws org.spongepowered.api.command.CommandException {
        CommandSender source2 = InterfaceConvert.getSender(source);
        try {
            String[] split = arguments.split(" ");
            if(split[split.length - 1].length() == 0){
                split = ArrayUtils.trim(1, split);
            }
            boolean result = this.state.getCmd().execute(source2, this.state.getLabel(), split);
            return result ? CommandResult.success() : CommandResult.empty();
        }catch (Throwable e){
            if(this.state.getCmd() instanceof PluginCommand) {
                Bonge.createCrashFile(((PluginCommand)this.state.getCmd()).getPlugin(), "Command", e);
            }
            throw e;
        }
    }


    @Override
    public List<String> getSuggestions(CommandSource source, String arguments, @javax.annotation.Nullable Location<World> targetPosition) throws org.spongepowered.api.command.CommandException {
        return this.state.getCmd().tabComplete(InterfaceConvert.getSender(source), this.state.getLabel(), arguments.split(" "));
    }

    @Override
    public boolean testPermission(CommandSource source) {
        String permission = this.state.getCmd().getPermission();
        if(permission == null){
            return true;
        }
        return source.hasPermission(permission);
    }

    @Override
    public Optional<Text> getShortDescription(CommandSource source) {
        return Optional.empty();
    }

    @Override
    public Optional<Text> getHelp(CommandSource source) {
        return Optional.empty();
    }

    @Override
    public Text getUsage(CommandSource source) {
        return TextSerializers.FORMATTING_CODE.deserialize(this.state.getCmd().usageMessage);
    }
}
