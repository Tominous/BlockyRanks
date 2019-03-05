package me.blocky.ranksapi.requirement;

public interface PlaytimeRequirement extends Requirement {
  /**
   * Gets the minimum number of seconds of play-time on the server 
   * needed to meet this requirement.
   */
  public long getMinimumPlaytime();
}