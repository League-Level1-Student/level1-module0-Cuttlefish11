package _07_fortune_cookie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CookieOfFortune implements ActionListener{
public void showButton() {
	JFrame window = new JFrame();	
	System.out.println("Button clicked");
	window.setVisible(true);
	 JButton button = new JButton();
	    window.add(button);
	    window.pack();
	    button.addActionListener(this);
JOptionPane.showMessageDialog(null, "Woohoo");
int ran = new Random().nextInt(5);
if (ran == 4) {
JOptionPane.showMessageDialog(null, "You will die at the happy old age of 97.");
}
else if (ran == 3) {
JOptionPane.showMessageDialog(null, "You will win the lottery.");
}
else if (ran == 2) {
JOptionPane.showMessageDialog(null, "You will end up working at a gas station.");
}
else if (ran == 1) {
JOptionPane.showMessageDialog(null, "You will end up dying at the age of 16 ().");
}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}


