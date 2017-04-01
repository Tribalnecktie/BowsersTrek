package Model;

public class Room implements RoomInterface {

	private String rmId;
	private String rmDoor;
	private String rmName;
	private String rmDescript;
	private int rmLevel;
	private Monster monsterObj;
	private Puzzle puzzleObj;
	private Artifact itemObj; 

	public Room(int rmLevel, String rmId, String rmDoor, String rmName, Monster monsterObj, Puzzle puzzleObj, Artifact itemObj) {
		this.rmLevel = rmLevel;
		this.rmId = rmId;
		this.rmDoor = rmDoor;
		this.rmName = rmName;
		this.monsterObj = monsterObj;
		this.puzzleObj = puzzleObj;
		this.itemObj = itemObj;
	}

	@Override
	public String getRmDescript(String rmId) {
		// TODO Auto-generated method stub
		return rmDescript;
	}

	@Override
	public String getRmId() {
		// TODO Auto-generated method stub
		return rmId;
	}

	@Override
	public int getRmLevel() {
		// TODO Auto-generated method stub
		return rmLevel;
	}

	@Override
	public String getRmName() {
		// TODO Auto-generated method stub
		return rmName;
	}

	@Override
	public String getRmDoor() {
		// TODO Auto-generated method stub
		return rmDoor;
	}
	
	@Override
	public Monster getMonsterID() {
		// TODO Auto-generated method stub
		return monsterObj;
	}

	@Override
	public Puzzle getPuzzleType() {
		// TODO Auto-generated method stub
		return puzzleObj;
	}

	@Override
	public Artifact getArtifactID() {
		// TODO Auto-generated method stub
		return itemObj;
	}	
	

	@Override
	public String toString() {
		return "Room [rmId=" + rmId + ", rmDoor=" + rmDoor + ", rmName=" + rmName + ", rmDescript=" + rmDescript
				+ ", rmLevel=" + rmLevel + ", monsterObj=" + monsterObj + ", puzzleObj=" + puzzleObj + ", itemObj="
				+ itemObj + "]";
	}

	
	
}