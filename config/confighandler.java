package com.expoding.modularcrafting.config;


import com.expoding.modularcrafting.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class confighandler
{

    public static void init(File configFile)
    {

        Configuration config = new Configuration(configFile);

        try
        {
            config.load();


            boolean configValue = config.get(Configuration.CATEGORY_GENERAL, "GenTest", "true", "Test").getBoolean(true);
            boolean hardmodeCrafting = config.get("Hardmode", "Hardmode", "true", "Make crafting recipes much more difficult").getBoolean(true);
            boolean hardmodeBookshelf = config.get("Hardmode", "Harder Bookshelves", "true", "Make The bookshelf upgrade require books to function").getBoolean(true);
            boolean enableCrafting = config.get(Reference.ADDON_CATEGORY, "Crafting", "true", "Enable the crafting upgrade").getBoolean(true);
            boolean enableSmelting = config.get(Reference.ADDON_CATEGORY, "Smelting", "true", "Enable the smelting upgrade").getBoolean(true);
            boolean enableStorage = config.get(Reference.ADDON_CATEGORY, "Storage", "true", "Enable the storage upgrade").getBoolean(true);
            boolean enableAnvil = config.get(Reference.ADDON_CATEGORY, "Anvil", "true", "Enable the anvil upgrade").getBoolean(true);
            boolean enableEnchantment = config.get(Reference.ADDON_CATEGORY, "Enchantment", "true", "Enable the enchantment upgrade").getBoolean(true);
            boolean enableLight = config.get(Reference.ADDON_CATEGORY, "Light", "true", "Enable the light upgrade").getBoolean(true);
            boolean enableTime = config.get(Reference.ADDON_CATEGORY, "Clock", "true", "Enable the clock upgrade").getBoolean(true);
            boolean enableLiquid = config.get(Reference.ADDON_CATEGORY, "Liquid", "true", "Enable the Liquid Storage Upgrade").getBoolean(true);
            int maxStructure = config.get(Reference.ADDON_CATEGORY, "StructuralMax", "5", "Set the maximum structural upgrade level (Max 5)").getInt(5);



        }

        catch(Exception e)
        {

        }

        finally
        {
            config.save();
        }
    }

}
