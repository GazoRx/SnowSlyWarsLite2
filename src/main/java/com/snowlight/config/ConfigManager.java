package com.snowlight.config;

import com.snowlight.core.Plugin;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {

    private static FileConfiguration manager;

    public static void setupManager(Plugin plugin){
         ConfigManager.manager = plugin.getConfig();
         plugin.saveDefaultConfig();
    }

}
