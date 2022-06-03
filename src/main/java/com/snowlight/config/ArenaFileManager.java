package com.snowlight.config;

import com.snowlight.core.Plugin;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;

public class ArenaFileManager {

    private Plugin plugin = Plugin.getPlugin(Plugin.class);
    private FileConfiguration dataConfig = null;
    private File configFile = null;

    public void setup(){
        if (!(plugin.getDataFolder().exists())){
            plugin.getDataFolder().mkdir();
        }
        File arenaFile = new File(plugin.getDataFolder(),"arenas");
        if (!arenaFile.exists()){
            arenaFile.mkdir();
        }

        configFile = new File()

    }


}
