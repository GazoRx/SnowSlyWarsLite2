package com.snowlight.arena;

import com.snowlight.core.Plugin;
import org.bukkit.event.Listener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ArenaManager implements Listener {

    private static List<Arena> loadedArenas = new ArrayList<>();

    public ArenaManager(){
        Plugin plugin = Plugin.getPlugin(Plugin.class);
        File folder = new File(plugin.getDataFolder(),"arenas");
        File[] arenas = folder.listFiles();

        if (folder.exists()) return;

        if (arenas != null){
            for (File item : arenas){
                if (item.isFile()){

                }
            }
        }

    }
    

}
