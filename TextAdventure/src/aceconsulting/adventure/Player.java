package aceconsulting.adventure;

import java.util.ArrayList;
import java.util.List;

import aceconsulting.adventure.items.Item;

public class Player {
	// add inventory later
	private Location currentLoc;
	private List<Item> itemInventory;
	
	public Player(Location startLoc)
	{
		this.currentLoc = startLoc;	
		this.itemInventory = new ArrayList<Item>();
	}
	
	public Location getCurrentLoc() {
		return currentLoc;
	}

	public void moveTo(Location newLoc)
	{
		this.currentLoc = newLoc;
	}

	public void addItem(Item item) {
		itemInventory.add(item);
	}
	
	public void removeItem(Item item) {
		itemInventory.remove(item);
	}
	
	public List<Item> getInventoryItems()
	{
		return new ArrayList(itemInventory); // protective copy...
	}

	

}
