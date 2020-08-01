package com.demo.tictactoe;

public class Referee {
	private ActionFigure[][] board;
	private ActionFigure dot;
	
	public void put(Move move, Board board) {
		this.board = board.getBoard();
		this.dot = move.getFigure();
		this.board[move.getX()][move.getY()] = dot;
		board.removeCell(board.getCells());
	}

	public boolean isWin(Move move, Board board) {
		ActionFigure[][] aBoard = board.getBoard();
		for (int i = 0; i < 3; i++)
	        if ((aBoard[i][0] == move.getFigure() && aBoard[i][1] == dot && aBoard[i][2] == dot) ||
	            (aBoard[0][i] == dot && aBoard[1][i] == dot && aBoard[2][i] == dot)) {
	        	System.out.println(move.getFigure() + " win!");
	            return true;
	        }
	        if ((aBoard[0][0] == dot && aBoard[1][1] == dot && aBoard[2][2] == dot) ||
	            (aBoard[2][0] == dot && aBoard[1][1] == dot && aBoard[0][2] == dot)) {
	        	System.out.println(move.getFigure() + " win!");
	            return true;
	        }
	    return false;
	}

}