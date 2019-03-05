package me.blocky.ranksapi.requirement;

public interface PlayerExperienceRequirement extends Requirement {
  /**
   * Gets the minimum number of levels needed to meet this requirement
   */
  public int getMinimumExperience();
}
