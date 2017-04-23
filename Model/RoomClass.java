package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;

import Model.Puzzle;
import View.ConsoleView;
import View.ViewConsole;
import Model.Backpack;

public class RoomClass {

	private int rmLevel;
	private String rmID;
	private String rmDoor;
	private String rmName;
	private String rmDescription;

	Puzzle puzzle;
	Backpack pack;
	ConsoleView console = new ConsoleView();
	//Commands command = new Commands();


	public RoomClass()	{		
	}

	public RoomClass(int level, String ID, String door, String name, String description) {
		this.rmLevel = level;
		this.rmID = ID;
		this.rmDoor = door;
		this.rmName = name;
		this.rmDescription = description;
		this.puzzle = new Puzzle("");
		this.pack = new Backpack();
	}

	public int getRmLevel() {
		return this.rmLevel;
	}

	public void setRmLevel(int level) {
		this.rmLevel = level;
	}

	public String getRmID() {
		return this.rmID;
	}

	public void setRmID(String ID) {

		this.rmID = ID;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String name) {
		this.rmName = name;
	}

	public String getRmDescription() {
		return this.rmDescription;
	}

	public void setRmDescription(String description) {
		this.rmDescription = description;
	}

	public String getRmDoor() {
		return rmDoor;
	}

	public void setRmDoor(String door) {
		this.rmDoor = door;
	}

	@Override
	public String toString() {
		return "Room ==> Current Level: " + rmLevel + ". Your in the "  + rmName + ".\n\n\t" + rmDescription + "\n";
	}

	public void printRoomDetails() {
		LoadRoomObj loadRmList = new LoadRoomObj();
		HashMap<String, RoomClass> roomInventory = new HashMap<String, RoomClass>();
		roomInventory = loadRmList.loadRooms("roomObjects.txt");
		TreeMap<String, RoomClass> sortedRoomMap = new TreeMap<String, RoomClass>(roomInventory);
		Set<Entry<String, RoomClass>> keyValueSet = sortedRoomMap.entrySet();   

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in).useDelimiter("\\s*");
		String currentRmID = roomInventory.get("RM101").getRmID();

		int currentRmLevel = roomInventory.get("RM101").getRmLevel();
		int numOptions = 1;      //displays a number value next to array of options

		console.printView("Where would you like to go on this level? ");

		if(currentRmLevel == 1) 
		{
			//RetrieveLevelOneRoomOptions levelOneOps = new RetrieveLevelOneRoomOptions();
			
			System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
			ArrayList<RoomClass> levelOneRooms = new ArrayList<RoomClass>();

			for(Entry<String, RoomClass> entry: keyValueSet) {
				levelOneRooms.add(entry.getValue());
			}
			for(RoomClass rm : levelOneRooms) {
				if(rm.rmLevel == 1) {
					System.out.println("[" + numOptions + "] " + rm.rmName);
					numOptions++;
				}
			}

			//levelOneOps.getLevelOneOptions();
			

			if(currentRmLevel == 2) 
			{
				System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
				ArrayList<RoomClass> levelTwoRooms = new ArrayList<RoomClass>();

				for(Entry<String, RoomClass> entry: keyValueSet) {
					if(entry.getValue().equals("1")) {
						levelTwoRooms.add(entry.getValue());
					}
				}
				for(RoomClass rm : levelTwoRooms) {
					if(rm.rmLevel == 1) {
						System.out.println("[" + numOptions + "] " + rm.rmName);
						numOptions++;
					}
				}
			}

			if(currentRmLevel == 3) 
			{
				System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
				for(Entry<String, RoomClass> entry: keyValueSet) {
					if(entry.getValue().equals(3)) {
						System.out.println("[" + numOptions + "] " + entry.getKey());	
						numOptions++;
					}
				}
			}
			if(currentRmLevel == 4) {
				System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
				for(Entry<String, RoomClass> entry: keyValueSet) {
					if(entry.getValue().equals(1)) {
						System.out.println("[" + numOptions + "] " + entry.getKey());	
						numOptions++;
					}
				}
			}
		}
	}
}
