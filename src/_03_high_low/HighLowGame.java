//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.net.URI;
import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for(int i = 0; i < 10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String Number = JOptionPane.showInputDialog("Pick a number, any number.");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
Integer.parseInt(Number);
int newNumber = Integer.parseInt(Number);
			// 5. if the guess is correct
if(newNumber == random) {
	JOptionPane.showMessageDialog(null, "Winner, winner! Your prize is...");
	playVideo("https://www.youtube.com/watch?v=myCMaPRFIPc");
}
else if(newNumber >= random) {
	JOptionPane.showMessageDialog(null, "Too high.");
}
else if(newNumber <= random) {
	JOptionPane.showMessageDialog(null, "Too low.");
}
		// 13. Tell them they lose
		}
		
	}
	static void playVideo(String videoURL){
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


