package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
public static void main(String[] args) {
String choice1 = JOptionPane.showInputDialog("Are you happy?");	
if (choice1.equals("Yes")) {
JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
}
else if(choice1.equals("No")) {
String choice2	= JOptionPane.showInputDialog("Do you want to be happy?");
if (choice2.equals("Yes")) {
JOptionPane.showMessageDialog(null, "Change yourself.");
}
else if(choice2.equals("No")) { 
	JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");

}
}
}
}