package aceconsulting.adventure.items;

import aceconsulting.adventure.Player;
import aceconsulting.adventure.UI;

public class SwordItem extends Item {

	public SwordItem(String name) {
		super(name);
		
	}
	
	@Override
	public void performUseAction(Player user, UI ui) {
		ui.display("You prance and wave the sword until you poke yourself in the foot.  Ouch!");
	}

	@Override
	public String examineItem() {
		return "A shiny sword that is very sharp";
		
	}

	
}
