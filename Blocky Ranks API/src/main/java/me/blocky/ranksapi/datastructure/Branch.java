package me.blocky.ranksapi.datastructure;

import java.util.List;
import java.util.Set;

import org.bukkit.Material;

public abstract class Branch {
  /**
   * Gets the branch name of this branch.
   */
  public abstract String getName();

  /**
   * Gets the parent branches of this branch (all branches that come before this
   * branch).
   */
  public abstract Set<Branch> getParentBranches();

  /**
   * Gets the child branches of this branch (all branches that come after this
   * branch).
   */
  public abstract Set<Branch> getChildBranches();

  /**
   * Gets all ranks in this branch.
   */
  public abstract List<Rank> getRanks();

  /**
   * Gets the Material that represents this rank in the gui.
   */
  public abstract Material getMaterial();
}
