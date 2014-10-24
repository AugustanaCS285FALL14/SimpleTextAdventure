package aceconsulting.adventure.items;

public class BasiliskItem extends Item {

	public BasiliskItem(String name) {
		super(name);
	}

	@Override
	public String examineItem() {
		return "A scary basilisk with emerald scales";		
	}

}
