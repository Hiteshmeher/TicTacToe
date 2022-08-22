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
		 * Creating object of TicTacToeGame class
		 * Calling the methods
		 */
		System.out.println("<<<<< Welcome to TicTacToe Gaming >>>>>");
		TicTacToeGame game = new TicTacToeGame();
		 game.ticTacToe();
	     game.choice();
	     game.showBoard();
	     game.moveLocation();
	}
}