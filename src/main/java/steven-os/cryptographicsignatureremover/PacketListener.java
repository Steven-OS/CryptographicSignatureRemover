package steven.os.cryptographicsignatureremover;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.PacketContainer;
import org.bukkit.plugin.Plugin;

/**
 *
 * Made by Steven-OS
 * https://github.com/Steven-OS
 *
 */
public class PacketListener extends PacketAdapter {

    public PacketListener(Plugin plugin) {
        super(plugin, ListenerPriority.NORMAL, PacketType.Play.Client.CHAT);
    }

    @Override
    public void onPacketReceiving(PacketEvent event) {
        // Documentation: https://wiki.vg/Protocol#Chat_Message_.28serverbound.29
        PacketContainer packet = event.getPacket();
        PacketType type = packet.getType();

        if (!type.equals(PacketType.Play.Client.CHAT)) return;
        packet.getBooleans().write(0, false);
    }
}
