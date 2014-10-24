package aceconsulting.adventure;

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
	
	/** special item subclasses should override this method,
	 * and they should ALWAYS call super.use() at the start of their method?
	 * @param user
	 */
	public void use(Player user)
	{
		this.howManyUsesRemain--;
		if (this.howManyUsesRemain == 0)
		{
			//TODO: remove from player inventory?
		}
		// after this method, the subclass will do the actual use() stuff...
	}
}
