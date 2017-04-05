package Model;

import View.ConsoleView;


public class Room  {

	private String rmId;
	private String rmDoor; //maybe put in an arraylist
	private String rmName;
	private String rmDescript;
	private int rmLevel;
	private Monster monsterObj;
	private Puzzle puzzleObj;
	private Artifact itemObj; 
	private Player playerID;

	ConsoleView console = new ConsoleView();

	public Room(int rmLevel, String rmId, String rmDoor, String rmName, Monster monsterObj, Puzzle puzzleObj, Artifact itemObj, Player playerID) {
		this.rmLevel = rmLevel;
		this.rmId = rmId;
		this.rmDoor = rmDoor;
		this.rmName = rmName;
		this.monsterObj = monsterObj;
		this.puzzleObj = puzzleObj;
		this.itemObj = itemObj;
		this.playerID = playerID;
	}


	public Player getPlayerID() {
		return this.playerID;
	}


	public void setPlayerID(Player playerID) {
		this.playerID = playerID;
	}


	public String getRmDescript(String rmId) {
		// TODO Auto-generated method stub
		return this.rmDescript;
	}

	public String getRmId() {
		// TODO Auto-generated method stub
		return this.rmId;
	}

	public int getRmLevel() {
		// TODO Auto-generated method stub
		return this.rmLevel;
	}

	public String getRmName() {
		// TODO Auto-generated method stub
		return this.rmName;
	}

	public String getRmDoor() {
		// TODO Auto-generated method stub
		return this.rmDoor;
	}

	public boolean hasMonster() {

		if(!this.monsterObj.getID().equalsIgnoreCase(null)) {

			return true;
		}
		return false;
	}

	public Monster getMonsterID() {
		if(!this.monsterObj.getID().equalsIgnoreCase(null)) {
			return this.monsterObj;
		}
		return null;
	}

	public boolean hasPuzzle() {

		if(!this.puzzleObj.getID().equalsIgnoreCase(null)) {

			return true;
		}
		return false;
	}


	public Puzzle getPuzzleType() {

		if(!this.puzzleObj.getID().equalsIgnoreCase(null)) {

			return this.puzzleObj;
		}
		return null;
	}

	public boolean hasArtifact() {

		if(!this.itemObj.getID().equalsIgnoreCase(null)) {

			return true;
		}
		return false;
	}

	public Artifact getArtifactID() {

		if(!this.itemObj.getID().equalsIgnoreCase(null)) {
			return this.itemObj;
		}
		return null;
	}	


	public void printRoomInfo() {
		String str = "You are on Level: " + rmLevel + ".  Your in Room: " + rmId + " --> " + rmName + ".  It's Doors are: " + rmDoor + "\n"
				+ rmDescript + "\n" + "Rooms' Monster is: " +  monsterObj + "\n" + "Rooms' Puzzle is: " + puzzleObj + "\n"
				+ "Rooms' Artifact is: " + itemObj;

		console.printConsoleView(str);

	}		
}