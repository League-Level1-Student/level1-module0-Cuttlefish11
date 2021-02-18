package _01_houses;

import javax.swing.JOptionPane;

public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		String NU = JOptionPane.showInputDialog("What size do you want the next building to be?");
		
		int height;		
		if(NU.equals("small")) {
			height = 60;
		}
		else if(NU.equals("medium")) {
			height = 120;
		}
		else if(NU.equals("large")) {
			height = 250;
		}
		else {
			height = 143;
		}
		houseBuilder.run(height);
		

	}

}
