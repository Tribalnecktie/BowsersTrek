package Model;


import java.util.ArrayList;

public class Room {
	
	private String rmId;
	private String rmDoor;
	private String rmName;
	private String rmDescript;
	private int rmLevel;
	private Monster monsterObj;
	private Puzzle puzzle;
	private ArrayList<Artifact> itemObj; 
	
	public Room(int rmLevel, String rmId, String rmDoor, String rmName, Monster monsterObj, ArrayList<Artifact> itemObj) {
		this.rmLevel = rmLevel;
		this.rmId = rmId;
		this.rmDoor = rmDoor;
		this.rmName = rmName;
		this.monsterObj = monsterObj;
		//this.puzzleObj = puzzleObj;
		this.itemObj = new ArrayList<Artifact>();
		
	}
	
	
	public String getRmId() {
		return rmId;
	}

	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

	public String getRmDoor() {
		return rmDoor;
	}

	public void setRmDoor(String rmDoor) {
		this.rmDoor = rmDoor;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String rmName) {
		this.rmName = rmName;
	}

	public String getRmDescript() {
		return rmDescript;
	}

	public void setRmDescript(String rmDescript) {
		this.rmDescript = rmDescript;
	}

	public int getRmLevel() {
		return rmLevel;
	}

	public void setRmLevel(int rmLevel) {
		this.rmLevel = rmLevel;
	}

	public Monster getMonsterObj() {
		return monsterObj;
	}

	public void setMonsterObj(Monster monsterObj) {
		this.monsterObj = monsterObj;
	}



}
	
	