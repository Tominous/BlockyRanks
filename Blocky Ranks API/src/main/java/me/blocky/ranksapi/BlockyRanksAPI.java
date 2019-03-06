package me.blocky.ranksapi;

import java.util.Map;
import java.util.Set;

import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.entity.Player;

import me.blocky.ranksapi.datastructure.Rank;

public abstract class BlockyRanksAPI {

  /**
   * Get a map mapping world names to the rank identifiers of the ranks the player
   * holds in those worlds. If a player has no rank on a particular world, that
   * world will not be a key in this map. A rank with the specified identifiers
   * might not actually exist on this server (but it exists on a connected server
   * perhaps) so make sure you run this API method on the correct server.
   */
  public abstract Map<String, String> getPlayerRanks(OfflinePlayer player);

  /**
   * Get a map mapping world names to the ranks the player holds in those worlds.
   * If a player has no rank on a particular world, that world will not be a key
   * in this map. A rank that does not exist on the server this API is executed on
   * but might exist on another server will not be included in this map.
   */
  public abstract Map<String, Rank> getPlayerRanksOnServer(OfflinePlayer player);

  /**
   * Get the rank a player holds on their current world
   */
  public abstract Rank getPlayerRank(Player player);

  /**
   * Get the rank a player holds on the specified world
   */
  public abstract Rank getPlayerRank(OfflinePlayer player, String world);

  /**
   * Set the rank of a player on the their current world and all linked worlds.
   * Returns true of if the rank was set correctly on all worlds, false otherwise.
   * The rank does not necessarily have to exist.
   */
  public abstract boolean setPlayerRank(Player player, String rankIdentifier);

  /**
   * Set the rank of a player on the their current world and all linked worlds.
   * Returns true of if the rank was set correctly on all worlds, false otherwise.
   */
  public abstract boolean setPlayerRank(Player player, Rank rank);

  /**
   * Set the rank of a player on the specified world and all linked worlds Returns
   * true of if the rank was set correctly on all worlds, false otherwise. The
   * rank does not necessarily have to exist.
   */
  public abstract boolean setPlayerRank(OfflinePlayer player, String worldName, String rankIdentifier);

  /**
   * Set the rank of a player on the specified world and all linked worlds Returns
   * true of if the rank was set correctly on all worlds, false otherwise.
   */
  public abstract boolean setPlayerRank(OfflinePlayer player, String worldName, Rank rank);

  /**
   * @see {@link #getLinkedWorlds(String) getLinkedWorlds}
   */
  public abstract Set<String> getLinkedWorlds(World world);

  /**
   * Gets the set of worlds that are linked with the specified world
   */
  public abstract Set<String> getLinkedWorlds(String world);

  /**
   * Gets the set of linked world sets. Each string in each subset is the name of
   * a world. Each name will only be the member of one of the subsets, never more
   * than one. Each subset represents the set of worlds that share their ranks.
   * (Ranking up on one of the worlds means ranking up on all others in the
   * subset)
   */
  public abstract Set<Set<String>> getLinkedWorlds();

}