package _02_my_first_swing_gui;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public void run() {

		// 1. Declare and initialize an object of the JFrame class
JFrame Numero1 = new JFrame ();
		// 2. Set your JFrame object to be visible
Numero1.setVisible(true);
		// 3. Open MyFirstSwingGUIRunner and run your program. Do you see your window? It's probably very
		// small.

		// 4. Use your JFrame to call setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
Numero1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. Declare and initialize an object of the JPanel class
JPanel Numero2 = new JPanel();
		// 6. Declare and initialize an object of the JLabel class
JLabel Numero3 = new JLabel();
		// 7. Set the text of the JLabel to a lovely greeting
Numero3.setText("Good day :)");
		// 8. Add the JPanel object to the JFrame
Numero1.add(Numero2);
		// 9. Add the JLabel object to the JPanel
Numero2.add(Numero3);
		// 10. Pack your JFrame
Numero1.pack();
		// 11. Run your program again. Do you see your message?
 
		// 12. Use your JLabel to call setIcon(loadImage())
Numero3.setIcon(loadImage ());
		// 13. Re-pack the JFrame object
Numero1.pack();
		// 14. Run the program one more time. Do you see the image?

	}

	public ImageIcon loadImage() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
