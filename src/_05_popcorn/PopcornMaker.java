package _05_popcorn;


import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog(null, "What flavor of popcorn would you like?");
		Popcorn popcorn = new Popcorn(flavor);
		String time = JOptionPane.showInputDialog(null, "How many seconds do you want your popcorn to be cooked");
		int seconds = Integer.parseInt(time);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(seconds);
		microwave.startMicrowave();
	}
}
