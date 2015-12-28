package processinggameengine;

import processing.core.PApplet;
import processinggameengine.gui.GUIButton;
import processinggameengine.gui.GUIComponent;
import processinggameengine.gui.GUILayer;
import processinggameengine.gui.GUIText;

public class ProcessingGameEngine extends PApplet {
	GUILayer layer1;
	GUIComponent title, menu;
	GUIText titelText, buttonText;
	GUIButton startButton, bla;

	public ProcessingGameEngine() {
	}

	public void settings() {
		size(1200, 675);
	}

	public void setup() {
		new ProcessingGameEngine();
		layer1 = new GUILayer();
		title = new GUIComponent(this, 0, 0, width, 100, false, null, color(200, 200, 255), true, color(255));
		menu = new GUIComponent(this, 50, 150, 150, 300, false, null, color(200, 200, 255), true, color(255));
		titelText = new GUIText(this, width / 2 - 100, 20, 200, 50, "Ein Spiel", color(0, 0, 255), 30, true);
		startButton = new GUIButton(this, 0, 0, 150, 50, "START");
		bla = new GUIButton(this, 0, 60, 150, 50, "bla");

		title.addText(titelText);
		menu.addButton(startButton);
		menu.addButton(bla);

		layer1.addComponent(title);
		layer1.addComponent(menu);

	}

	public void draw() {
		layer1.render();
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

	public void mousePressed() {
		if (mouseButton == LEFT) {
			Keys.mousebutton[0] = true;
		}
		if (mouseButton == CENTER) {
			Keys.mousebutton[1] = true;
		}
		if (mouseButton == RIGHT) {
			Keys.mousebutton[2] = true;
		}
	}
	public void mouseReleased() {
		if (mouseButton == LEFT) {
			Keys.mousebutton[0] = false;
		}
		if (mouseButton == CENTER) {
			Keys.mousebutton[1] = false;
		}
		if (mouseButton == RIGHT) {
			Keys.mousebutton[2] = false;
		}
	}

	public static void main(String[] args) {
		PApplet.main(new String[] { processinggameengine.ProcessingGameEngine.class.getName() });
	}
}
