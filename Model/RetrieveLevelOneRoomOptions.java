package Model;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import View.ConsoleView;

import java.util.Map.Entry;

public class RetrieveLevelOneRoomOptions {

	public void getLevelOneOptions() {

		ConsoleView console = new ConsoleView();
		LoadRoomObj loadRmList = new LoadRoomObj();
		HashMap<String, RoomClass> roomInventory = new HashMap<String, RoomClass>();  
		roomInventory = loadRmList.loadRooms("roomObjects.txt");
		TreeMap<String, RoomClass> sortedRoomMap = new TreeMap<String, RoomClass>(roomInventory);
		Set<Entry<String, RoomClass>> keyValueSet = sortedRoomMap.entrySet();   
		Commands command = new Commands();
		Backpack pack = new Backpack();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in).useDelimiter("\\s*");

		String response = input.nextLine();
		if(response.equals("1")) { //hallway option
			roomInventory.get("RM101").setRmID("RM101");
			console.printView(roomInventory.get("HW_L1").getRmDescription() + "\n\n");
			command.printRoomOptions();

			String newResponse = input.nextLine();
			if(newResponse.equalsIgnoreCase("1")) { //search room
				


			}
			if(newResponse.equalsIgnoreCase("2")) { //attack monster

			}
			if(newResponse.equalsIgnoreCase("3")) { //solve puzzle
				//call puzzleSolver
				Puzzle.puzzleSolver(Puzzle.getID(), pack.readinBackpack());
			}
			if(newResponse.equalsIgnoreCase("4")) { //exit room

			}
		}

		if(response.equals("2")) {
			roomInventory.get("RM101").setRmID("RM101");
			console.printView(roomInventory.get("RM101").getRmDescription() + "\n\n");
			command.printRoomOptions();

			String newResponse = input.nextLine();
			if(newResponse.equalsIgnoreCase("1")) { //search room


			}
			if(newResponse.equalsIgnoreCase("2")) { //attack monster

			}
			if(newResponse.equalsIgnoreCase("3")) { //solve puzzle
				Puzzle puzzle = new Puzzle();
				puzzle.puzzleSolver(currentPuzzleID, pack);
				Puzzle.puzzleSolver(Puzzle.getID(), pack.readinBackpack());
			}
			if(newResponse.equalsIgnoreCase("4")) { //exit room

			}
		}

		if(response.equals("3")) {
			roomInventory.get("RM102").setRmID("RM102");
			console.printView(roomInventory.get("RM103").getRmDescription() + "\n\n");
			command.printRoomOptions();

			String newResponse = input.nextLine();
			if(newResponse.equalsIgnoreCase("1")) { //search room


			}
			if(newResponse.equalsIgnoreCase("2")) { //attack monster

			}
			if(newResponse.equalsIgnoreCase("3")) { //solve puzzle
				//call puzzleSolver
				Puzzle.puzzleSolver(Puzzle.getID(), pack.readinBackpack());
			}
			if(newResponse.equalsIgnoreCase("4")) { //exit room

			}
		}

		if(response.equals("4")) {
			roomInventory.get("RM103").setRmID("RM103");
			console.printView(roomInventory.get("RM103").getRmDescription() + "\n\n");
			command.printRoomOptions();

			String newResponse = input.nextLine();
			if(newResponse.equalsIgnoreCase("1")) { //search room


			}
			if(newResponse.equalsIgnoreCase("2")) { //attack monster

			}
			if(newResponse.equalsIgnoreCase("3")) { //solve puzzle
				//call puzzleSolver
				Puzzle.puzzleSolver(Puzzle.getID(), pack.readinBackpack());
			}
			if(newResponse.equalsIgnoreCase("4")) { //exit room

			}
		}

		if(response.equals("5")) {
			roomInventory.get("RM104").setRmID("RM104");
			console.printView(roomInventory.get("RM104").getRmDescription() + "\n\n");
			command.printRoomOptions();

			String newResponse = input.nextLine();
			if(newResponse.equalsIgnoreCase("1")) { //search room


			}
			if(newResponse.equalsIgnoreCase("2")) { //attack monster

			}
			if(newResponse.equalsIgnoreCase("3")) { //solve puzzle
				//call puzzleSolver
				Puzzle.puzzleSolver(Puzzle.getID(), pack.readinBackpack());
			}
			if(newResponse.equalsIgnoreCase("4")) { //exit room

			}
		}

		if(response.equals("6")) {
			roomInventory.get("RM105").setRmID("RM105");
			console.printView(roomInventory.get("RM105").getRmDescription() + "\n\n");
			command.printRoomOptions();

			String newResponse = input.nextLine();
			if(newResponse.equalsIgnoreCase("1")) { //search room


			}
			if(newResponse.equalsIgnoreCase("2")) { //attack monster

			}
			if(newResponse.equalsIgnoreCase("3")) { //solve puzzle
				//call puzzleSolver
				Puzzle.puzzleSolver(Puzzle.getID(), pack.readinBackpack());
			}
			if(newResponse.equalsIgnoreCase("4")) { //exit room

			}
		}

		if(response.equals("7")) {
			roomInventory.get("RM106").setRmID("RM106");
			console.printView(roomInventory.get("RM106").getRmDescription() + "\n\n");
			command.printRoomOptions();

			String newResponse = input.nextLine();
			if(newResponse.equalsIgnoreCase("1")) { //search room


			}
			if(newResponse.equalsIgnoreCase("2")) { //attack monster

			}
			if(newResponse.equalsIgnoreCase("3")) { //solve puzzle
				//call puzzleSolver
				Puzzle.puzzleSolver(Puzzle.getID(), pack.readinBackpack());
			}
			if(newResponse.equalsIgnoreCase("4")) { //exit room

			}
		}

		if(response.equals("8")) {
			roomInventory.get("RM107").setRmID("RM107");
			console.printView(roomInventory.get("RM107").getRmDescription() + "\n\n");
			command.printRoomOptions();

			String newResponse = input.nextLine();
			if(newResponse.equalsIgnoreCase("1")) { //search room

			}
			if(newResponse.equalsIgnoreCase("2")) { //attack monster

			}
			if(newResponse.equalsIgnoreCase("3")) { //solve puzzle
				//call puzzleSolver
				Puzzle.puzzleSolver(Puzzle.getID(), pack.readinBackpack());
			}
			if(newResponse.equalsIgnoreCase("4")) { //exit room

			}
		}
	}
}
