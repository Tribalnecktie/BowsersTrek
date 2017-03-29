package Model;


import java.util.ArrayList;

public class Room {
	
	private String rmId;
	private String rmDoor;
	private String rmName;
	private String rmDescript;
	private int rmLevel;
	private Monster monsterObj;
	private Puzzle puzzleObj; //Puzzle
	private ArrayList<Artifacts> itemObj; 
	
	public Room(int rmLevel, String rmId, String rmDoor, String rmName, Monster monsterObj, Puzzle puzzleObj, ArrayList<Artifacts> itemObj) {
		this.rmLevel = rmLevel;
		this.rmId = rmId;
		this.rmDoor = rmDoor;
		this.rmName = rmName;
		this.monsterObj = monsterObj;
		this.puzzleObj = puzzleObj;
		this.itemObj = new ArrayList<Artifacts>();
		
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

	public Puzzle getPuzzleObj() {
		return puzzleObj;
	}

	public void setPuzzleObj(Puzzle puzzleObj) {
		this.puzzleObj = puzzleObj;
	}


	public ArrayList<Artifacts> getItemObj() {
		return itemObj;
	}


	public void setItemObj(ArrayList<Artifacts> itemObj) {
		this.itemObj = itemObj;
	}

}
	
	