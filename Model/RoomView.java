package Model;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Scanner;

public class RoomView {

	public static void main(String[] args) {

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






