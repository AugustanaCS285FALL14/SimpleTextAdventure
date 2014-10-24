package aceconsulting.adventure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AugieTextAdventureMain {

	public static void main(String[] args) {
		UI ui = new TextUI();
		
		World theWorld = new AugieDuckWorld();
		Player thePlayer = new Player(theWorld.getStartLocation());
		
		ui.display("Welcome to Simple Text Adventure! (Type 'q' to exit.)");
		int userChoice;
		
		while (true) {
			// print room description
			Location currentLoc = thePlayer.getCurrentLoc();
			System.out.println(currentLoc.getDescription());
			
			// show choice
			List<MovementChoice> moveChoices = currentLoc.getMovementChoices();
			//get the item choices from the room & from the player
			List<Choice> allChoices = new ArrayList<Choice>();
			allChoices.addAll(moveChoices);
			
			Choice chosenChoice = ui.getChoice(allChoices);

			if (chosenChoice == null)
			{
				break;
			}
			if (chosenChoice instanceof MovementChoice)
			{
				MovementChoice chosenMove = (MovementChoice) chosenChoice;
				Location newLoc = chosenMove.getDestination();
				thePlayer.moveTo(newLoc);
			}
		}
		System.out.println("Cowardly adventurer -- you are not up to the challenge!");
	}

}
