package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RoomView {

	public static void main(String[] args) {


		// THIS ONLY A TESTER CLASS FOR CALLING ROOMLIBRAY
		RoomLibrary rl = new RoomLibrary();
		


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
				System.out.println("There are exactly " + rl.roomsAL().size() + " rooms on this level.  They are as 										follows:");
				int numRoom = 1;
				ArrayList<String> roomIdAL = new ArrayList<String>();

				for(Room rooms : rl.roomsAL())
				{	
					roomIdAL.add(rooms.getRmId());
				}

				for (Room rooms: rl.roomsAL())
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
				ArrayList<String> roomIdAL = new ArrayList<String>();

				for(Room rooms : rl.roomsAL())
				{	
					roomIdAL.add(rooms.getRmId());
				}
				

				for(int i = 0; i < roomIdAL.size(); i++) {

					
					if(roomIdAL.get(i).equalsIgnoreCase(IDRequest))
					{
						correctID = true;
						display = rl.getRmDescript(IDRequest);
						System.out.println(display);
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
				
				System.out.printf("Enter the NAME of the ROOM you want to enter: ");
				IDRequest =input.next();
				IDRequest = input.nextLine();
				System.out.println();

				boolean correctID = false;
				String display = "";
				ArrayList<String> roomIdAL = new ArrayList<String>();

				
				for(Room rooms : rl.roomsAL())
				{	
					
					roomIdAL.add(rooms.getRmName());
				}
				
				System.out.println(roomIdAL);

				for(int i = 0; i < roomIdAL.size(); i++) {

					if(roomIdAL.get(i).equalsIgnoreCase(IDRequest))
					{
						correctID = true;
						display = rl.getRmDescript(IDRequest);
						System.out.println(display);
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
			
			else if(userInput == 4) {
				System.out.println("Thanks for playing!");
				break;
			}
		}
	}
}





