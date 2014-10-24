package aceconsulting.adventure.items;

import aceconsulting.adventure.Location;
import aceconsulting.adventure.Player;
import aceconsulting.adventure.UI;

public class RingItem extends Item {

	public RingItem(String name, int howManyUsesRemain) {
		super(name, howManyUsesRemain);
	}
	
	@Override
	public void performUseAction(Player user, UI ui) {
		Location current = user.getCurrentLoc();
		for (Item item : current.getItems())
		{
			if (item instanceof BasiliskItem)
			{				
				current.removeItem(item);
				ui.display("A giant duck swoops through a broken window, into the hall, and sings the \"quack quack I'm a duck\" song until the basilisk dies of boredom and disgust.");
			}
		}
	}

	@Override
	public String examineItem() {
		return "A mysterious emerald ring with special powers...";		
	}

}
