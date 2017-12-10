import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main implements ActionListener {
	GFX gfx;
	Logic logic;
	private boolean gameStart = false;
public static void main(String[] args) {
	Main game = new Main();
	game.startGame();
}

void startGame() {
	gfx = new GFX(this, 10, 10);
	logic = new Logic(10, 10, 10);

}

@Override
public void actionPerformed(ActionEvent e) {
	int[] mineLocation = gfx.getMineLocation(e);
	System.out.println(mineLocation[0] + ", " + mineLocation[1]);
}
}
