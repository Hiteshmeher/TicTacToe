package com.bridgelabz.TicTacToe;
/**
 * 
 * @author HITESH
 *
 */
public class TicTacToeGame {
	
	public static char[] gameBoard = new char[10];
	
	public static void TicTacToeGame() {
		/**
		 * initializing array
		 */
		for (int i = 0; i < gameBoard.length; i++) {
			gameBoard[i] = ' ';
		}
	}

	public static void printBoard() {
		/**
		 * printing board
		 */
		System.out.println(gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3]);
		System.out.println(gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6]);
		System.out.println(gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9]);
	}

	public static void main(String[] args) {
		/**
		 * calling two method of array and printBoard
		 */
		TicTacToeGame();
		printBoard();
	}
}