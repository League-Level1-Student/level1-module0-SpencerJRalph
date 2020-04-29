package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookies implements ActionListener {
	        public void showButton() {
	            System.out.println("Button clicked");
	            JFrame fortune = new JFrame();
	            fortune.setVisible(true);
	            JButton button = new JButton();
	            fortune.add(button);
	            fortune.pack();
	            button.addActionListener(this);
	       }

			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "WooHoo");
				   int rand = new Random().nextInt(5);
				if(rand == 0) {
					JOptionPane.showMessageDialog(null, "You will have a bad carrer");
				}
				else if(rand == 1 ) {
					JOptionPane.showMessageDialog(null, "You will recive an unexpected gift soon");
				}
				else if( rand == 2) {
					JOptionPane.showMessageDialog(null,  "You will fail in life");
				}
				else if(rand == 3) {
					JOptionPane.showMessageDialog(null, "Someone you dislike will prove to be a friend");
				}
				else if(rand == 4) {
					JOptionPane.showMessageDialog(null, "Keep friends close and your family closer");
				}
			}
}

