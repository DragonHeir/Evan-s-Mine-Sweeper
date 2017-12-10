import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GFX {
	private JFrame window;
	private JPanel panel;
	private JButton[][] mines;

	public GFX(ActionListener a, int width, int height) {
		window = new JFrame("Mine Sweeper");
		panel = new JPanel(new GridLayout(width, height));
		panel.setPreferredSize(new Dimension(width * 30, height * 30));
		window.add(panel);
		mines = new JButton[width][height];
		for (int i = 0; i < mines.length; i++) {
			for (int j = 0; j < mines[0].length; j++) {
				mines[i][j] = new JButton();
				mines[i][j].addActionListener(a);
				panel.add(mines[i][j]);
			}
		}

		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}

	public int[] getMineLocation(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		int[] location = new int[2];
		for (int i = 0; i < mines.length; i++) {
			for (int j = 0; j < mines[0].length; j++)
			if (b == mines[i][j]) {
				location[0] = i;
				location[1] = j;
			}
		}
		
		return location;

	}
}
