package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MachineThing  implements ActionListener{
		 JFrame GUI = new JFrame();
		 JButton ghost = new JButton();
		 JButton ghast = new JButton();
		 JButton ghoul = new JButton();
		 public void noComment() {
				GUI.setVisible(true);
		ghost.setText("guess which one of us is correct (its me)");
		ghost.addActionListener(this);
		ghast.setText("actually, its me");
		ghast.addActionListener(this);
		ghoul.setText("as it so happens, they're both wrong, its me");
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
			if (buttonPressed.equals(ghost)) {
		JOptionPane.showMessageDialog(null, "You're wrong. Now ghosts will devour your soul!");
			}
			else if (buttonPressed.equals(ghast)) {
				JOptionPane.showMessageDialog(null, "You're right! :)");
					}
			else if (buttonPressed.equals(ghoul)) {
				JOptionPane.showMessageDialog(null, "You're wrong. Now ghouls will devour your soul!");
					}
		}
}