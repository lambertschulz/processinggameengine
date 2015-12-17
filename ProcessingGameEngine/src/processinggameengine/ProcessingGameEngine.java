package processinggameengine;

import processing.core.PApplet;

public class ProcessingGameEngine extends PApplet {

	public ProcessingGameEngine() {
	}

	public void settings() {
		size(1200, 675);
	}

	public void setup() {
		new ProcessingGameEngine();
	}

	public void draw() {
	}

	public void keyPressed() {

		if (key == ESC) {
			key = 0;
		}
		if (key == 'w' || key == 'W' || key == UP) {
			Keys.keys[0] = true;
		}
		if (key == 'a' || key == 'A' || key == LEFT) {
			Keys.keys[1] = true;
		}
		if (key == 's' || key == 'S' || key == DOWN) {
			Keys.keys[2] = true;
		}
		if (key == 'd' || key == 'D' || key == RIGHT) {
			Keys.keys[3] = true;
		}
		if (key == 'p' || key == 'P' || key == 0) {
			Keys.keys[4] = true;
		}
	}

	public void keyReleased() {
		if (key == ESC) {
			key = 0;
		}
		if (key == 'w' || key == 'W' || key == UP) {
			Keys.keys[0] = false;
		}
		if (key == 'a' || key == 'A' || key == LEFT) {
			Keys.keys[1] = false;
		}
		if (key == 's' || key == 'S' || key == DOWN) {
			Keys.keys[2] = false;
		}
		if (key == 'd' || key == 'D' || key == RIGHT) {
			Keys.keys[3] = false;
		}
		if (key == 'p' || key == 'P' || key == 0) {
			Keys.keys[4] = false;
		}
	}

	public static void main(String[] args) {
		PApplet.main(new String[] { processinggameengine.ProcessingGameEngine.class.getName() });
	}
}
