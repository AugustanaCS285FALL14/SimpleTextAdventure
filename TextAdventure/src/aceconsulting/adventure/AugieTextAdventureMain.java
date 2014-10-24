package aceconsulting.adventure;

import java.util.List;
import java.util.Scanner;

public class AugieTextAdventureMain {

	public static void main(String[] args) {
		World theWorld = new AugieDuckWorld();
		Player thePlayer = new Player(theWorld.getStartLocation());
	
		TextUI textDisplay=new TextUI(thePlayer);
		
		
	}

}
