package org.bukkit.plugin.java;

import com.google.common.base.Charsets;
import org.bonge.bukkit.server.plugin.BongePluginManager;
import org.bonge.bukkit.server.plugin.loader.BongePluginLoader;
import org.bonge.bukkit.server.plugin.loader.BongeURLClassLoader;
import org.bonge.bukkit.server.plugin.loader.IBongePluginLoader;
import org.bonge.config.BongeConfig;
import org.bonge.launch.BongeLaunch;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginBase;
import org.bukkit.plugin.PluginDescriptionFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public abstract class JavaPlugin extends PluginBase {

    private BongePluginLoader loader;
    private FileConfiguration storedConfig;

    public File getConfigFile(){
        return new File(getDataFolder(), "config.yml");
    }

    public File getFile(){
        return this.loader.getFile();
    }

    @NotNull
    @Override
    public File getDataFolder() {
        return new File(BongeLaunch.getConfig().getOrElse(BongeConfig.PATH_PLUGINS_CONFIG), this.getName());
    }

    @NotNull
    @Override
    public PluginDescriptionFile getDescription() {
        return this.getPluginLoader().getYaml();
    }

    @NotNull
    @Override
    public FileConfiguration getConfig() {
        if (storedConfig == null) {
            reloadConfig();
        }
        return storedConfig;
    }

    @Nullable
    @Override
    public InputStream getResource(@NotNull String filename) {
        return Bukkit.class.getClassLoader().getResourceAsStream(filename);
    }

    @Override
    public void saveConfig() {

    }

    @Override
    public void saveDefaultConfig() {

    }

    @Override
    public void saveResource(@NotNull String resourcePath, boolean replace) {

    }

    @Override
    public void reloadConfig() {
        this.storedConfig = YamlConfiguration.loadConfiguration(this.getConfigFile());
        InputStream stream = this.getResource("config.yml");
        if(stream == null){
            return;
        }
        this.storedConfig.setDefaults(YamlConfiguration.loadConfiguration(new InputStreamReader(stream, Charsets.UTF_8)));
    }

    public void setEnabled(boolean check){
        this.getPluginLoader().setEnabled(check);
    }

    @Override
    @NotNull
    public BongePluginLoader getPluginLoader() {
        if(this.loader != null){
            return this.loader;
        }
        Optional<IBongePluginLoader> opPlugin = ((BongePluginManager)Bukkit.getServer().getPluginManager()).getPluginLoader(this);
        return (BongePluginLoader) opPlugin.get();
    }

    @NotNull
    @Override
    public Server getServer() {
        return Bukkit.getServer();
    }

    @Override
    public boolean isEnabled() {
        return this.getPluginLoader().isEnabled();
    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {

    }

    @Override
    public boolean isNaggable() {
        return false;
    }

    @Override
    public void setNaggable(boolean canNag) {

    }

    @Nullable
    @Override
    public ChunkGenerator getDefaultWorldGenerator(@NotNull String worldName, @Nullable String id) {
        return null;
    }

    @NotNull
    @Override
    public Logger getLogger() {
        return BongeLaunch.getLogger();
    }

    @Nullable
    public PluginCommand getCommand(@NotNull String name) {
        String alias = name.toLowerCase(java.util.Locale.ENGLISH);
        PluginCommand command = getServer().getPluginCommand(alias);
        if (command == null || !equals(command.getPlugin())) {
            command = getServer().getPluginCommand(this.getDescription().getName().toLowerCase(java.util.Locale.ENGLISH) + ":" + alias);
        }
        if (command != null && equals(command.getPlugin())) {
            return command;
        }
        return null;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return false;
    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        return null;
    }

    public void setLoader(BongePluginLoader loader){
        this.loader = loader;
    }
}
