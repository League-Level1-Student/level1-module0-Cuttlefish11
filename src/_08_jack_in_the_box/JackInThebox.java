package _08_jack_in_the_box;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jointheleague.graphical.robot.Robot;

import _07_fortune_cookie.CookieOfFortune;

public class JackInThebox implements ActionListener {
	 int NoT = 0;
	 JFrame GUI = new JFrame();	
	 JButton button = new JButton();
	 public void awesomeness() throws MalformedURLException {
		
			GUI.setVisible(true);
			button.setText("Surprise");
	button.addActionListener(this);
			    GUI.add(button);
			    GUI.pack();
					
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button)) {
			NoT++;
			System.out.println(NoT);
		}
		if (NoT == 5) {
			String a = "jackInTheBox.png";
	try {
		JLabel b = createLabelImage(a);
		GUI.add(b);
		GUI.pack();
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}
