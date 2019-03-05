package me.blocky.ranksapi.requirement;

import java.util.List;
import org.bukkit.Statistic;

public interface DistanceTraveledRequirement extends Requirement {
  /**
   * Gets the list of statistics that are being tracked by this requirement
   */
  public List<Statistic> getTrackedStatistics();
  
  /**
   * Gets minimum total distance traveled in blocks by any of the methods 
   * tracked by the statistics in order to meet this requirement
   */
  public int getMinimumTotalDistance();
}
