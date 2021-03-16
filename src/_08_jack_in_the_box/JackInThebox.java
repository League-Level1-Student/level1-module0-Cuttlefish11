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
	 JButton button = new JButton();
	 public void awesomeness() throws MalformedURLException {
		 JFrame GUI = new JFrame();	
			GUI.setVisible(true);
			button.setText("Surprise");
	button.addActionListener(this);
			    GUI.add(button);
			    GUI.pack();
					if (NoT == 5) {
						String a = "Users/robert/git/level1-module0-Cuttlefish11/src/_08_jack_in_the_box/jackInTheBox.png";
				Component b = createImage(a);
			}
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button)) {
			NoT++;
		}

	}
	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}
