import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	Graphics gfx;
public static void main(String[] args) {
	Main game = new Main();
	game.startGame();
}

void startGame() {
	gfx = Graphics.getInstance();
	gfx.initialize(10, 10);
}
}
