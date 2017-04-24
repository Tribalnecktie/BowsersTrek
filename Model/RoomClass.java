package Model;



import Model.Puzzle;
import View.ConsoleView;
import Model.Backpack;
/**
 * Class: RoomClass
 * 
 * @author Katrina Smith 
 * @version 1.1 
 * Course : ITEC 3860 Spring 2017
 * Written: April 1, 2017
 *
 *  This class –  Alternate class of Room attributes to be used to construct a text file to store Room Objects
 *          
 *  Purpose: – To establish the functionality of a Room Object: getter and setter for all the room attributes. Utilizing the Model, View architecture style, we import the ConsoleView class to update the view with the Room class commands that the controller class with access. 
 **/
public class RoomClass {

	private int rmLevel;
	private String rmID;
	private String rmDoor;
	private String rmName;
	private String rmDescription;

	Puzzle puzzle;
	Backpack pack;
	ConsoleView console = new ConsoleView();

	/**
	 * Default constructor
	 */
	public RoomClass()	{		
	}
	
	/**
	 * Method: Constructor; constructs a Room object
	 * @param level room level
	 * @param ID unique Identification
	 * @param door doors of the room
	 * @param name name of the room
	 * @param description room description
	 */
	public RoomClass(int level, String ID, String door, String name, String description) {
		this.rmLevel = level;
		this.rmID = ID;
		this.rmDoor = door;
		this.rmName = name;
		this.rmDescription = description;
		this.puzzle = new Puzzle("");
		this.pack = new Backpack();
	}
	/**
	 * Method: getRemLevel()
	 * getter for room level
	 * @return room level integer
	 */
	public int getRmLevel() {
		return this.rmLevel;
	}

	/*
	 * Method: setRmLevel() Setter for room level
	 */
	public void setRmLevel(int level) {
		this.rmLevel = level;
	}
	
	/**
	 * Method: getRmID() Getter for room unique Identification
	 * @return String of room Identification
	 */
	public String getRmID() {
		return this.rmID;
	}
	
	/**
	 * Method: setRmId() Setter method for the rmId attribute
	 * @param String rmID unique room identifier in the form of a String
	 */
	public void setRmID(String ID) {

		this.rmID = ID;
	}

	/**
	 * Method: getRmName() Getter method for the rmName attribute
	 * @return room name in the form of a String
	 */
	public String getRmName() {
		return rmName;
	}
	
	/**
	 * Method: setRmName() Setter method for the rmName attribute
	 * @param String rmName name of a particular room
	 */
	public void setRmName(String name) {
		this.rmName = name;
	}

	/**
	 * Method: getRemDescription() Getter for room descripton
	 * @return room description as a long String
	 */
	public String getRmDescription() {
		return this.rmDescription;
	}

	/**
	 * Method: setRmDescription() Setter for room description
	 * @param description String
	 */
	public void setRmDescription(String description) {
		this.rmDescription = description;
	}

	/**
	 * Method: getRmDoor() Getter method for the rmDoor attribute
	 * @return rmDoor a String of doors or a single door
	 */
	public String getRmDoor() {
		return rmDoor;
	}
	
	/**
	 * Method: setRmDoor() Setter method for the rmDoor attribute
	 * @param String rmDoor a door or set of doors associated with a particular room
	 */
	public void setRmDoor(String door) {
		this.rmDoor = door;
	}
	
	/**
	 * Method: toString()
	 * Prints out attributes of Room in a easy to read format
	 */
	@Override
	public String toString() {
		return "Room ==> Current Level: " + rmLevel + ". Your in the "  + rmName + ".\n\n\t" + rmDescription + "\n";
	}
}
