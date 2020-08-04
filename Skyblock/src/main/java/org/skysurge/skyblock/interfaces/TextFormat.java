package org.skysurge.skyblock.interfaces;

import org.bukkit.ChatColor;

/**
 * Copy Right ©
 * This code is private
 * Owner: Christo
 * From: 10/22/19-2023
 * Any attempts to use these program(s) may result in a penalty of up to $1,000 USD
 **/

public interface TextFormat {

    public String name = ChatColor.translateAlternateColorCodes('&', "&bSkyBlock"),
            textColor = ChatColor.translateAlternateColorCodes('&', "&7"),
            numberColor = ChatColor.translateAlternateColorCodes('&', "&3"),
            infoColor = ChatColor.translateAlternateColorCodes('&', "&b"),
            boldColor = ChatColor.translateAlternateColorCodes('&', "&f"),
            linkColor = ChatColor.translateAlternateColorCodes('&', "&9"),
            prefix = ChatColor.translateAlternateColorCodes('&', "&bSkyBlock&1> &7"), whiteColor = ChatColor.WHITE + "",
            helpMessage = prefix + boldColor + "/" + textColor + "island " + boldColor + "<" + textColor
                    + "create, delete, home, tpa" + boldColor + ">",
            opHelpMessage = prefix + boldColor + "/" + textColor + "island " + boldColor + "<" + textColor
                    + "create, delete, home, tpa, info, tp" + boldColor + ">",
            permissionErrorMessage = prefix + textColor
                    + "Sorry, but you don't have permission to perform this action. Please contact an administrator if you think this is an error",
            commandError = prefix + textColor + "Error while executing command, try" + boldColor + ": /" + textColor
                    + "island ",
            playerErrorMessage = prefix + textColor + "Unable to find player, ";

}
