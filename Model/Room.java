package Model;

import java.util.ArrayList;

import View.ConsoleView;


public class Room  {

	private String rmId;
	private String rmDoor;
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
		return playerID;
	}


	public void setPlayerID(Player playerID) {
		this.playerID = playerID;
	}


	public String getRmDescript(String rmId) {
		// TODO Auto-generated method stub
		return rmDescript;
	}

	public String getRmId() {
		// TODO Auto-generated method stub
		return rmId;
	}

	public int getRmLevel() {
		// TODO Auto-generated method stub
		return rmLevel;
	}

	public String getRmName() {
		// TODO Auto-generated method stub
		return rmName;
	}

	public String getRmDoor() {
		// TODO Auto-generated method stub
		return rmDoor;
	}
	
	public Monster getMonsterID() {
		// TODO Auto-generated method stub
		return monsterObj;
	}


	public Puzzle getPuzzleType() {
		// TODO Auto-generated method stub
		return this.puzzleObj;
	}

	public Artifact getArtifactID() {
		// TODO Auto-generated method stub
		return itemObj;
	}	
	

	public void printRoomInfo() {
		String str = "Room [rmId=" + rmId + ", rmDoor=" + rmDoor + ", rmName=" + rmName + ", rmDescript=" + rmDescript
				+ ", rmLevel=" + rmLevel + ", monsterObj=" + monsterObj + ", puzzleObj=" + puzzleObj + ", itemObj="
				+ itemObj + "]";
		
		console.printConsoleView(str);
		
	}		
}