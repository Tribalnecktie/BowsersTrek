package View;

import java.util.Scanner;

import Model.Monster;

public class AltView {
	static Monster [] mList = new Monster[8];
	//Stop at 07
	//mList[0] = (new Monster("ML00"));
	/*
	Monster m2 = new Monster("ML01");
	Monster m3 = new Monster("ML02");
	Monster m4 = new Monster("ML03");
	Monster m5 = new Monster("ML04");
	Monster m6 = new Monster("ML05");
	Monster m7 = new Monster("ML06");
	Monster m8 = new Monster("ML07");
	 */
	static void startMenu(Scanner playerInput)
	{
		boolean gameStart = true;
		while(gameStart == true)
		{
			System.out.println("Start Game");
			System.out.println("Load Game");
			System.out.println("Help");
			//Right here is where we check the player's inputs
			if (playerInput)
		}
	}

	public static void main(String[] args)
	{
		mList[0] = new Monster("ML00");
		mList[1] = new Monster("ML01");
		mList[2] = new Monster("ML02");
		mList[3] = new Monster("ML03");
		mList[4] = new Monster("ML04");
		mList[5] = new Monster("ML05");
		mList[6] = new Monster("ML06");
		mList[7] = new Monster("ML07");
		Scanner playerInput = new Scanner(System.in);


		//Time to make the start menu loop
		startMenu();

		//This is the in-game loop
		boolean gameOn = true;
		while (gameOn == true)
		{

		}
	}
}

