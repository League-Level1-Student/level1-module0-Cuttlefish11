package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MoreButtons implements ActionListener {
	JFrame GUI = new JFrame();
	 JButton ghost = new JButton();
	 JButton ghast = new JButton();
	 JButton ghoul = new JButton();
	public void space() {
		GUI.setVisible(true);
ghost.setText("duck");
ghost.addActionListener(this);
ghast.setText("frog");
ghast.addActionListener(this);
ghoul.setText("unicorns");
ghoul.addActionListener(this);
JPanel formatter = new JPanel();
			formatter.add(ghost);
			formatter.add(ghast);
		    formatter.add(ghoul);
			GUI.add(formatter);
		    GUI.pack();
				
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		System.out.println("?");
		if (buttonPressed.equals(ghost)) {
	showDucks();
	System.out.println("goose");
		}
		else if (buttonPressed.equals(ghast)) {
			showFrog();
			System.out.println("toad");
				}
		else if (buttonPressed.equals(ghoul)) {
			showFluffyUnicorns();
			System.out.println("horse");
				}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	

}
