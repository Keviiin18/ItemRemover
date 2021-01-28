package de.kevin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //First Line
        System.out.println("Hello World");

    }

    @Override
    public void onDisable() {

        System.out.println("Plugin aus!");

    }
}
