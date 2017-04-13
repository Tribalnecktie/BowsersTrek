package Model;



/**
 * Class: Room
 * 
 * @author Katrina Smith 
 * @version 1.1 
 * Course : ITEC 3860 Spring 2017
 * Written: April 1, 2017
 *
 *  This class – Describes the Room Model class for Bowser's Trek through Waluigi's Mansion Text-based adventure game
 *          
 *  Purpose: – To establish the functionality of a Room Object: getter and setter for all the room attributes. Utilizing the Model, View architecture style, we import the ConsoleView class to update the view with the Room class commands that the controller class with access. 
 **/
public class Room2  {

	private String rmId;
	private String rmDoor; //maybe put in an arraylist
	private String rmName;
	private int rmLevel;
	private String rmDescript;
	private Monster monsterObj;
	private Puzzle puzzleObj;
	private Artifact artifactObj; 
	private Player playerID;


	/**
	 * Method: Room() Default constructor
	 */
	public Room2() {

	}

	/**
	 * Constructor: Room
	 * creates a Room Object
	 * @param rmLevel identifies what level the room is located on
	 * @param rmId the unique room identifier 
	 * @param rmDoor the doors associated with the room
	 * @param rmName name of the room
	 * @param monsterObj Monster object from the Monster Model class
	 * @param puzzleObj Puzzle object from the Puzzle Model class
	 * @param artifactmObj Artifact object from the Artifact Model class
	 * @param playerID Player object from the Player Model class
	 */
	public Room2(int rmLevel, String rmId, String rmDoor, String rmName, Monster monsterObj, Puzzle puzzleObj, Artifact artifactmObj, Player playerID) {
		this.rmLevel = rmLevel;
		this.rmId = rmId;
		this.rmDoor = rmDoor;
		this.rmName = rmName;
		//this.rmDescript = rmDescript;
		this.monsterObj = monsterObj;
		this.puzzleObj = puzzleObj;
		this.artifactObj = artifactmObj;
		this.playerID = playerID;
	}

	/**
	 * Method: getRmLevel() Getter method for the rmLevel attribute 
	 * @return the room level integer
	 */
	public int getRmLevel() {
		return this.rmLevel;
	}

	/**
	 * Method: setRmLevel() Setter method for the rmLevel attribute
	 * @param int rmLevel integer value of the room level
	 */
	public void setRmLevel(int rmLevel) {
		this.rmLevel = rmLevel;
	}

	/**
	 * Method: getRmId() Getter method for the rmId attribute
	 * @return room identifier in the form of a String
	 */
	public String getRmId() {
		return this.rmId;
	}

	/**
	 * Method: setRmId() Setter method for the rmId attribute
	 * @param String rmID unique room identifier in the form of a String
	 */
	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

	/**
	 * Method: getRmDoor() Getter method for the rmDoor attribute
	 * @return rmDoor a String of doors or a single door
	 */
	public String getRmDoor() {
		return this.rmDoor;
	}

	/**
	 * Method: setRmDoor() Setter method for the rmDoor attribute
	 * @param String rmDoor a door or set of doors associated with a particular room
	 */
	public void setRmDoor(String rmDoor) {
		this.rmDoor = rmDoor;
	}

	/**
	 * Method: getRmName() Getter method for the rmName attribute
	 * @return room name in the form of a String
	 */
	public String getRmName() {
		return this.rmName;
	}

	/**
	 * Method: setRmName() Setter method for the rmName attribute
	 * @param String rmName name of a particular room
	 */
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	

	/**
	 * Method: hasMonster() 
	 * @return true if a Monster object is associated with a particular room identifier, false otherwise
	 */
	public boolean hasMonster() {

		if(!this.monsterObj.getID().equalsIgnoreCase(null)) {

			return true;
		}
		return false;
	}

	/**
	 * Method: getMonsterObj() Getter method for the monsterObj attribute
	 * @return monsterObj a monster object and its attributes if it exists in the room, null otherwise
	 */
	public Monster getMonsterObj() {
		
		return monsterObj;
	}

	/**
	 * Method: setMonsterObj() Setter method for the monsterObj attribute
	 * @param Monster monsterObj sets the Monster object
	 */
	public void setMonsterObj(Monster monsterObj) {
		this.monsterObj = monsterObj;
	}

	/**
	 * Method: hasPuzzle() 
	 * @return true if a Puzzle object is associated with a particular room identifier, false otherwise
	 */
	public boolean hasPuzzle() {

		if(!this.puzzleObj.getID().equalsIgnoreCase(null)) {

			return true;
		}
		return false;
	}

	/**
	 * Method: getPuzzleObj() Getter method for the puzzleObj attribute
	 * @return puzzleObj a puzzle object and its attributes if it exists in the room, null otherwise
	 */
	public Puzzle getPuzzleObj() {
		return puzzleObj;
	}

	/**
	 * Method: setPuzzleObj() Setter method for the puzzleObj attribute
	 * @param Puzzle puzzleObj sets the puzzle object 
	 */
	public void setPuzzleObj(Puzzle puzzleObj) {
		this.puzzleObj = puzzleObj;
	}

	/**
	 * Method: hasArtifact() 
	 * @return true if a Artifact object is associated with a particular room identifier, false otherwise
	 */
	public boolean hasArtifact() {

		if(!this.artifactObj.getID().equalsIgnoreCase(null)) {

			return true;
		}
		return false;
	}

	/**
	 * Method: getItemObj() Getter method for the itemObj attribute
	 * @return itemObj a Artifact object and its attributes if it exists in the room, null otherwise
	 */
	public Artifact getArtifactObj() {

		return artifactObj;
	}	

	/**
	 * Method: setItemObj() Getter method for the itemObj attribute
	 * @param Artifact itemObj sets a Artifact object 
	 */
	public void setArtifactObj(Artifact artifactObj) {
		this.artifactObj = artifactObj;
	}

	/**
	 * Method: getPlayerID() Getter method for the playerID attribute
	 * @return playerID object attributes if it exists in the room, null otherwise
	 */
	public Player getPlayerID() {

		return playerID;
	}

	/**
	 * Method: setPlayerID() Setter method for the playerID attribute
	 * @param Player playerID sets the PlayerID
	 */
	public void setPlayerID(Player playerID) {
		this.playerID = playerID;
	}
}


