package aceconsulting.adventure.items;

import aceconsulting.adventure.Player;
import aceconsulting.adventure.UI;

public class StaircaseItem extends Item {

	public StaircaseItem(String name) {
		super(name,1);
	}

	@Override
	public void performUseAction(Player user, UI ui) {
		ui.display("You couldn't use this staircase if your life depended on it.");
	}
	
	@Override
	public String examineItem() {
		return "You start walking up the stairs ... but they break.";
	}

}
