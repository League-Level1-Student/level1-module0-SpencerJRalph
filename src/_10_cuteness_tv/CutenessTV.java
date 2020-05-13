package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JButton duck = new JButton();
JButton frog = new JButton();
JButton unicorn = new JButton();
	public void showButton() {
	System.out.println("Button clicked");
	JFrame tv = new JFrame();
			tv.setVisible(true);
			tv.add(duck);
			tv.add(frog);
			tv.add(unicorn);
			tv.pack();
			JPanel panel = new JPanel();
					tv.add(panel);
					panel.add(duck);
					panel.add(frog);
					panel.add(unicorn);
					unicorn.addActionListener(this);
					frog.addActionListener(this);
					duck.addActionListener(this);
}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(frog)) {
			showFrog();
		}
		else if(e.getSource().equals(duck)) {
			showDucks();
		}
		else if(e.getSource().equals(unicorn)) {
			showFluffyUnicorns();
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
