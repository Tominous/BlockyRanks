package me.blocky.ranksapi.requirement;

public interface PlayerMoneyRequirement extends Requirement {
  /**
   * Gets the minimum amount of money needed to meet this requirement
   */
  public double getMinimumMoney();
}
