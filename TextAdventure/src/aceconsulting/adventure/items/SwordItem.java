package aceconsulting.adventure.items;

import aceconsulting.adventure.Player;

public class SwordItem extends Item {

	public SwordItem(String name) {
		super(name);
		
	}
	
	public void use(Player user) {
		super.use(user);
	}

	@Override
	public String examineItem() {
		return "A shiny sword that is very sharp";
		
	}

	
}
