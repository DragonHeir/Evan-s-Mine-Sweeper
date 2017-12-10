import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class Logic {
	private int[][] mines;
	private int width = 0;
	private int height = 0;
	Random ranGen = new Random();
	public Logic(int width, int height, int totalMines) {
		this.width = width;
		this.height = height;	
	}
	public void initializeMines(int totalMines, int[] firstClickLocation) {
		int maxMines = (width * height) - 1;
		int totalSquares = (width * height);
		if (totalMines > maxMines) {
			totalMines = maxMines;
		}
		else if (totalMines < 1) {
			totalMines = 1;
		}
		ArrayList<Integer> mineLocationList = new ArrayList<Integer>();
		while (totalMines > 0) {
			 int r = ranGen.nextInt(totalSquares);
			 while (mineLocationList.contains(r)) {
				 r = ranGen.nextInt();
			 }
			 mineLocationList.add(r);
			 totalMines--;
		}
	}

	}