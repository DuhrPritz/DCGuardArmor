package com.duhrpcraft.dev;
/**
 * @author Daniel R. Pritzker
 * @version 1.0
 */
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class GuardArmor extends JavaPlugin
{
  public void onEnable()
  {
    PluginManager manager = getServer().getPluginManager();
    manager.registerEvents(new GuardArmorListener(), this);
  }
}
