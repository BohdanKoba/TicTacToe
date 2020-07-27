package com.demo.tictactoe;

public class Board {
	
	private final ActionFigure[][] board;
	private int free—ells;
	
	public Board() {
		board = new ActionFigure[3][3];
		this.setCells(9);
	}
	public boolean hasMoreSpace() {
		return false;
	}

	public void print() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == null) {
					System.out.print("[ ] ");
				}
				else {
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println("\n");
		}
	}
	
	public int getCells() {
		return free—ells;
	}
	
	public void setCells(int Cells) {
		this.free—ells = Cells;
	}
}