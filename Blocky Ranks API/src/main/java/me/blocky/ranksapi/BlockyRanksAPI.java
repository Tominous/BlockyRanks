package me.blocky.ranksapi;

import org.bukkit.OfflinePlayer;

import me.blocky.ranksapi.datastructure.Rank;

public abstract class BlockyRanksAPI {
  public abstract Rank getPlayerRank(OfflinePlayer player, String world);
}
