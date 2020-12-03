package com.Workshop.TicTacToe;

public class MainClass {

	
	public static void main(String[] args) {

		System.out.println("Welcome To Tic Toc Toe Game");
		TicTacToeGame ticTacGame=new TicTacToeGame();
		char userSymbol, computerSymbol;
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
	}

}
