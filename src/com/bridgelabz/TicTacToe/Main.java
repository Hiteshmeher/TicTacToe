package com.bridgelabz.TicTacToe;
/**
 * 
 * @author HITESH
 *
 */
public class Main {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * creating object of TicTacToeGame class
		 * calling the methods
		 */
		System.out.println("<<<<< Welcome to TicTacToe Gaming >>>>>");
		TicTacToeGame game = new TicTacToeGame();
		game.Board();
		game.printBoard();
		game.choice();
	}
}