package aceconsulting.adventure.items;

import aceconsulting.adventure.Player;
import aceconsulting.adventure.UI;

public abstract class Item {
	private String name;
	private int howManyUsesRemain;
	
	/**
	 * @param name - what is the item called?
	 * @param howManyUsesRemain - how many times can it be used before it goes away?\                        
	 */
	public Item(String name, int howManyUsesRemain)
	{
		this.name = name;
		this.howManyUsesRemain = howManyUsesRemain;
	}
	/**
	 * Creates an item with the given name & (basically) unlimited uses.
	 * @param name - what is the item called?
	 */
	public Item(String name)
	{
		this(name,Integer.MAX_VALUE);
	}
	 
	public String getName()
	{
		return this.name;
	}
	public int getHowManyUsesRemain()
	{
		return this.howManyUsesRemain;
	}
	
	public final void use(Player user, UI ui)
	{
		this.howManyUsesRemain--;
		if (this.howManyUsesRemain == 0)
		{
			user.removeItem(this);
		}
		performUseAction(user, ui);
		// after this method, the subclass will do the actual use() stuff...
	}
	protected abstract void performUseAction(Player user, UI ui);
	
	public abstract String examineItem();
}
