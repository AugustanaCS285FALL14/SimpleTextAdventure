package aceconsulting.adventure.items;

import aceconsulting.adventure.Player;

public class RingItem extends Item {

	public RingItem(String name, int howManyUsesRemain) {
		super(name, howManyUsesRemain);
	}
	
	public void use(Player user) {
		super.use(user);
	}

	@Override
	public String examineItem() {
		return "A mysterious emerald ring with special powers...";		
	}

}
