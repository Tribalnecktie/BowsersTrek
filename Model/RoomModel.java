package Model;

public class RoomModel 
{
	//model holds all the data

	private String rmDescription;
	private boolean hasMonster;
	private boolean hasPuzzle;
	private boolean hasItem;

	//default constructor
	public RoomModel(int rmLevel, String rmId, String rmDoor, String rmName, boolean 								hasMonster, boolean hasPuzzle, boolean hasItem) 	{
		//super(rmLevel, rmId, rmDoor, rmName);
		this.hasMonster = hasMonster;
		this.hasPuzzle = hasPuzzle;
		this.hasItem = hasItem;
	}
	
	public RoomModel(int rmLevel, String rmId, String rmDoor, String rmName)	{
		//super(rmLevel, rmId, rmDoor, rmName);
	}

	public String getRmDescription() {
		
		return rmDescription;
	}

	public void setRmDescription(String rmDescription) {
		this.rmDescription = rmDescription;
	}

	public boolean isHasMonster() {
		return hasMonster;
	}

	public void setHasMonster(boolean hasMonster) {
		this.hasMonster = hasMonster;
	}

	public boolean isHasPuzzle() {
		return hasPuzzle;
	}

	public void setHasPuzzle(boolean hasPuzzle) {
		
		
		this.hasPuzzle = hasPuzzle;
	}

	public boolean isHasItem() {
		return hasItem;
	}

	public void setHasItem(boolean hasItem) {
		this.hasItem = hasItem;
	}

	@Override
	public String toString() {
		return "RoomModel [rmDescription=" + rmDescription + ", 						hasMonster=" + hasMonster + ", hasPuzzle=" + hasPuzzle
				+ ", hasItem=" + hasItem + "]";
	}
	
	
	

}