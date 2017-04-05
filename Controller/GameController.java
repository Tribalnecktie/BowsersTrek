package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import Model.*;
import View.ConsoleView;

/**
 * @author  Tobin Crone
 * @version 1.0
 * Purpose: This will serve as the main game Controller object. Inputs from the Model will be received.
 * 			These inputs will then be pushed to the View Object to be displayed.
 */

public class GameController 
{
	/*
	 * TODO:	Create Model Class Objects
	 * 			Populate with current working data set
	 * 			Send appropriate object data to the View for display
	 */
	
	Map<String,Room> roomInfoMap;
	
	public static void main(String[] args)
	{
		/*BEGINNING OF GAME*/
		
		//Create and start the View for the Main Menu.
		ConsoleView console = new ConsoleView();
		
		//Test
		int choice = console.printMenu("MM00");
		
		System.out.println("The users Choice was : " + choice);
		
		if(choice == 1)	//Start a new Game
		{
			
			//Start Scanner
			Scanner newGameScan = new Scanner(System.in);
			
			Map<String,Room> roomInfoMap = new HashMap<String,Room>();
			RoomLibrary_HashMap roomlibrary = new RoomLibrary_HashMap();
			
			roomInfoMap = roomlibrary.roomsAL();
			
			//Create our initial objects need
			Room thisRoom = roomInfoMap.get("RM101");
			Player thisPlayer = new Player();
			
			//Get Username
			System.out.println("Please Enter your Character Name");
			thisPlayer.setName(newGameScan.nextLine());
			
			System.out.println("Ready to start the game " + thisPlayer.getName() + "?");
			
			//for dramatic effect
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		else if(choice == 2)
		{
			//Show the user a list of save files
			//When one is chosen. Load that file.
			System.out.println("Save Files:\n");
			System.out.println("Tobin : Room 1");
			
			
			//Start player at loaded room ID.
		}
		else if(choice == 3)
		{
			System.exit(0);
		}
		
		
		
		
		
		
		/*---------------------------------------------TestZone--------------------------------------------------*/
		
		//Creating our Room Objects with the RoomLibrary_HashMap class
		System.out.println("\nStarting RoomLibrary_HashMap example");
		Map<String,Room> roomInfoMap = new HashMap<String,Room>();
		RoomLibrary_HashMap roomlibrary = new RoomLibrary_HashMap();
		
		//Set the roomInfoMap 
		roomInfoMap = roomlibrary.roomsAL();		
	
		//Testing for roomInfoMap
		//Loop through and print every Key in the HashMap.
		/*Iterator<?> iterate = roomInfoMap.entrySet().iterator();
		while(iterate.hasNext())
		{
			Map.Entry roomobj = (Map.Entry<String, Room>)iterate.next();
			System.out.println(roomobj.getKey().toString());
			//System.out.println(roomlibrary.getRmDescript(roomobj.getKey().toString()));
		}*/
		
		//get the room ID.
		
		Room CurrentRoom = roomInfoMap.get("RM101");
		
		System.out.println(roomlibrary.getRmDescript(CurrentRoom.getRmId()));		
		
		/*
		 * Artifact Creation and Inventory List.
		 * 
		 * 
		 */
		
		Artifact testArtifact = new Artifact("A0000");
		Artifact testArtifact2 = new Artifact("A0001");
		Artifact testArtifact3 = new Artifact("A0002");
		
		
		/*System.out.println(testArtifact.getID());
		System.out.println(testArtifact.getName());
		System.out.println(testArtifact.getStrength());*/
		//Haha works wonderfully.
		
		//Now for something more difficult..inventory list.
		Backpack usersBackpack = new Backpack();
		
		//Null pointer exception on this. wonder why. 
		usersBackpack.addArtifact(testArtifact.getID().toString(),testArtifact);
		usersBackpack.addArtifact(testArtifact2.getID().toString(),testArtifact2);
		usersBackpack.addArtifact(testArtifact3.getID().toString(),testArtifact3);
		
		usersBackpack.printBackpack();
		
		
		
		
		
		
		
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