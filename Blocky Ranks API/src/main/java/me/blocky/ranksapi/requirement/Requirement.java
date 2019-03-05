package me.blocky.ranksapi.requirement;

import org.bukkit.entity.Player;

public interface Requirement {
    
  /**
   * Indicates whether the player meets the requirement or not
   */
  public abstract boolean isMet(Player player);
  
  /**
   * Indicates whether the requirement is met for all players or not
   * (e.g. playtime requirement of 0 seconds is true for all players)
   */
  public abstract boolean isAlwaysMet();
  
  /**
   * Indicates whether the required amount of the requirement specific resource
   * gets deducted when ranking up or not
   */
  public abstract boolean getsDeducted();
}
