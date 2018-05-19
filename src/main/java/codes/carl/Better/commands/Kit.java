package codes.carl.Better.commands;


import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.ServerOperator;

public class Kit implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.isOp()) {
                ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
                ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
                ItemStack pick = new ItemStack(Material.DIAMOND_PICKAXE, 1);
                ItemStack hoe = new ItemStack(Material.DIAMOND_HOE, 1);
                ItemStack shovel = new ItemStack(Material.DIAMOND_SPADE, 1);

                sword.addEnchantment(Enchantment.MENDING, 1);
                sword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                sword.addEnchantment(Enchantment.DURABILITY, 3);
                sword.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
                sword.addEnchantment(Enchantment.SWEEPING_EDGE, 3);

                axe.addEnchantment(Enchantment.MENDING, 1);
                axe.addEnchantment(Enchantment.DURABILITY, 3);
                axe.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                axe.addEnchantment(Enchantment.DIG_SPEED, 5);

                pick.addEnchantment(Enchantment.MENDING, 1);
                pick.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
                pick.addEnchantment(Enchantment.DURABILITY, 3);
                pick.addEnchantment(Enchantment.DIG_SPEED, 5);

                shovel.addEnchantment(Enchantment.MENDING, 1);
                shovel.addEnchantment(Enchantment.DURABILITY, 3);
                shovel.addEnchantment(Enchantment.SILK_TOUCH, 1);
                shovel.addEnchantment(Enchantment.DIG_SPEED, 5);

                ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
                ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
                ItemStack legs = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
                ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);

                helmet.addEnchantment(Enchantment.MENDING, 1);
                helmet.addEnchantment(Enchantment.DURABILITY, 3);
                helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                chest.addEnchantment(Enchantment.MENDING, 1);
                chest.addEnchantment(Enchantment.DURABILITY, 3);
                chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                legs.addEnchantment(Enchantment.MENDING, 1);
                legs.addEnchantment(Enchantment.DURABILITY, 3);
                legs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                boots.addEnchantment(Enchantment.MENDING, 1);
                boots.addEnchantment(Enchantment.DURABILITY, 3);
                boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                boots.addEnchantment(Enchantment.PROTECTION_FALL, 4);

                player.getInventory().setItemInMainHand(sword);
                player.getInventory().setBoots(boots);
                player.getInventory().setChestplate(chest);
                player.getInventory().setLeggings(legs);
                player.getInventory().setBoots(boots);
                player.getInventory().setHelmet(helmet);

                player.getInventory().addItem(axe,pick,hoe,shovel);

                player.sendMessage("Kit received!");

                return true;

            } else {
                player.sendMessage("You are not permitted to use this command.");
                return false;
            }

        }

        return true;
    }
}