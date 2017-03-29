package Model;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Scanner;

public class RoomView {

	public static void main(String[] args) {


		LinkedList<Room> roomListLevel1 = new LinkedList<Room>();
		LinkedList<Room> roomListLevel2 = new LinkedList<Room>();
		LinkedList<Room> roomListLevel3 = new LinkedList<Room>();
		LinkedList<Room> roomListLevel4 = new LinkedList<Room>();

		// LEVEL 1 ROOMS -------------------------------------------------- 
		roomListLevel1.add(new Room("RM101", "DR101 and DR102", "Entrance"));
		roomListLevel1.add(new Room("HW_L1", "DR101, DR102,DR103, DR104, "
				+ "DR105, DR106, DR107, DR108", "Hallway Level 1"));

		roomListLevel1.add(new Room("RM102", "DR103", "Greeting Area"));
		roomListLevel1.add(new Room("RM103", "DR104", "Living Room"));
		roomListLevel1.add(new Room("RM104", "DR105", "Game Room"));
		roomListLevel1.add(new Room("RM105", "DR106", "Kitchen"));
		roomListLevel1.add(new Room("RM106", "DR107", "Dining Room"));
		roomListLevel1.add(new Room("RM107", "DR108", "Landing"));

		//for(Room rooms: roomListLevel1 ) {
		//	System.out.println(rooms);
		//}

		// LEVEL 2 ROOMS ---------------------------------------------------
		roomListLevel2.add(new Room("HW_L2", "DR201, DR202, DR203, DR205. DR208, DR209, DR211, 									DR 212", "Hallway Level 2"));
		roomListLevel2.add(new Room("RM201", "DR 201, DR202, DR203, DR204", "Waiting Room"));
		roomListLevel2.add(new Room("RM202", "DR205", "Supply Room"));
		roomListLevel2.add(new Room("RM203", "DR206, DR207", "Bedroom"));
		roomListLevel2.add(new Room("RM204", "DR207, DR208", "Cleaning Supply Room"));
		roomListLevel2.add(new Room("RM205", "DR209, DR2106", "Music Room"));
		roomListLevel2.add(new Room("RM206", "DR210, DR211", "Wine Cellar"));
		roomListLevel2.add(new Room("RM207", "DR204, DR212", "Library"));

		//for(Room rooms: roomListLevel2 ) {
		//	System.out.println(rooms);
		//}

		// Room Descripts ----------------------------------------------------------

		boolean response = true; //used to access menu of options
		int userInput; //stores user's menu option selection to be processed in "if/else-if statements"
		String IDRequest;
		Scanner input = new Scanner(System.in); //gets keyboard commands

		while (response)
		{
			System.out.println("Welcome to the Mansion");
			System.out.println("Press 1: List Rooms on this level:");
			System.out.println("Press 2: Enter a Room");
			System.out.println("Press 3: Search the Room");
			System.out.println("Press 4: Exit System");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("Enter your response: ");
			userInput = input.nextInt();

			if (userInput == 1 )
			{	
				System.out.println("There are exactly " + roomListLevel1.size() + " rooms on this level.  They are as 										follows:");
				int numRoom = 1;
				for (Room rooms: roomListLevel1)
				{
					System.out.println("Room " + numRoom + ": " + rooms.getRmId() + " --> " + rooms.getRmName());
					numRoom++;
				}
				System.out.println();
				System.out.println("Now What?");
				System.out.println("----------------------------------------------------------------------");
			}

			else if (userInput == 2)
			{
				System.out.printf("Enter the room number you want to enter: ");
				IDRequest = input.next();
				System.out.println();

				boolean correctID = false;
				String display;

				for(Room rooms : roomListLevel1)
				{	
					if(IDRequest.equalsIgnoreCase(rooms.getRmId())) 
					{
						correctID = true;
						display = rooms.getRmId();
						System.out.println(rooms.getRmDescript((display)));
						System.out.println();
						System.out.println("----------------------------------------------------------------------");
					}
				}
				if(!correctID)
				{
					System.out.println("Wrong room honey, try again or enter another option");
					System.out.println();
					System.out.println("----------------------------------------------------------------------");
				}
			}

			else if (userInput == 3)
			{
				for (Room rooms : roomListLevel1)
				{
					System.out.print(rooms.getRmName() + " ");
				}

				System.out.print("Enter the NAME of the room you would like to search: ");
				IDRequest = input.nextLine();

				if(IDRequest.equalsIgnoreCase(roomListLevel1.get(2).getRmName())) {
					String display = roomListLevel1.get(0).getRmId();
				}
			}
		}
	}
}






