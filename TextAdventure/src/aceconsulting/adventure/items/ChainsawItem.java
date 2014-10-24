package aceconsulting.adventure.items;

import aceconsulting.adventure.Player;

public class ChainsawItem extends Item {

	public ChainsawItem(String name) {
		super(name,1);
	}

	public void use(Player user) {
		super.use(user);
		
		// Game logic for chainsaw duel
	}
	
	@Override
	public String examineItem() {
		return null;
	}

}
