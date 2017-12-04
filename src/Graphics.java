import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics {
	static private Graphics instance = null;
	private JFrame window;
	private JPanel panel;
	private JButton[][] mines;

	void initialize(int width, int height) {
		window = new JFrame("Mine Sweeper");
		panel = new JPanel(new GridLayout(width, height));
		panel.setPreferredSize(new Dimension(width*30, height*30));
		window.add(panel);
		mines = new JButton[width][height];
		
		for (int i = 0; i < mines.length; i++) {
			for (int j = 0; j < mines[0].length; j++) {
				mines[i][j] = new JButton();
				panel.add(mines[i][j]);
			}
		}
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}
	private Graphics() {
		
	}
	public static Graphics getInstance() {
		if (instance == null) {
			instance = new Graphics();
		}
		return instance;
	}
}
