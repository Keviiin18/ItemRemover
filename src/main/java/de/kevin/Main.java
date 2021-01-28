package de.kevin;

import de.kevin.commands.Clear;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("clear").setExecutor(new Clear());
    }

    @Override
    public void onDisable() {

    }
}
