package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	static Robot rob = new Robot ();
	
	public void run(int height) {
	
		
	String NT = JOptionPane.showInputDialog ("What color do you want the building to be?");
	rob.setSpeed(5);
	rob.penDown();
	
	rob.setPenColor(225, 0, 225);
	rob.move(100);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(100);
	
	rob.turn(-90);
	rob.setPenColor(0, 255, 20);
	rob.move(35);
	
	if (NT.equals ("green")) {
		rob.setPenColor (0, 255, 20);
	}
	else if (NT.equals ("red")) {
		rob.setPenColor (255, 0, 0);
	}
	else if (NT.equals ("blue")) {
		rob.setPenColor (0, 0, 255);
	}
	else if (NT.equals ("brown")) {
		rob.setPenColor (120, 80, 40);
	}
	else if (NT.equals ("white")) {
		rob.setPenColor (255, 255, 255);
	}
	else if (NT.equals ("black")) {
		rob.setPenColor (0, 0, 0);
	}
	else if (NT.equals ("yellow")) {
		rob.setPenColor (248, 211, 15);
	}
	else if (NT.equals ("pink")) {
		rob.setPenColor (225, 0, 225);
	}
	String NQ = JOptionPane.showInputDialog("Do you want it's roof to be pointy or flat?");
	rob.turn(-90);
	rob.move(height);
	if (NQ.equals ("pointy")) {
		pointyRoof();
	}
	else if (NQ.equals ("flat")) {
		flatRoof();
	}
	rob.move(height);
	
	rob.turn(-90);
	rob.setPenColor(0, 255, 20);
	rob.move(35);
	}
public static void pointyRoof () { 
	rob.turn(30);
	rob.move(25);
	rob.turn(120);
	rob.move(25);
	rob.turn(30);
}
public static void flatRoof () { 
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
}

}
