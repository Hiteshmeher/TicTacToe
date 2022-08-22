package com.bridgelabz.TicTacToe;

import java.util.Scanner;

/**
 * 
 * @author HITESH
 *
 */
public class TicTacToeGame {

	public static char[] createBoard = new char[10];
	Scanner sc = new Scanner(System.in);
	
	public char Board() {
		/**
		 * initializing array
		 */
		for (int i = 0; i < createBoard.length; i++) {
			createBoard[i] = ' ';
		}
		return 0;
	}
	
	public char choice() {
		// taking choice of User i.e X or O
		System.out.println("Do you want X or O : ");
        return sc.next().charAt(0);
	}

	public char printBoard() {
		/**
		 * printing board
		 */
		System.out.println(createBoard[1] + " | " + createBoard[2] + " | " + createBoard[3]);
		System.out.println(createBoard[4] + " | " + createBoard[5] + " | " + createBoard[6]);
		System.out.println(createBoard[7] + " | " + createBoard[8] + " | " + createBoard[9]);
		return 0;
	}
}