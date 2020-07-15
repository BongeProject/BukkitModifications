package org.bukkit.command;

import org.bonge.Bonge;
import org.bonge.bukkit.r1_14.command.CommandState;
import org.spongepowered.api.command.Command;
import org.spongepowered.api.command.CommandExecutor;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.parameter.CommandContext;
import org.spongepowered.api.command.parameter.Parameter;

import java.io.IOException;
import java.util.Collection;

public class SpongeCommandWrapping implements CommandExecutor {

    private CommandState state;
    private Parameter.Value<String> commandArguments;

    public SpongeCommandWrapping(CommandState state){
        this.state = state;
        this.commandArguments = Parameter.remainingJoinedStrings().setSuggestions(context -> {
            Collection<? extends String> args = context.getAll(SpongeCommandWrapping.this.commandArguments);

            CommandSender sender;
            try{
                sender = Bonge.getInstance().convert(CommandSender.class, context.getSubject());
            }catch(IOException e){
                throw new IllegalArgumentException(e);
            }
            return SpongeCommandWrapping.this.state.getCmd().tabComplete(sender, SpongeCommandWrapping.this.state.getLabel(), args.toArray(new String[0]));
        }).optional().build();
    }

    public Command.Parameterized buildCommand(){
        return Command.builder()
                .setExecutor(this)
                .parameter(this.commandArguments)
                .setPermission(this.state.getCmd().getPermission())
                .setShortDescription(Bonge.getInstance().convertText(this.state.getCmd().getDescription()))
                .build();
    }

    @Override
    public CommandResult execute(CommandContext context) {
        try {
            CommandSender source2 = Bonge.getInstance().convert(CommandSender.class, context.getSubject());
            String[] split = context.getAll(this.commandArguments).toArray(new String[0]);
            boolean result = this.state.getCmd().execute(source2, this.state.getLabel(), split);
            return result ? CommandResult.success() : CommandResult.empty();
        }catch (IOException e){
            throw new IllegalArgumentException(e);
        }catch (Throwable e){
            if(this.state.getCmd() instanceof PluginCommand) {
                Bonge.createCrashFile(((PluginCommand)this.state.getCmd()).getPlugin(), "Command", e);
            }
            throw e;
        }
    }

    /*
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
    }*/
}
