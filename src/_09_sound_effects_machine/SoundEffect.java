package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SoundEffect implements ActionListener {
	JButton button = new JButton();
	JButton cool = new JButton();
	JButton hi = new JButton();
	public void showButton() {
		System.out.println("Button clicked");
		JFrame sound = new JFrame();
		sound.setVisible(true);
		sound.add(cool);
		sound.add(hi);
		sound.add(button);
		sound.pack();
		button.addActionListener(this);
		hi.addActionListener(this);
		cool.addActionListener(this);
		JPanel effect = new JPanel();
		effect.add(cool);
		effect.add(hi);
		effect.add(button);
		sound.add(effect);

	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button)) {
		playSound("DrumRoll.wav");
		}
		else if(e.getSource().equals(cool)) {
			playSound("KidLaugh.wav");
		}
		else if(e.getSource().equals(hi)) {
			playSound("Wood.wav");
		}
	}
}
