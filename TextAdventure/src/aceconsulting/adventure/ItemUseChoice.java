package aceconsulting.adventure;

import aceconsulting.adventure.items.Item;

public class ItemUseChoice extends ItemChoice {

	public ItemUseChoice(Item theItem) {
		super("Use " + theItem.getName(), theItem);
	}

}
