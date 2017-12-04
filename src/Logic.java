import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Logic implements ActionListener {
	private JButton[][] buttons;
	private int maxMines = 0;
	private boolean[][] mines;
	private int width = 0;
	private int height = 0;
	
	public Logic(JButton[][] buttons, int totalMines) {
		this.buttons = buttons;
		width = buttons.length;
		height = buttons[0].length;
		mines = new boolean[buttons.length][buttons[0].length];
		
		
		
	}
	
	private void handleClick(int x, int y) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
