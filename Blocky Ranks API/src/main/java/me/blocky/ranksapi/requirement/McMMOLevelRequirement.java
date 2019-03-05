package me.blocky.ranksapi.requirement;

import java.util.List;

public interface McMMOLevelRequirement extends Requirement {
  /**
   * Gets a list of skills whose levels get summed up
   */
  public List<String> getMcMMOSkills();

  /**
   * Gets the threshold minimum total level from the sum of all skills tracked to
   * meet this requirement
   */
  public int getMinimumTotalLevels();
}