package at.auster.mycustomitems;

import at.auster.customitems.CustomItems;
import at.auster.customitems.items.CustomItem;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {
    @EventHandler
    public void chat(AsyncChatEvent event) {
        event.getPlayer().sendMessage(Component.text("Welp"));

        if (event.message().contains(Component.text("+-X")))  {
            event.getPlayer().getInventory().addItem(CustomItems.getItemManager().createItemStack(Test.class));

        }

    }
}
