package com.bridgelabz.TicTacToe;

/**
 * 
 * @author HITESH
 *
 */
public class TicTacToeGame {

	public static char[] gameBoard = new char[10];

	public void TicTacToeGame() {
		/**
		 * initializing array
		 */
		for (int i = 0; i < gameBoard.length; i++) {
			gameBoard[i] = ' ';
		}
	}

	public void printBoard() {
		/**
		 * printing board
		 */
		System.out.println(gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3]);
		System.out.println(gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6]);
		System.out.println(gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9]);
	}
}