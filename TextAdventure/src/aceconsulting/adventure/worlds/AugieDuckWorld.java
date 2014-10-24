package aceconsulting.adventure.worlds;

import java.util.ArrayList;

import aceconsulting.adventure.Location;
import aceconsulting.adventure.MovementChoice;
import aceconsulting.adventure.World;
import aceconsulting.adventure.items.*;


public class AugieDuckWorld extends World {

	public AugieDuckWorld()
	{
		Location classroom = new Location("You are in a classroom with a rambling professor.");
		Location balcony = new Location("You are standing on a small balcony next to a broken window.");
		Location hallway = new Location("You are at the end of a hallway.");
		
		classroom.addMovementChoice(new MovementChoice("Exit to hallway", hallway));
		classroom.addMovementChoice(new MovementChoice("Pop out the window", balcony));
		
		balcony.addMovementChoice(new MovementChoice("Go back through the broken window", classroom));
		balcony.addItem(new RingItem("an emerald ring", 1));
		
		hallway.addMovementChoice(new MovementChoice("Go back into the classroom", classroom));
		hallway.addItem(new BasiliskItem("a menacing basilisk"));

		locations = new ArrayList<Location>();
		locations.add(classroom);
		locations.add(balcony);
		locations.add(hallway);
		
		this.setStartLocation(classroom);
		
	}
	
}
