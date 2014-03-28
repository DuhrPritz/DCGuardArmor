package com.duhrpcraft.dev;

/**
 * @author Daniel R. Pritzker
 * @version 1.0
 */

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Color;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.event.EventPriority;

public class GuardArmorListener implements Listener {
  @EventHandler
  public void onClick(InventoryClickEvent event)
  {
    if ((event.getSlotType() == InventoryType.SlotType.ARMOR) && (event.getWhoClicked().hasPermission("GuardArmor.remove")))
    {
      Player player = (Player)event.getWhoClicked();
      player.sendMessage(ChatColor.RED + "NIGGA DON'T EVEN THINK ABOUT IT.");
      event.setCancelled(true);
    }
  }
  
  @EventHandler
  public void onDeath(PlayerDeathEvent event)
  {
    if (event.getEntity().hasPermission("GuardArmor.trainee"))
    {
      event.getDrops().clear();     
      
      ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
      ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
      ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
      ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
      
      helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
      chestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
      leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
      boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
      
      LeatherArmorMeta LAM = (LeatherArmorMeta) helmet.getItemMeta();
      
      LAM.setColor(Color.RED);

      helmet.setItemMeta(LAM);
      chestplate.setItemMeta(LAM);
      leggings.setItemMeta(LAM);
      boots.setItemMeta(LAM);

      event.getDrops().add(helmet);
      event.getDrops().add(chestplate);
      event.getDrops().add(leggings);
      event.getDrops().add(boots);
    }
    if (event.getEntity().hasPermission("GuardArmor.guard"))
    {
      event.getDrops().clear();     
      
      ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
      ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
      ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
      ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
      
      helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
      chestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
      leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
      boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
      
      LeatherArmorMeta LAM = (LeatherArmorMeta) helmet.getItemMeta();
      
      LAM.setColor(Color.GREEN);

      helmet.setItemMeta(LAM);
      chestplate.setItemMeta(LAM);
      leggings.setItemMeta(LAM);
      boots.setItemMeta(LAM);

      event.getDrops().add(helmet);
      event.getDrops().add(chestplate);
      event.getDrops().add(leggings);
      event.getDrops().add(boots);
    }
    if (event.getEntity().hasPermission("GuardArmor.senior"))
    {
      event.getDrops().clear();     
      
      ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
      ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
      ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
      ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
      
      helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      chestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      
      LeatherArmorMeta LAM = (LeatherArmorMeta) helmet.getItemMeta();
      
      LAM.setColor(Color.PURPLE);

      helmet.setItemMeta(LAM);
      chestplate.setItemMeta(LAM);
      leggings.setItemMeta(LAM);
      boots.setItemMeta(LAM);

      event.getDrops().add(helmet);
      event.getDrops().add(chestplate);
      event.getDrops().add(leggings);
      event.getDrops().add(boots);
    }
    if (event.getEntity().hasPermission("GuardArmor.regulator"))
    {
      event.getDrops().clear();     
      
      ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
      ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
      ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
      ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
      
      helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
      chestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
      leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
      boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
      
      LeatherArmorMeta LAM = (LeatherArmorMeta) helmet.getItemMeta();
      
      LAM.setColor(Color.YELLOW);

      helmet.setItemMeta(LAM);
      chestplate.setItemMeta(LAM);
      leggings.setItemMeta(LAM);
      boots.setItemMeta(LAM);

      event.getDrops().add(helmet);
      event.getDrops().add(chestplate);
      event.getDrops().add(leggings);
      event.getDrops().add(boots);
    }
    
    else if (event.getEntity().hasPermission("GuardArmor.dropnothing"))
    {
      event.getDrops().clear();
    }
  }

    @EventHandler(priority = EventPriority.HIGH)
  public void onRespawn(PlayerRespawnEvent event)
  {
      Player p = event.getPlayer();
      PlayerInventory pi = p.getInventory();
      
   if (p.hasPermission("GuardArmor.trainee"))
    {
      ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
      ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
      ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
      ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
      
      helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      chestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      
      helmet.addEnchantment(Enchantment.PROTECTION_FIRE, 2);
      chestplate.addEnchantment(Enchantment.PROTECTION_FIRE, 2);
      leggings.addEnchantment(Enchantment.PROTECTION_FIRE, 2);
      boots.addEnchantment(Enchantment.PROTECTION_FIRE, 2);
      
      ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
      sword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
      sword.addEnchantment(Enchantment.FIRE_ASPECT, 1);
      
      pi.setHelmet(helmet);
      pi.setChestplate(chestplate);
      pi.setLeggings(leggings);
      pi.setBoots(boots);
      pi.addItem(sword);
    }
    if (p.hasPermission("GuardArmor.guard"))
    {
      ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
      ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
      ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
      ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);    
      
      helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      chestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
      
      helmet.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
      chestplate.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
      leggings.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
      boots.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
      
      ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
      sword.addEnchantment(Enchantment.DAMAGE_ALL, 4);
      sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
      
      pi.setHelmet(helmet);
      pi.setChestplate(chestplate);
      pi.setLeggings(leggings);
      pi.setBoots(boots);
      pi.addItem(sword);

    }
    if (p.hasPermission("GuardArmor.senior"))
    {
      ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
      ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
      ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
      ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);  
      
      helmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
      chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
      leggings.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
      boots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
      
      helmet.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
      chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
      leggings.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
      boots.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
      
      helmet.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
      chestplate.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
      leggings.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
      boots.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
      
      ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
      sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
      sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
      sword.addEnchantment(Enchantment.KNOCKBACK, 2);
      
      pi.setHelmet(helmet);
      pi.setChestplate(chestplate);
      pi.setLeggings(leggings);
      pi.setBoots(boots);
      pi.addItem(sword);
      

    }
    if (p.hasPermission("GuardArmor.regulator"))
    {
      ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
      ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
      ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
      ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
      
      helmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
      chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
      leggings.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
      boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
      
      helmet.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
      chestplate.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
      leggings.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
      boots.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
      
      ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
      sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
      sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
      sword.addEnchantment(Enchantment.KNOCKBACK, 2);
      
      pi.setHelmet(helmet);
      pi.setChestplate(chestplate);
      pi.setLeggings(leggings);
      pi.setBoots(boots);
      pi.addItem(sword);
  
    }
  }
}