package aceconsulting.adventure.items;

import aceconsulting.adventure.Player;
import aceconsulting.adventure.UI;

public class ChainsawItem extends Item {

	public ChainsawItem(String name) {
		super(name,1);
	}

	@Override
	public void performUseAction(Player user, UI ui) {
		// Game logic for chainsaw duel
	}
	
	@Override
	public String examineItem() {
		return null;
	}

}
