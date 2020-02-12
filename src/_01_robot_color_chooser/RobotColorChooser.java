//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;
		Robot koalanoise = new Robot();
		//3. Ask the user what color they would like the robot to draw
	String color = JOptionPane.showInputDialog("What color would you like me to draw in, Red, Orange, Yellow, Green, or Blue?");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equalsIgnoreCase("Red")){
koalanoise.setPenColor(Color.RED);	
}
else if(color.equalsIgnoreCase("Orange")) {
	koalanoise.setPenColor(Color.ORANGE);
}
else if(color.equalsIgnoreCase("Yellow")){
	koalanoise.setPenColor(Color.YELLOW);
}
else if(color.equalsIgnoreCase("Green")){
	koalanoise.setPenColor(Color.GREEN);
}
else if(color.equalsIgnoreCase("Blue")){
	koalanoise.setPenColor(Color.BLUE);		
}
else{
	koalanoise.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		koalanoise.setPenWidth(10);
		koalanoise.penDown();
		koalanoise.setSpeed(100);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for(int i = 0; i < 25; i++) {
			// 2. Turn the robot 1/8 of a circle
		koalanoise.turn(360/8);
			// 3. Move the robot 64 pixels
		koalanoise.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
		koalanoise.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
		koalanoise.move(flameSize);
			// 6. Turn the robot 170 degrees
		koalanoise.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
		koalanoise.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
		koalanoise.turn(64);
			// 9. Move the robot the distance in the variable baseSize
		koalanoise.move(baseSize);

	}
}
}
