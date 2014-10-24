package aceconsulting.adventure;

import aceconsulting.adventure.items.Item;

public class ItemPickUpChoice extends ItemChoice {

	public ItemPickUpChoice(Item theItem) {
		super("Pick up " + theItem.getName(), theItem);
	}

}
