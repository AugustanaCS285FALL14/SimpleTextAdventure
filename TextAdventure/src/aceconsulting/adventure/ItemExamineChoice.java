package aceconsulting.adventure;

import aceconsulting.adventure.items.Item;

public class ItemExamineChoice extends ItemChoice {

	public ItemExamineChoice(Item theItem) {
		super("Examine " + theItem.getName(), theItem);
	}

}
