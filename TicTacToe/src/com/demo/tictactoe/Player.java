package com.demo.tictactoe;

public class Player {
	
	private ActionFigure figure;

	public Player(ActionFigure figure) {
		this.figure = figure;
	}

	public Move turn(Board board) {
		Move move = new Move();
		move.setFigure(figure);
		while (board.getBoard()[move.getX()][move.getY()] != null) {
			move.setX(getCoord());
			move.setY(getCoord());
		}
		return move;
	}
	
	public int getCoord() {
		return (int)(Math.random()*(3));
	}
	
	public ActionFigure getPlayer() {
		return this.figure;
	}
}