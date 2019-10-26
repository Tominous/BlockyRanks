package me.blocky.ranksapi.datastructure;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.blocky.ranksapi.requirement.Requirement;

public abstract class Rank {
  /**
   * Gets the rank identifier of this rank.
   */
  public abstract String getIdentifier();

  /**
   * Gets the name of the rank as displayed to the user in the gui.
   * Can contain ChatColor color codes.
   */
  public abstract String getDisplayName();

  /**
   * Gets the list of requirements needed to rank up to this rank.
   */
  public abstract List<Requirement> getRequirements();

  /**
   * Gets the list of perks this rank provides
   */
  public abstract List<String> getPerks();

  /**
   * Gets the list of commands that get executed when a player ranks up to this rank.
   */
  public abstract List<String> getCommands();

  /**
   * Gets the branch this rank is a part of.
   */
  public abstract Branch getBranch();

  /**
   * Gets the Material that represents this rank in the gui.
   */
  @Deprecated
  public abstract Material getMaterial();

  /**
   * Gets a clone of the item that represents this rank in the gui.
   */
  public abstract ItemStack getItemStack();
}
