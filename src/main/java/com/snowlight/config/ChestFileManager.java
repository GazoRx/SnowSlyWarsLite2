package com.snowlight.config;

import com.snowlight.core.Plugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ChestFileManager {

    private Plugin plugin = Plugin.getPlugin(Plugin.class);
    private FileConfiguration chestConfiguration = null;
    private File chestFile = null;

    public void setup() throws IOException {
        if (!plugin.getDataFolder().exists()){
            plugin.getDataFolder().mkdir();
        }

        chestFile = new File(plugin.getDataFolder(),"chest.yml");

        if (!chestFile.exists()){
            chestFile.createNewFile();
        }

        chestConfiguration = YamlConfiguration.loadConfiguration(chestFile);

    }

    public FileConfiguration getChestConfiguration(){
        return chestConfiguration;
    }

    public void saveFile() throws IOException {
        chestConfiguration.save(chestFile);
    }


}
