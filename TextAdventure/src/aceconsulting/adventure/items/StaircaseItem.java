package aceconsulting.adventure.items;

import aceconsulting.adventure.Player;

public class StaircaseItem extends Item {

	public StaircaseItem(String name) {
		super(name,1);
	}

	public void use(Player user) {
		super.use(user);
		String resule = examineItem();
	}
	
	@Override
	public String examineItem() {
		return "You start walking up the stairs ... but they break.";
	}

}
