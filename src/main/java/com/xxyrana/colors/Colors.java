package com.xxyrana.colors;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 
 * @author xxyrana
 *
 */
public class Colors extends JavaPlugin implements Listener {
	private static final Logger log = Logger.getLogger("Minecraft");

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {
		log.info(String.format("[%s] Disabled Version %s", getDescription().getName(), getDescription().getVersion()));
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("colors")) { // If the player typed /basic then do the following...
			sender.sendMessage("§0&0 §1&1 §2&2 §3&3 §4&4 §5&5 §6&6 §7&7");
			sender.sendMessage("§8&8 §9&9 §a&a §b&b §c&c §d&d §e&e §f&f");
			sender.sendMessage("§r§k&k§r §l&l§r §m&m§r §n&n§r §o&o§r &r(reset)");
			return true;
		}
		return false; 
	}
}
