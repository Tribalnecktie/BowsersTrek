package Model;



import Model.Puzzle;
import View.ConsoleView;
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
}
