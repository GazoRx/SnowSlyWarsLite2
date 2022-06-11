package com.snowlight.config;

import com.snowlight.core.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

public class ArenaFileManager {

    private Plugin plugin = Plugin.getPlugin(Plugin.class);
    private FileConfiguration dataConfig = null;
    private File configFile = null;

    public ArenaFileManager(String arena){
        if (!(plugin.getDataFolder().exists())){
            plugin.getDataFolder().mkdir();
        }
        File arenaFile = new File(plugin.getDataFolder(),"arenas");
        if (!arenaFile.exists()){
            arenaFile.mkdir();
        }

        configFile = new File(arenaFile,arena+".yml");

        if (!configFile.exists()){
            try {
                configFile.createNewFile();
                Bukkit.getServer().getLogger().log(Level.INFO, ChatColor.GREEN + arena+".yml başarılı bir şekilde oluşturuldu!");
            }catch (IOException exception){
                exception.printStackTrace();
                Bukkit.getServer().getLogger().log(Level.WARNING, ChatColor.RED + arena+".yml oluşturulamadı!");
            }
        }

        dataConfig = YamlConfiguration.loadConfiguration(configFile);

    }

    public void savePlayers() {
        try {
            dataConfig.save(configFile);
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Dosya kaydedildi.");

        } catch (IOException e) {
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Dosya kaydedilemedi.");
        }
    }



}
