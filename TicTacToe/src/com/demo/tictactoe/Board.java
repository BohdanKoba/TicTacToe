package com.demo.tictactoe;

public class Board {
	
	private final ActionFigure[][] board;
	private int freeÑells;
	
	public Board() {
		board = new ActionFigure[3][3];
		this.freeÑells = 9;
	}
	public boolean hasMoreSpace() {
		if (getCells() > 0) {
			return true;
		}
		return false;
	}

	public void print() {
		System.out.println("Result:\n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == null) {
					System.out.print("[    ] ");
				}
				else {
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println("\n");
		}
		System.out.println();
	}
	
	public int getCells() {
		return freeÑells;
	}
	
	public void removeCell(int Cells) {
		this.freeÑells = Cells - 1;
	}
	
	public ActionFigure[][] getBoard() {
		return board;
	}
}