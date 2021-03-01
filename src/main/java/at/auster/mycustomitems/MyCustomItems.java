package at.auster.mycustomitems;

import at.auster.customitems.CustomItems;
import at.auster.customitems.api.CustomItemsAPI;
import at.auster.customitems.utils.BaseReflectionable;
import at.auster.customitems.utils.ReflectionUtils;
import jdk.internal.loader.AbstractClassLoaderValue;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

import java.sql.BatchUpdateException;
import java.sql.Ref;

public final class MyCustomItems extends JavaPlugin {


    @Override
    public void onEnable() {
        Bukkit.getLogger().severe(String.valueOf(CustomItems.getAPI().registerPackage(this)));
        Reflections reflections = new Reflections(new ConfigurationBuilder().setScanners(new SubTypesScanner()).addUrls(ClasspathHelper.forPackage("at.auster.mycustomitems")));
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, () -> {

            getLogger().severe(String.valueOf(reflections.getSubTypesOf(BaseReflectionable.class).size()));
            ReflectionUtils.getAllClassesWithInterface(BaseReflectionable.class).forEach( s -> Bukkit.getLogger().severe(s.getSimpleName()));
        }, 40);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
