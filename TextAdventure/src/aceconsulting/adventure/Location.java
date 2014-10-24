package aceconsulting.adventure;

import java.util.ArrayList;
import java.util.List;

import aceconsulting.adventure.items.Item;

public class Location {

	private List<MovementChoice> movementChoices;
	private List<Item> itemsHere;
	private String description;

	public Location(String description) {
		this.description = description;
		this.movementChoices = new ArrayList<MovementChoice>();
		this.itemsHere = new ArrayList<Item>();
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<MovementChoice> getMovementChoices() {
		return movementChoices;
	}

	public void addMovementChoice(MovementChoice mChoice)
	{
		movementChoices.add(mChoice);
	}
	public void addItem(Item item)
	{
		itemsHere.add(item);
	}
	public void removeItem(Item item)
	{
		itemsHere.remove(item);
	}
	public List<Item> getItems()
	{
		return new ArrayList<Item>(itemsHere); // return a (protective) copy
	}
}
