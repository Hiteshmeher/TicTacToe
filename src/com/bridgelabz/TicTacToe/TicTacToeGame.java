package com.bridgelabz.TicTacToe;

import java.util.Scanner;

/**
 * 
 * @author HITESH
 *
 */
public class TicTacToeGame {
    static Scanner sc = new Scanner(System.in);
	public static char[] gameBoard = new char[10];	
    public static boolean isPlayer = true;
    public static int playerPosition;

    public void ticTacToe(){
    	// Creating Board
        for (int i=0; i< gameBoard.length; i++){
            gameBoard[i] = ' ';
        }
    }

    public char choice(){
    	// Taking user choice that is X or O
        System.out.println("Do you want X or O : ");
        return sc.next().charAt(0);
    }

    public void showBoard(){
    	// Printing Board
        System.out.println("****** Current Board ******");
        System.out.println(gameBoard[1]+" | "+gameBoard[2]+" | "+gameBoard[3]);
        System.out.println(gameBoard[4]+" | "+gameBoard[5]+" | "+gameBoard[6]);
        System.out.println(gameBoard[7]+" | "+gameBoard[8]+" | "+gameBoard[9]);
    }
    
	public void moveLocation() {
		// moving the entered choice to a desired position that if from 1 to 9
		if (isPlayer == true) {
			System.out.println("Please enter the the position you want to play(1-9): ");
			playerPosition = sc.nextInt();
			if (playerPosition < 1 || playerPosition > 9) {
				System.out.println("This position is out off the board. Play again!");
			} else if (gameBoard[playerPosition] != ' ') {
				System.out.println("Position is occupied. Try again!!!");
			} else {
				System.out.println("Valid Position");
			}
		}
    }
}