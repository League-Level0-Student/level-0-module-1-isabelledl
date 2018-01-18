//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name=	JOptionPane.showInputDialog("What is your name?");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equalsIgnoreCase("Brian")) {JOptionPane.showMessageDialog(null, "Your superpower is flying!");
	
}if (name.equalsIgnoreCase("Elijah")) {JOptionPane.showMessageDialog(null, "Your superpower is super speed!");

	}if (name.equalsIgnoreCase("Kamron")) {JOptionPane.showMessageDialog(null, "Your superpower is making Ian cry!");
	
}if (name.equalsIgnoreCase("Mike")) {JOptionPane.showMessageDialog(null, "Your superpower is teaching!");

}if (name.equalsIgnoreCase("Ian")) {JOptionPane.showMessageDialog(null, "Your superpower is eating crakers!");

}
}
}