package me.blocky.ranksapi.requirement;

public interface VotingRequirement extends Requirement {
  /**
   * Gets the list of metrics that are being considered by this requirement
   */
  public String getVotingMetric();

  /**
   * Gets minimum total number of votes needed in all of the metrics together
   * in order to meet this requirement
   */
  public int getMinimumVotes();
}
