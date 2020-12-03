package com.Workshop.TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	
	Scanner sc = new Scanner(System.in);
	char[] gameBoard=new char[10];
	char playerSymbol;
	
	public char[] printBoard() {
		for(int i=1; i<=9; i++) {
			gameBoard[i]=' ';
		}
		return gameBoard;
	}
	
	public char chooseYourCharacter() {
		System.out.println("Choose a Character X OR O ");
		playerSymbol =sc.next().charAt(0);
		return playerSymbol;
	}
	
	public void showBoard(char[] gameBoard) {
		int i=1;
		while(i<=9) {
			System.out.println(gameBoard[i]+"|"+gameBoard[i+1]+"|"+gameBoard[i+2]+"|");
			i=i+3;
		}
		
	}
		
}

