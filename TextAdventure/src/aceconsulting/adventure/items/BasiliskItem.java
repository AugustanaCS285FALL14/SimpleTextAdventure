package aceconsulting.adventure.items;

import aceconsulting.adventure.Player;
import aceconsulting.adventure.UI;

public class BasiliskItem extends Item {

	public BasiliskItem(String name) {
		super(name);
	}

	@Override
	public String examineItem() {
		return "A scary basilisk with emerald scales";		
	}

	@Override
	protected void performUseAction(Player user, UI ui) {
		ui.display("You think for 20 minutes about how you would use a Basilisk, and then give up.");
		
	}

}
