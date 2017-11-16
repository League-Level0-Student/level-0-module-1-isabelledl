import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		 int number= 0;
		
			String r= JOptionPane.showInputDialog("What is black and white and read all over");
			if (r.equals("newspaper")) {JOptionPane.showMessageDialog(null, "correct!");
			 number++;	
			} else {JOptionPane.showMessageDialog(null, "worng the answer is newspaper");

			}String a = JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?");
			if (a.equals("a towel")) {JOptionPane.showMessageDialog(null, "correct!");
			number++;	
			} else {JOptionPane.showMessageDialog(null, "worng the answer is a towel");
		// 2. Make a pop up to show the score.
		
	}JOptionPane.showMessageDialog(null, " You score is "+number);
}
}
