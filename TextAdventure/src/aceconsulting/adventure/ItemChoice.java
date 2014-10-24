package aceconsulting.adventure;

import aceconsulting.adventure.items.Item;

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
