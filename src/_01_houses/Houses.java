package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot hi = new Robot();

	void drawHouse(int height) {
		hi.setAngle(0);
		hi.setPenColor(Color.magenta);
		hi.setPenWidth(5);
		hi.move(height);
		hi.turn(45);
		hi.move(25);
		hi.turn(90);
		hi.move(25);
		hi.turn(45);
		hi.move(height);
		hi.setPenColor(Color.GREEN);
		hi.turn(270);
		hi.move(50);
	}

	void run() {
		hi.penDown();
		hi.setSpeed(10);
		hi.setX(50);
		hi.setY(550);
		drawHouse(100);
		drawHouse(25);
		drawHouse(50);
		drawHouse(100);
		drawHouse(35);
		drawHouse(77);
		drawHouse(180);
		drawHouse(170);
		drawHouse(99);
		drawHouse(110);
		hi.turn(270);

	}
}
