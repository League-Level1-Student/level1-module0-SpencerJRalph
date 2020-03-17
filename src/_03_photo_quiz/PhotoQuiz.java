package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String image = "https://medialib.aafp.org/content/dam/AAFP/images/ann/2020-january/coronavirus_update920.jpg.daijpg.600.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component corona;
		// 3. use the "createImage()" method below to initialize your Component
		corona = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(corona);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String wow = JOptionPane.showInputDialog("what do you think this image is");
		// 7. print "CORRECT" if the user gave the right answer
		if (wow.equalsIgnoreCase("COVID-19")) {
			System.out.println("CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(corona);
		// 10. find another image and create it (might take more than one line
		// of code)
		String imageTWO = "https://banner2.cleanpng.com/20180613/rkt/kisspng-hand-sanitizer-purell-gojo-industries-moisturizer-hand-sanitizer-5b21dbd98ed1d1.722048701528945625585.jpg";
		corona = createImage(imageTWO);
		// 11. add the second image to the quiz window
		quizWindow.add(corona);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String soap = JOptionPane.showInputDialog("What is better, hand sanitizer or soap");
		// 14+ check answer, say if correct or incorrect, etc.
		if (soap.equalsIgnoreCase("Hand Sanitizer")) {
			System.out.println("YESSIR");
		} else {
			System.out.println("SO SO SO SO SO SO SO VERY WRONG LIKE AUGIE");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
