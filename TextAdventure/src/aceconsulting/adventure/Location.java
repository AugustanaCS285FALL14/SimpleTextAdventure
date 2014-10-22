package aceconsulting.adventure;

import java.util.ArrayList;
import java.util.List;

public class Location {

	private List<MovementChoice> movementChoices;
	private String description;

	public Location(String description) {
		this.description = description;
		this.movementChoices = new ArrayList<MovementChoice>();
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
}
