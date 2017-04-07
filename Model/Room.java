package Model;

import View.ConsoleView;

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
public class Room  {

	private String rmId;
	private String rmDoor; //maybe put in an arraylist
	private String rmName;
	private int rmLevel;
	private Monster monsterObj;
	private Puzzle puzzleObj;
	private Artifact itemObj; 
	private Player playerID;

	ConsoleView console = new ConsoleView();

	/**
	 * Constructor: Room
	 * creates a Room Object
	 * @param rmLevel identifies what level the room is located on
	 * @param rmId the unique room identifier 
	 * @param rmDoor the doors associated with the room
	 * @param rmName name of the room
	 * @param monsterObj Monster object from the Monster Model class
	 * @param puzzleObj Puzzle object from the Puzzle Model class
	 * @param itemObj Artifact object from the Artifact Model class
	 * @param playerID Player object from the Player Model class
	 */
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
		if(!this.monsterObj.getID().equalsIgnoreCase(null)) {
			return this.monsterObj;
		}
		return null;
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

		if(!this.puzzleObj.getID().equalsIgnoreCase(null)) {

			return this.puzzleObj;
		}
		return null;
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

		if(!this.itemObj.getID().equalsIgnoreCase(null)) {

			return true;
		}
		return false;
	}

	/**
	 * Method: getItemObj() Getter method for the itemObj attribute
	 * @return itemObj a Artifact object and its attributes if it exists in the room, null otherwise
	 */
	public Artifact getArtifactID() {

		if(!this.itemObj.getID().equalsIgnoreCase(null)) {
			return this.itemObj;
		}
		return null;
	}	

	/**
	 * Method: setItemObj() Getter method for the itemObj attribute
	 * @param Artifact itemObj sets a Artifact object 
	 */
	public void setItemObj(Artifact itemObj) {
		this.itemObj = itemObj;
	}

	/**
	 * Method: getPlayerID() Getter method for the playerID attribute
	 * @return playerID object attributes if it exists in the room, null otherwise
	 */
	public Player getPlayerID() {
		if(!this.playerID.getName().equals(null)) {
			return this.playerID;
		}
		return null;
	}

	/**
	 * Method: setPlayerID() Setter method for the playerID attribute
	 * @param Player playerID sets the PlayerID
	 */
	public void setPlayerID(Player playerID) {
		this.playerID = playerID;
	}

	public void setConsole(ConsoleView console) {
		this.console = console;
	}

	/*
	 * Method: printRoomInfo()  Converts the attributes of the class to a text readable
	 * format.
	 * 
	 * Used to replace the standard toString() method
	 */
	public void printRoomInfo() {
		String str = "You are on Level: " + rmLevel + ".  You're in Room: " + rmId + " --> " + rmName + ".  It's Doors are: " + rmDoor + ".\n"
		 + "Rooms' Monster is: " +  monsterObj + ".\n" + "Rooms' Puzzle is: " + puzzleObj + ".\n"
		 + "Rooms' Artifact is: " + itemObj;

		console.printConsoleView(str);

	}		
}