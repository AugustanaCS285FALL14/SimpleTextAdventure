package aceconsulting.adventure;

public abstract class ItemChoice extends Choice {
	Item theItem;
	
	public ItemChoice(String description, Item theItem) {
		super(description);
		this.theItem = theItem;
	}

	public Item getItem() {
		return theItem;
	}	
	

	
}
