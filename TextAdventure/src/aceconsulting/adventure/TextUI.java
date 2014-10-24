package aceconsulting.adventure;

import java.util.List;
import java.util.Scanner;

public class TextUI {
	public TextUI(Player user){
		System.out.println("Welcome to Simple Text Adventure! (Type 'q' to exit.)");
		Scanner console = new Scanner(System.in);
		String input = "";
		while (!input.equals("q")) {
			// print room description
			Location currentLoc = user.getCurrentLoc();
			System.out.println(currentLoc.getDescription());
			
			// show choices
			List<MovementChoice> moveChoices = currentLoc.getMovementChoices();
			for (int i = 0; i < moveChoices.size(); i++) {
				MovementChoice mc = moveChoices.get(i);
				System.out.print((i+1) + ". ");
				System.out.println(mc.getDescription());
			}

			// ask for input			
			input = console.nextLine();
			try {
				int choiceNum = Integer.parseInt(input);
				if(choiceNum>moveChoices.size()||choiceNum<=0){
					System.out.println("INVALID CHOICE! Choose one of the options below.");
					System.out.println();
				}
				else{
				MovementChoice chosenMove = moveChoices.get(choiceNum-1);
				Location newLoc = chosenMove.getDestination();
				user.moveTo(newLoc);
				}
				
			} catch (NumberFormatException ex) {
				if (!input.equals("q")) {
					System.out.println();
					System.out.println("I'm sorry, I didn't understand that command.");
					System.out.println("Please choose a number from the list, or type 'q' to quit.");
					System.out.println();
				}
			}
		}
		System.out.println("Cowardly adventurer -- you are not up to the challenge!");
		console.close();
	}
}
