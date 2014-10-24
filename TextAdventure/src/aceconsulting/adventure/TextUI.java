package aceconsulting.adventure;

import java.util.List;
import java.util.Scanner;

public class TextUI implements UI {
	Scanner console;
	public TextUI()
	{
		console = new Scanner(System.in);		
	}
	
	@Override
	public void display(String msg) {
		System.out.println(msg);
		
	}

	/**
	 * Returns the chosen player choice , or null if they want to quit.
	 */
	@Override
	public Choice getChoice(List<Choice> choices) {
		
		while (true) {
			for (int i = 0; i < choices.size(); i++) {
				Choice mc = choices.get(i);
				System.out.print((i+1) + ". ");
				System.out.println(mc.getDescription());
			}
	
			// ask for input			
			String input = console.nextLine();
			try {
				int choiceNum = Integer.parseInt(input);
				if(choiceNum>choices.size()||choiceNum<=0){
					System.out.println("INVALID CHOICE! Choose one of the options below.");
					System.out.println();
				}
				else{
					return  choices.get(choiceNum-1);
				}
			} catch (NumberFormatException ex) {
				if (!input.equals("q")) {
					System.out.println();
					System.out.println("I'm sorry, I didn't understand that command.");
					System.out.println("Please choose a number from the list, or type 'q' to quit.");
					System.out.println();
				}
				else {
					return null;					
				}
			}

		}
		
		
	}

	
}
