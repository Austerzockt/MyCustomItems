package at.auster.mycustomitems;

import at.auster.customitems.CustomItems;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatListener implements Listener {
    @EventHandler
    public void chat(AsyncChatEvent event) {
        event.getPlayer().sendMessage(Component.text("Welp"));

        if (event.message().contains(Component.text("+-X")))  {
            event.getPlayer().getInventory().addItem(CustomItems.getItemManager().createItemStack(Test.class));

        }

    }
}
