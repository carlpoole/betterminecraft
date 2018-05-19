package codes.carl.Better;

import codes.carl.Better.commands.Kit;
import codes.carl.Better.events.MobGriefing;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        Main.instance = this;

        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled.");
    }

    private void registerCommands() {
        this.getCommand("kit").setExecutor(new Kit());
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new MobGriefing(), this);
    }

}
