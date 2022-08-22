package com.bridgelabz.TicTacToe;

import java.util.Scanner;

/**
 * 
 * @author HITESH
 *
 */
public class TicTacToeGame {

	public static char[] gameBoard = new char[10];	
    static Scanner sc = new Scanner(System.in);

    public void TicTacToe(){
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
}