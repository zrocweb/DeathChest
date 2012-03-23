package de.tobiyas.deathchest.chestpositions;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public interface ChestContainer {
	
	public Location getChestOfPlayer(World world, Player player);
	
	public boolean checkPlayerHasChest(World world, Player player);
	
	public boolean addChestToPlayer(Location location, Player player);
	
	public boolean hasWorld(World world);
	
	public boolean removeFromPosition(Location location);
	
}
