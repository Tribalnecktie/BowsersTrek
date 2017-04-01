package Model;

public interface RoomInterface {
	
public String getRmDescript(String rmId);
	
	public String getRmId();
	
	public int getRmLevel();
	
	public String getRmName();
	
	public String getRmDoor();	
	
	public Monster getMonsterID();
	
	public Puzzle getPuzzleType();
	
	public Artifact getArtifactID();

}
