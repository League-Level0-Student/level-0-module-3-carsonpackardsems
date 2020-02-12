

import java.net.URI;

import javax.swing.JOptionPane;

public class LOAP_JukeBox {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "These are your song choices: 'My Stick', 'Megolavania', 'Word Crimes', or 'Canadian Idiot'. ");
String Choice	= JOptionPane.showInputDialog("From those songs, which do you choose?");
if(Choice.equalsIgnoreCase("My Stick")) {
	vidPick("https://www.youtube.com/watch?v=yIdguuSqIug");
}
else if(Choice.equalsIgnoreCase("Megolovania")) {
	vidPick("https://www.youtube.com/watch?v=TLI3rn0PTjw");
}
else if(Choice.equalsIgnoreCase("My Stick")) {
	vidPick("https://www.youtube.com/watch?v=k1Jybmtvcxw");
}
else if(Choice.equalsIgnoreCase("Word Crimes")) {
	vidPick("https://www.youtube.com/watch?v=ksJTWimv2D0");
}
//My stick | https://www.youtube.com/watch?v=yIdguuSqIug
//Megolavania | https://www.youtube.com/watch?v=TLI3rn0PTjw
//Canadian idiot| https://www.youtube.com/watch?v=k1Jybmtvcxw
// Word Crimes | https://www.youtube.com/watch?v=ksJTWimv2D0
}
static void vidPick (String videoURL){
	try {
		URI uri = new URI(videoURL);
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
