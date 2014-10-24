package aceconsulting.adventure;

import java.util.List;

public class GraphicUI implements UI {

		@Override
		public void display(String s) {			
			//TODO: Add graphical code to display the string here...
		}

		@Override
		public Choice getChoice(List<Choice> choices) {
			// TODO: Add graphical code to get a choice from the user here...
			// Cheap way: use JOptionPane.  (But could make a better interface if we make a custom JDialog or JFrame...)
			
			return null;
		}
}
