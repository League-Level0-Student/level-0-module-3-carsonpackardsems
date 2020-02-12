//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
// Type 12 for My Stick!!!!!!!
// Type 13 for Thinking Music!!!!
package _02_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String cats = JOptionPane.showInputDialog("How many cats you have?");
		Integer.parseInt(cats);
		int catss = Integer.parseInt(cats);
		if(catss >= 3) {
			if(catss <= 11) {
		JOptionPane.showMessageDialog(null, "You're a crazy cat lady!");
			}
		}
		if(catss <= 3) {
			if (catss > 1) {
				playVideo("https://www.youtube.com/watch?v=dGFSjKuJfrI");
			}
		}
		if(catss == 0) {
			playVideo("https://www.youtube.com/watch?v=VLVdjLbXdm4");
			playVideo("playVideo(\"https://www.youtube.com/watch?v=VLVdjLbXdm4\");");
		}
		//My Stick
		if (catss == 12) {
			playVideo("https://www.youtube.com/watch?v=yIdguuSqIug");
		}
		//Megolavania
		if (catss == 13) {
			playVideo("https://www.youtube.com/watch?v=H0YDbhBNJfY");
		}
		}
	//https://www.youtube.com/watch?v=H0YDbhBNJfY
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady

		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video

		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

