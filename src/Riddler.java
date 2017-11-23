import javax.swing.JOptionPane;

public class Riddler {
	public static void main(String[] args) {
		int score = 0;
		String a = JOptionPane.showInputDialog("Which weighs more, a pound of feathers or a pound of bricks?");
		if (a.equals("neither")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! the answer is neither");

		}
		 a = JOptionPane.showInputDialog("What is always coming but never arrives?");
		if (a.equals("tomorrow")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! the answer is tomorrow");

		}
		JOptionPane.showMessageDialog(null, "Your score is "+ score);
	}
}
