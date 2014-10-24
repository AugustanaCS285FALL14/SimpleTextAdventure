package aceconsulting.adventure;
import java.util.ArrayList;

public class NewWorld extends World {
	public NewWorld()
	{
		Location basement = new Location("You are in a dark basement. You can't see anything except a few stairs at the top of the staircase in front of you; light is coming from under a door.");
		Location wall = new Location("You have slammed your head into a wall and died.");
		Location underTheStairs = new Location("You are under the staircase. It is still too dark to see.");
		Location underTheStairs2 = new Location("You are under the staircase. A hidden passage opened up before you on the back wall.");
		Location staircase = new Location("You are standing in front of the staircase.");
		Location secretPassage = new Location("You are in the secret passage behind the stairs. The walls are dirty rock lit by candles on both sides leading into darkness.");
		Location storeroom = new Location("You are in a storage room of some kind. There is a closet on the right and a dumbwaiter on the back wall.");
		Location storeroom2 = new Location("A masked man jumped out of a closet holding a revving chainsaw. The secret passage closed behind you. You can hear the dumbwaiter slowly scraping down above the room.");
		Location chainsawMan = new Location("You have slammed your head into the chainsaw man and died.");
		
		basement.addMovementChoice(new MovementChoice("Become frustrated with your predicament and start sprinting into the darkness", wall));
		wall.addMovementChoice(new MovementChoice("Restart?", basement));
		basement.addMovementChoice(new MovementChoice("Feel your way forward along the wall", staircase));
		staircase.addMovementChoice(new MovementChoice("Go back into the darkness of the basement", basement));
		staircase.addMovementChoice(new MovementChoice("Feel your way around the stairs", underTheStairs));
		underTheStairs.addMovementChoice(new MovementChoice("Return to the basement where you began", basement));
		underTheStairs.addMovementChoice(new MovementChoice("Feel the back wall with your hand", underTheStairs2));
		underTheStairs2.addMovementChoice(new MovementChoice("Return to the basement where you began", basement));
		underTheStairs2.addMovementChoice(new MovementChoice("Enter the secret passage that opened", secretPassage));
		
		secretPassage.addMovementChoice(new MovementChoice("Walk through the narrow passageway", storeroom));
		secretPassage.addMovementChoice(new MovementChoice("Return to the basement under the stairs", underTheStairs));
		storeroom.addMovementChoice(new MovementChoice("Try to activate the dumbwaiter to go up", storeroom2));
		storeroom2.addMovementChoice(new MovementChoice("Become frustrated with your predicament and sprint toward the chainsaw man", chainsawMan));
		chainsawMan.addMovementChoice(new MovementChoice("Restart?", basement));
		

		locations = new ArrayList<Location>();
		locations.add(basement);
		locations.add(underTheStairs);
		locations.add(staircase);
		locations.add(secretPassage);
		locations.add(wall);
		locations.add(underTheStairs2);
		locations.add(storeroom);
		locations.add(storeroom2);
		locations.add(chainsawMan);
		
		this.setStartLocation(basement);
	}
}