package Controller;

import java.util.HashMap;
import java.util.Scanner;

import Model.LoadRoomObj;


import Model.RoomClass;
import View.ViewConsole;


public class GameControllerAlt {


	public static void main(String[] args) {
		
		ViewConsole view = new ViewConsole();
		RoomClass room = new RoomClass();
		LoadRoomObj loadRmList = new LoadRoomObj();
		HashMap<String, RoomClass> roomInventory = new HashMap<String, RoomClass>();
		roomInventory = loadRmList.loadRooms("roomObjects.txt");
		Scanner input = new Scanner(System.in);
		String currentRoom;
		String str = "";
		
		// Title Screen
		System.out.println("+--------------------------------------------------------+");
		System.out.println("Welcome to Bowser’s Trek through Waluigi’s Mansion");
		System.out.println("\tCome On In.....Don't Be Afraid");
		System.out.println("+--------------------------------------------------------+");
		System.out.println();
		System.out.println("\t[1]  Start New Game");
		System.out.println("\t[2]  Load Saved Game");

		str = input.nextLine();
		if(str.equals("1")) 
		{	
				System.out.println(roomInventory.get("RM101"));
		}
		else if (str.equals("2"))
		{
			//load save game goes here
			String newStr = "No saved game to load";
			view.print(newStr);
		}

		GAME:
			while(true) {

				//View Commands
				System.out.println("Please CHOOSE ONE of the following Menu of Options");
				System.out.println("\t> TYPE IN THE NUMBER ONLY");
				System.out.println("\t[1]  Select Room");
				System.out.println("\t[2]  Equipt an Item");
				System.out.println("\t[3]  View Inventory");
				System.out.println("\t[4]  Check Health Status");
				System.out.println("\t[5]  Save Game");
				System.out.println("\t[6]  Exit Game");
				
				String optionStr = input.nextLine();
				String newStr = "";
				
				switch(optionStr) {
				case "1": 
					//enter room code
					newStr = "You have entered the Room zone\n";
					view.print(newStr);

					room.printRoomDetails();
					break;
				

				case "2": 
					//equip item
					break;
				case "3":
					//view inventory
					break;
				case "4":
					//check health
					break;
				case "5":
					//save game
					break;
				case "6":
					//exit game
					break;
				default:
					System.out.println("Not a valid command.  Enter in a number please");

				}
			}
	}
}