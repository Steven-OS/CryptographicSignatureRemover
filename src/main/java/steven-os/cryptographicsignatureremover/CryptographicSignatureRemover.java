package steven.os.cryptographicsignatureremover;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * Made by Steven-OS
 * https://github.com/Steven-OS
 *
 */
public final class CryptographicSignatureRemover extends JavaPlugin {

    @Override
    public void onEnable() {
        ProtocolManager protocolManager = ProtocolLibrary.getProtocolManager();
        protocolManager.addPacketListener(new PacketListener(this));
    }
}
