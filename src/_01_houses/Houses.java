package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot hi = new Robot();

	void drawHouse(String height, String color) {
		int size = 100;
		if(height.equals("small")) {
			size = 60;
		}
		else if(height.equals("medium")){
			size = 120;
		}
		else if(height.contentEquals("large")) {
			size = 250;
		}
		if(color.equals("blue")) {
			hi.setPenColor(Color.blue);
		}
		else if(color.contentEquals("magenta")) {
			hi.setPenColor(Color.magenta);
		}
		else if(color.equals("orange")) {
			hi.setPenColor(Color.orange);
		}
		else if(color.contentEquals("pink")) {
			hi.setPenColor(Color.PINK);
		}
		else if(color.equals("red")) {
			hi.setPenColor(Color.red);
		}
		hi.setAngle(0);
		hi.setPenWidth(5);
		hi.move(size);
		if(height.equals("small")) {
			drawPointyRoof();
		}
		else if(height.contentEquals("medium")) {
			drawPointyRoof();
		}
		else if(height.equals("large")) {
			drawFlatRoof();
		}
		hi.move(size);
		hi.setPenColor(Color.green);
		hi.turn(270);
		hi.move(30);
	}

	void run() {
		hi.penDown();
		hi.setSpeed(100);
		hi.setX(50);
		hi.setY(550);
		drawHouse("small", "blue");
		drawHouse("medium", "magenta");
		drawHouse("small", "orange");
		drawHouse("large", "pink");
		drawHouse("medium", "red");
		drawHouse("large", "blue");
		drawHouse("small", "orange");
		drawHouse("medium", "red");
		drawHouse("large", "magenta");
		drawHouse("medium", "pink");
		hi.turn(270);

	}
	void drawPointyRoof() {
		hi.turn(45);
		hi.move(30);
		hi.turn(90);
		hi.move(30);
		hi.turn(45);
	}
	void drawFlatRoof() {
		hi.turn(90);
		hi.move(50);
		hi.turn(90);
	}
}
