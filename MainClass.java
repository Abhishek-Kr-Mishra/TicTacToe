package com.Workshop.TicTacToe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args) {

		System.out.println("Welcome To Tic Toc Toe Game");
		TicTacToeGame ticTacGame=new TicTacToeGame();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		ArrayList<Integer> playerList = new ArrayList<>();
		ArrayList<Integer> computerList = new ArrayList<>();
		char userSymbol;
		char computerSymbol=' ';
		char[] board;
		
		board=ticTacGame.printBoard();
		
		userSymbol=ticTacGame.chooseYourCharacter();
		if(userSymbol=='X') {
			computerSymbol='O';
		}
		else if(userSymbol=='O') {
			computerSymbol='X';
		}

		ticTacGame.showBoard(board);
		
		int userMove=ticTacGame.getUserMove(board);
		
		ticTacGame.moveToDesiredLocation(board, userMove, userSymbol);
		
		ticTacGame.showBoard(board);
	}

}
