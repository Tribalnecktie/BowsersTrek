package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Artifact;
import Model.Backpack;
import Model.Monster;
import Model.MonsterLibrary_HashMap;
import Model.Player;
import Model.Puzzle;

public class AltView {
	static Player player = new Player();
	//static Monster [] mList = new Monster[8];
	static ArrayList<Artifact> iniInv = new ArrayList<Artifact>();
	static Backpack pack = new Backpack();
	static MonsterLibrary_HashMap mList = new MonsterLibrary_HashMap();
	//static RoomLibrary_HashMap rooms = new RoomLibrary_HashMap();

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
		//Getting all the starter stuff
		//iniInv.add(new Artifact("A0001"));


		//player.setInv(iniInv);
		boolean gameStart = true;


		while(gameStart == true)
		{
			System.out.println("1. Start Game");
			System.out.println("2. Load Game");
			System.out.println("3. Help");
			int command = playerInput.nextInt();
			//Right here is where we check the player's inputs
			if (command == 1)
			{
				System.out.println("You started the game");
				gameStart = false;
			}
			else if (command == 2)
			{
				
			}
			else if (command == 3)
			{

			}
			else
				System.out.println("That command is not available");
		}
	}

	static void roomNavigate(Scanner playerInput)
	{
		boolean roomNav = true;
		while (roomNav == true)
		{
			//System.out.println(rooms.getRmDescript("RM101"));
			int command = playerInput.nextInt();
			if (command == 1)
			{

			}
		}
	}

	//Need to test out how the monster loop would work
	static void encounterEnemy(Player player, Monster tempMonster, Backpack pack)
	{
		Scanner playerInput = new Scanner(System.in);
		boolean inEncounter = true;
		//Monster tempMonster = mList[0];
		if (tempMonster.getHealth() <= 0)
		{
			System.out.println("You have already slain this monster");
			inEncounter = false;
			playerInput.close();
			return;
		}

		System.out.println(tempMonster.getDescription());
		while (inEncounter == true)
		{
			if (player.getHealth() <= 0)
			{
				System.out.println("You died, Better Luck Next TIme");
			}
			if (tempMonster.getHealth() <= 0)
			{
				System.out.println("You have slain the beast here is your reward");
				System.out.println(tempMonster.getItemDrop() + " added to your inventory");
				pack.addArtifact(tempMonster.getItemDrop().getID(), tempMonster.getItemDrop());
				inEncounter = false;
				playerInput.close();
			}
			else
			{
				System.out.println("1. Attack");
				System.out.println("2. Inventory");
				System.out.println("3. Escape");
				int command = playerInput.nextInt();
				if (command == 1)
				{
					System.out.println("You attack for " + player.getAttackPower());
					player.attack(tempMonster);
					System.out.println("Monster Health " + tempMonster.getHealth());
				}
				else if (command == 2)
				{
					pack.printBackpack(); 
					
				}
				else if (command == 3)
				{
					System.out.println("You've escaped with your life");
					inEncounter = false;
					playerInput.close();
				}
			}
		}
	}
	
	static void puzzleSolver(Puzzle currentPuzzle, Backpack pack)
	{
		int numOfAttempts = 0;
		boolean inPuzzle = true;
		
		Scanner playerInput = new Scanner(System.in);
		
		System.out.println(currentPuzzle.getPzlDescription());
		while (inPuzzle == true)
		{
			if (numOfAttempts < 5)
			{
				if (playerInput.equals(currentPuzzle.getAnswer()))
				{
					System.out.println("You have correctly answer the puzzle!");
					System.out.println(currentPuzzle.getReward() + " has been added to your inventory");
					pack.addArtifact(currentPuzzle.getReward().getID(), currentPuzzle.getReward());
					currentPuzzle.setIsDone(true);
					inPuzzle = false;
					playerInput.close();
				}
				else
				{
					System.out.println("That is not the correct answer, please try again.");
					System.out.println(currentPuzzle.getPzlDescription());
					numOfAttempts += 1;
				}
			}
			else if (numOfAttempts >= 5 && numOfAttempts <= 10)
			{
				System.out.println("Looks like you are having a little trouble, here is a hint:");
				System.out.println(currentPuzzle.getHint());
				
				if (playerInput.equals(currentPuzzle.getAnswer()))
				{
					System.out.println("You have correctly answer the puzzle!");
					System.out.println(currentPuzzle.getReward() + " has been added to your inventory");
					pack.addArtifact(currentPuzzle.getReward().getID(), currentPuzzle.getReward());
					currentPuzzle.setIsDone(true);
					inPuzzle = false;
					playerInput.close();
				}
				else
				{
				numOfAttempts += 1;
				}
			}
			else
			{
				System.out.println("Would you like to come back to this puzzle later?");
				System.out.println("1. Come back to puzzle later");
				System.out.println("2. Keep trying");
				int command = playerInput.nextInt();
				if (command == 1)
				{
					System.out.println("You can always come back and try again, have a safe journey.");
					inPuzzle = false;
					playerInput.close();
				}
				else if (command == 2)
				{
					System.out.println("I like the spirit, lets keep trying.");
					numOfAttempts = 5;
				}
			}
		}
	}


	public static void main(String[] args)
	{
		/*
		mList[0] = new Monster("ML00");
		mList[1] = new Monster("ML01");
		mList[2] = new Monster("ML02");
		mList[3] = new Monster("ML03");
		mList[4] = new Monster("ML04");
		mList[5] = new Monster("ML05");
		mList[6] = new Monster("ML06");
		mList[7] = new Monster("ML07");
		*/
		Scanner playerInput = new Scanner(System.in);


		//Time to make the start menu loop
		//startMenu(playerInput);

		//This is the in-game loop
		boolean gameOn = true;
		while (gameOn == true)
		{
			encounterEnemy(player, mList.monsterAL().get("ML00"), pack);
			//roomNavigate(playerInput);
		}
	}
}

