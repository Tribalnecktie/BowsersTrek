package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import Model.*;
import View.ConsoleView;
import View.ViewConsole;

/**
 * @author  Tobin Crone
 * @version 1.0
 * Purpose: This will serve as the main game Controller object. Inputs from the Model will be received.
 * 			These inputs will then be pushed to the View Object to be displayed.
 */

public class GameController 
{
	private static final int DEBUG = 0;
	/*
	 * TODO:	Create Model Class Objects
	 * 			Populate with current working data set
	 * 			Send appropriate object data to the View for display
	 */

	private static boolean GAMEON = true;

	public static void main(String[] args)
	{
		/**
		 * Game Start
		 * 
		 */

		//Create and start the View for the Main Menu.
		ConsoleView console = new ConsoleView();

		//Display the Main menu
		int choice = console.printMenu("MM00");

		//Process the choice for the main menu. proceed from here.		
		//Start a new Game
		if(choice == 1)		
		{
			//Start Scanner
			Scanner newGameScan = new Scanner(System.in);

			//Set up the room map.
			Map<String,Room> roomInfoMap = new HashMap<String,Room>();
			RoomLibrary_HashMap roomLibrary = new RoomLibrary_HashMap();

			//Set up the Monster map.
			Map<String,Monster> monsterMap = new HashMap<String,Monster>();
			MonsterLibrary_HashMap monsterLibrary = new MonsterLibrary_HashMap();

			//Set the libraries to our Maps.
			roomInfoMap = roomLibrary.roomsAL();
			monsterMap = monsterLibrary.monsterAL();

			//Create our initial objects needed
			Room thisRoom = roomInfoMap.get("HW_L1");	//START NEW GAME ALWAYS AT RM101!!! ***Maybe actually the hallway. not sure how were going to do this.
			Player thisPlayer = new Player();
			Backpack thisBackpack = new Backpack();
			Monster thisMonster = monsterMap.get("ML00");
			Puzzle thisPuzzle = thisRoom.getPuzzleObj();
			
			//Get UserName and save it to the player profile
			System.out.println("Please Enter your Character Name");
			thisPlayer.setName(newGameScan.nextLine());
			console.printView("Ready to start the game " + thisPlayer.getName() + "?");
			
			//for dramatic effect
			try
			{
				console.printView("\nPutting Objects in Oven\n" );
				Thread.sleep(800);
				//see if we can clear the screen here also.
			} 
			catch (InterruptedException ie)
			{
				// TODO Auto-generated catch block
				ie.printStackTrace();
			}
			finally
			{
				console.printView("\nQuality Check\n");
				console.printView("\nStarting New Game\n");
			}

			/*
			 * Creating the Game loop here. Testing is below. So far most has worked. 
			 * GAMEON = TRUE
			 * 
			 */

			while(GAMEON)
			{
				/**
				 * Thotin: okay so i imagine it like this. We start this game loop. We do a brief check in of all our objects and make sure they are set correctly
				 * 			and then we present the menu with the correct options for that room.
				 * 			The user will make a choice and based on that choice an action will happen. Loops for monster encounters and puzzle encounters are
				 * 			taken care of in their respective model classes. 
				 * 			If a door option is chosen, the doors room number will be processed.
				 * 			During this processing we will need to:
				 * 												Change the room object and display its description.
				 * 												Get the associated Menu options and display them
				 * 												wait for user input and repeat.
				 * 
				 * 			This should take care of it really. we can create another nested loop that looks for gamecomplete or something
				 * 			and put it similiar to this
				 * 			if (ROOMID = "LASTROOMID" AND someotherrequirements blah blah)
				 * 				gamecomplete = true;
				 * 				save game and display a message of completion.
				 * 				back to main menu.
				 * 												
				 * 
				 */
	
				thisMonster = thisRoom.rollMonster();	
				
				console.printView("=========================================================================================");
				//print room description
				console.printView(roomLibrary.getRmDescript(thisRoom.getRmId().toString())); /**@note This seems a little extreme to print a room description -_____-*/
				
				//Get and display menu options.
				MenuLibrary menulib = new MenuLibrary();
				Map<String,String[]> menuMap = new HashMap<String,String[]>();
				
				menuMap = menulib.createOptions();
				
				String[] menu;
				menu = menuMap.get(thisRoom.getRmId());
				
				if(DEBUG==1)
				{
					console.printConsoleView("Menu length: " + menu.length + "\n");
				}
				
				//Print the menu options for this room.
				int x = 0;
				while(x < menu.length)
				{
					console.printView("\t" + x +". " + menu[x]);
					x++;
				}
				
				int roomchoice = newGameScan.nextInt();
				
				
				String selectedOption = menu[roomchoice];
				
				if(DEBUG==1)
				{
					console.printView("You selected " + selectedOption.substring(0, 4) + "\n");
				}
				
				//Parse and deal with the selection
				if(selectedOption.substring(0, 2).equalsIgnoreCase("DR")) //Door
				{
					Room newRoom = new Room();
					String roomNumber = selectedOption.substring(2, selectedOption.length());
					
					newRoom = roomInfoMap.get("RM"+roomNumber);
					
					//console.printView(newRoom.getRmId());
					
					thisRoom = newRoom;
					thisMonster = thisRoom.rollMonster();
					thisRoom.setMonsterObj(thisMonster);				
					
					
					console.printView("\nYou succesfully walk through a door!\n");
					//GAMEON = false;
				}
				else if(selectedOption.substring(0, 2).equalsIgnoreCase("Ha")) //hallway
				{
					Room newRoom = new Room();
					String roomNumber = selectedOption.substring(8, selectedOption.length());
					//console.printView("HW_" + roomNumber);
					console.printView("");
					
					newRoom = roomInfoMap.get("HW_"+roomNumber);
					
					thisRoom = newRoom;
					
				}
				else if(selectedOption.substring(0,4).equalsIgnoreCase("View")) //see inventory
				{
					thisBackpack.printBackpack();
					console.printView("");
				}
				else if(selectedOption.substring(0,5).equalsIgnoreCase("Check")) //Check player status
				{
					thisPlayer.viewStatus();
				}
				else if(selectedOption.substring(0,6).equalsIgnoreCase("Attack")) //Attack the mosnter
				{
					if(thisMonster == null)
					{
						console.printView("This monster ain't up for another fight");
					}
					else
					{
						
						thisMonster.encounterEnemy(thisPlayer, thisMonster, thisBackpack);
			
					}
					
				}
				
				newGameScan = new Scanner(System.in);
				
				//Finished with game				
				//GAMEON = false;
			}			

			System.exit(0);


			//Here is where we will pass in the room id to get the menu options and then display them.
			//for now we are hard coding the menu options for this room.
			//console.printConsoleView("Testing Menu Options");
			
			
			/*
			MenuOptions menuOp = new MenuOptions();
			Map<String, ArrayList<String>> menuMap = new HashMap<String, ArrayList<String>>();

			menuMap = menuOp.optionsAL();
			ArrayList<String> options = menuMap.get("RM101");


			console.printConsoleView(options.size());
			console.printConsoleView(options.toString());*/


			//Testing Monster
			console.printConsoleView("Testing Monster");
			console.printConsoleView(thisMonster.getDescription());
			thisMonster.encounterEnemy(thisPlayer, thisMonster, thisBackpack);


			//Close the scanner to avoid exceptions
			newGameScan.close();
		}
		//Load Game
		else if(choice == 2)	
		{
			//Show the user a list of save files
			//When one is chosen. Load that file.
			System.out.println("Save Files:\n");
			System.out.println("Tobin : Room 1");
			
			/**
			 * Need here a method to check names of all the save files.
			 */


			//Start player at loaded room ID.
		}
		//Exit the game
		else if(choice == 3)
		{
			System.exit(0);
		}
		//Dev team info
		else if(choice == 4)
		{

		}


		//---------------------------------------------TestZone--------------------------------------------------
		/*
		//Creating our Room Objects with the RoomLibrary_HashMap class
		System.out.println("\nStarting RoomLibrary_HashMap example");
		Map<String,Room> roomInfoMap = new HashMap<String,Room>();
		RoomLibrary_HashMap roomlibrary = new RoomLibrary_HashMap();

		//Set the roomInfoMap 
		roomInfoMap = roomlibrary.roomsAL();		

		//Testing for roomInfoMap
		//Loop through and print every Key in the HashMap.
		Iterator<?> iterate = roomInfoMap.entrySet().iterator();
		while(iterate.hasNext())
		{
			Map.Entry roomobj = (Map.Entry<String, Room>)iterate.next();
			System.out.println(roomobj.getKey().toString());
			//System.out.println(roomlibrary.getRmDescript(roomobj.getKey().toString()));
		}

		//get the room ID.

		Room CurrentRoom = roomInfoMap.get("RM101");

		System.out.println(roomlibrary.getRmDescript(CurrentRoom.getRmId()));		
		 */


		//Artifact Creation and Inventory List.



		/*Artifact testArtifact = new Artifact("A0000");
		Artifact testArtifact2 = new Artifact("A0001");
		Artifact testArtifact3 = new Artifact("A0002");


		System.out.println(testArtifact.getID());
		System.out.println(testArtifact.getName());
		System.out.println(testArtifact.getStrength());
		//Haha works wonderfully.

		//Now for something more difficult..inventory list.
		Backpack usersBackpack = new Backpack();

		//Null pointer exception on this. wonder why. 
		usersBackpack.addArtifact(testArtifact.getID().toString(),testArtifact);
		usersBackpack.addArtifact(testArtifact2.getID().toString(),testArtifact2);
		usersBackpack.addArtifact(testArtifact3.getID().toString(),testArtifact3);
		usersBackpack.addArtifact(testArtifact.getID().toString(),testArtifact);



		usersBackpack.printBackpack();
		 */
	}



	public Room createRoom()
	{

		return null;

	}

}



/*
	NOTES**


	Okay so for the saving and loading of a game. On startup. Loop through the filenames in the save dir.
	Store in a hash map so we can get the key and on selected then load using that key.
	the filename list is displayed to the user if they select load game on the main menu. 
	user will choose a name and that names key will be used to select and read in that file.
	The data read in from this file will create the objects necessary to start the player from the last place they left off.
	Need to probably implement Serializable into our object classes. so that we can save the object instead of just string data.
	string data could work. but would have to be error checked to hell because users are stupid and make mistakes. 
	i think at this point we should stick with what we have just for the sake of time.




 */