package aceconsulting.adventure;

import java.util.ArrayList;

public class NoScopeLand extends World {

	public NoScopeLand()
	{
		Location house = new Location("You are in a house. the place looks ransacked and you see stairs heading down to a basement.");
		Location valley = new Location("You are standing in a valley with very little cover, at the other end you see a fountain.");
		Location fountain = new Location("You are standing in front of a fountain riddled with bulletholes.");
		Location meadow = new Location("You find yourself in a meadow, a house towers before you and a valley is at your back. Gunshots can be heard in a forrest in the distance.");
		Location basement = new Location("You are in the basement with a supply of Doritos and Mountain Dew");
		Location forrest = new Location("You stand in a forrest, bullets pelt the trees around you.");
		Location fray = new Location("A man in the darkness yells \"360 NOSCOPE! LOLZ!\". With no weapon to defend yourself, you die pathetically and unvaliantly");
		
		house.addMovementChoice(new MovementChoice("Exit house", meadow));
		house.addMovementChoice(new MovementChoice("Enter the basement", basement));
		basement.addMovementChoice(new MovementChoice("Get back to the house", house));
		meadow.addMovementChoice(new MovementChoice("Head into the valley", valley));
		meadow.addMovementChoice(new MovementChoice("Enter the house", house));
		meadow.addMovementChoice(new MovementChoice("Into the forrest", forrest));
		valley.addMovementChoice(new MovementChoice("Inspect the fountain.", fountain));
		valley.addMovementChoice(new MovementChoice("Return to the meadow.", meadow));
		fountain.addMovementChoice(new MovementChoice("Back into the valley", valley));
		forrest.addMovementChoice(new MovementChoice("Back to the meadow", meadow));
		forrest.addMovementChoice(new MovementChoice("Into the fray!", fray));
		fray.addMovementChoice(new MovementChoice("Restart", meadow));
		

		locations = new ArrayList<Location>();
		locations.add(house);
		locations.add(valley);
		locations.add(fountain);
		locations.add(meadow);
		locations.add(basement);
		locations.add(forrest);
		
		this.setStartLocation(meadow);
		
	}
}