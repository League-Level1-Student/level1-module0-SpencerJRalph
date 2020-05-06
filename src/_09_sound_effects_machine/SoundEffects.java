package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundEffects implements ActionListener {
public void showButton() {
	System.out.println("Button clicked");
	JFrame sound = new JFrame();
	sound.setVisible(true);
	JButton effects = new JButton();
	sound.add(effects);
	sound.pack();
	effects.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
