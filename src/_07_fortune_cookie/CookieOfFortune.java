package _07_fortune_cookie;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CookieOfFortune{
public void showButton() {
	JFrame window = new JFrame();	
	System.out.println("Button clicked");
	window.setVisible(true);
	 JButton button = new JButton();
	    window.add(button);
	    window.pack();
	    button.addActionListener(this);

}
}


