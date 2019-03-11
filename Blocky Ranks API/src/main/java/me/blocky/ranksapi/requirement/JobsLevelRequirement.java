package me.blocky.ranksapi.requirement;

import java.util.List;

public interface JobsLevelRequirement extends Requirement {
  /**
   * Gets a list of jobs (as Strings) whose levels get summed up
   */
  public List<String> getJobNames();

  /**
   * Gets the threshold minimum total level from the sum of all jobs tracked to
   * meet this requirement
   */
  public int getMinimumTotalLevels();
}
