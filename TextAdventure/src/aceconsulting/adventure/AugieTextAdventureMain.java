package aceconsulting.adventure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aceconsulting.adventure.items.Item;
import aceconsulting.adventure.worlds.AugieDuckWorld;

public class AugieTextAdventureMain {

	public static void main(String[] args) {
		UI ui = new TextUI();
		
		World theWorld = new AugieDuckWorld();
		Player thePlayer = new Player(theWorld.getStartLocation());
		
		ui.display("Welcome to Simple Text Adventure! (Type 'q' to exit.)");
		
		while (true) {
			// display room description
			Location currentLoc = thePlayer.getCurrentLoc();
			System.out.println(currentLoc.getDescription());
			
			//get the item choices from the room & from the player
			List<MovementChoice> moveChoices = currentLoc.getMovementChoices();
			List<Choice> allChoices = new ArrayList<Choice>();
			allChoices.addAll(moveChoices);
			for (Item item : currentLoc.getItems())
			{
				allChoices.add(new ItemPickUpChoice(item));
			}
			for (Item item : thePlayer.getInventoryItems())
			{
				allChoices.add(new ItemUseChoice(item));
			}

			//allow the user to make their choice			
			Choice chosenChoice = ui.getChoice(allChoices);

			if (chosenChoice == null) // they want to quit
			{
				break;
			}
			else if (chosenChoice instanceof MovementChoice)
			{
				MovementChoice chosenMove = (MovementChoice) chosenChoice;
				Location newLoc = chosenMove.getDestination();
				thePlayer.moveTo(newLoc);
			}
			else if (chosenChoice instanceof ItemPickUpChoice)
			{
				Item item = ((ItemChoice) chosenChoice).getItem();
				thePlayer.addItem(item);
				currentLoc.removeItem(item);				
			}
			else if (chosenChoice instanceof ItemExamineChoice)
			{
				Item item = ((ItemChoice) chosenChoice).getItem();
				ui.display(item.examineItem());				
			}
			else if (chosenChoice instanceof ItemUseChoice)
			{
				Item item = ((ItemChoice) chosenChoice).getItem();
				item.use(thePlayer, ui);
			}
		}
		System.out.println("Cowardly adventurer -- you are not up to the challenge!");
	}

}
