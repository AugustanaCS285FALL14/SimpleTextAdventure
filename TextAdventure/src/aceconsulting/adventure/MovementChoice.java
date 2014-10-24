package aceconsulting.adventure;

public class MovementChoice extends Choice {
	private Location destination;
	
	public MovementChoice(String description, Location destination) {
		super(description);
		this.destination = destination;
	}

	public Location getDestination() {
		return destination;
	}
	
	
}
