package at.auster.mycustomitems;


import at.auster.customitems.CustomItems;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyCustomItems extends JavaPlugin {
    public static JavaPlugin INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
        CustomItems.getItemManager().load(Test.class, Test2.class);
        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);
        getLogger().severe("LOGGG " +CustomItems.getItemManager().items.size());





    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
