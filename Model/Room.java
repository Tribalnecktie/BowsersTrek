package Model;

import java.util.ArrayList;
import java.util.Random;

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

	protected int rmLevel;
	protected String rmId;	
	protected String rmName;
	protected String rmDoor; 
	private Monster monsterObj;
	private Puzzle puzzleObj;
	private Artifact artifactObj; 
	private Player playerID;
	ConsoleView console = new ConsoleView();
	private Random rand = new Random();


	/**
	 * Method: Room() Default constructor
	 */
	public Room() {


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
	public Room (int rmLevel, String rmId, String rmDoor, String rmName, Monster monsterObj, Puzzle puzzleObj, Artifact artifactObj, Player playerID) {
		this.rmLevel = rmLevel;
		this.rmId = rmId;
		this.rmDoor = rmDoor;
		this.rmName = rmName;
		this.monsterObj = monsterObj;
		this.puzzleObj = puzzleObj;
		this.artifactObj = artifactObj;
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
	 * Method: getPuzzleObj() Getter method for the puzzleObj attribute
	 * @return puzzleObj a puzzle object and its attributes if it exists in the room, null otherwise
	 */
	public Puzzle getPuzzleObj() {

		int n = rand.nextInt(100) + 1;
		Puzzle p1 = new Puzzle("PL0001");
		Puzzle p2 = new Puzzle("PL0002");
		Puzzle p3 = new Puzzle("PL0003");
		Puzzle p4 = new Puzzle("PL0004");
		Puzzle p5 = new Puzzle("PL0005");
		Puzzle p6 = new Puzzle("PL0006");
		Puzzle p7 = new Puzzle("PL0007");

		if(n < 16) {
			puzzleObj = p1;	
		}
		else if(n > 16 && n < 31) {
			puzzleObj = p2;
		}
		else if(n > 31 && n < 46) {
			puzzleObj = p3;
		}
		else if(n > 46 && n < 61) {
			puzzleObj = p4;
		}
		else if(n > 61 && n < 76) {
			puzzleObj = p5;
		}
		else if(n > 76 && n < 91) {
			puzzleObj = p6;	
		}
		else if(n > 91 && n < 101) {
			puzzleObj = p7;
		}

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
	 * Method: getItemObj() Getter method for the itemObj attribute
	 * @return itemObj a Artifact object and its attributes if it exists in the room, null otherwise
	 */
	public Artifact getArtifactObj() {

		int n = rand.nextInt(5) + 1;
		Artifact a1 = new Artifact("A0000");
		Artifact a2 = new Artifact("A0001");
		Artifact a3 = new Artifact("A0002");
		Artifact a4 = new Artifact("A0003");
		Artifact a5 = new Artifact("A0004");
		Artifact a6 = new Artifact("A0005");
		Artifact a7 = new Artifact("A0006");
		Artifact a8 = new Artifact("A0007");
		Artifact a9 = new Artifact("A0008");
		Artifact a10 = new Artifact("A0009");
		Artifact a11 = new Artifact("A0010");
		Artifact a12 = new Artifact("A0011");
		Artifact a13 = new Artifact("A0012");

		if (n == 1)  { //assigns items with a strength value of 2

			Random r = new Random();
			ArrayList<Artifact> possibleItems = new ArrayList<Artifact>();
			possibleItems.add(a1);
			possibleItems.add(a3);
			possibleItems.add(a7);
			possibleItems.add(a8);
			possibleItems.add(a9);

			int x = r.nextInt(possibleItems.size());
			artifactObj = possibleItems.get(x);	
		}

		else if (n == 2) { //assigns item with a strength value of 4

			artifactObj = a2;
		}

		else if (n == 3) { //assigns item with a strength value of 5

			Random r = new Random();

			ArrayList<Artifact> possibleItems = new ArrayList<Artifact>();
			possibleItems.add(a5);
			possibleItems.add(a10);
			possibleItems.add(a11);
			possibleItems.add(a13);

			int x = r.nextInt(possibleItems.size());
			artifactObj = possibleItems.get(x);	
		}

		else if (n ==  4) { //assigns items with a string value of 6

			artifactObj = a4;
		}

		else if (n == 5) {

			Random r = new Random();

			ArrayList<Artifact> possibleItems = new ArrayList<Artifact>();
			possibleItems.add(a6);
			possibleItems.add(a12);

			int x = r.nextInt(possibleItems.size());
			artifactObj = possibleItems.get(x);	
		}


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


	/**
	 * Method: printRoomInfo()  Converts the attributes of the class to a text readable
	 * format.
	 * 
	 * Used to replace the standard toString() method
	 */

	public void printRoomInfo() {
		RoomLibrary_HashMap map = new RoomLibrary_HashMap();
		  
		String str = "You are on Level: " + getRmLevel() + ".  You're in Room: " + getRmId() + " --> " + rmName + ".  It's Doors are: " + rmDoor + ".\n" + "\n"
				+ map.getRmDescript(getRmId()) + "\n" + "\n"
				+ "Rooms' Monster is: " +  monsterObj + ".\n" + "Rooms' Puzzle is: " + getPuzzleObj().getPzlName() + ".\n"
				+ "Rooms' Artifact is: " + getArtifactObj().getName() + "\n";

		console.printConsoleView(str);

	}		
}

/*public class Room  {

	private String rmId;
	private String rmDoor; //maybe put in an arraylist
	private String rmName;
	private int rmLevel;
	private Monster monsterObj;
	private Puzzle puzzleObj;
	private Artifact itemObj; 
	private Player playerID;
	Random rand = new Random();

	ConsoleView console = new ConsoleView();

 *//**
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
 *//*
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

  *//**
  * Method: getRmLevel() Getter method for the rmLevel attribute 
  * @return the room level integer
  *//*
	public int getRmLevel() {
		return this.rmLevel;
	}

   *//**
   * Method: setRmLevel() Setter method for the rmLevel attribute
   * @param int rmLevel integer value of the room level
   *//*
	public void setRmLevel(int rmLevel) {
		this.rmLevel = rmLevel;
	}

    *//**
    * Method: getRmId() Getter method for the rmId attribute
    * @return room identifier in the form of a String
    *//*
	public String getRmId() {
		return this.rmId;
	}

     *//**
     * Method: setRmId() Setter method for the rmId attribute
     * @param String rmID unique room identifier in the form of a String
     *//*
	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

      *//**
      * Method: getRmDoor() Getter method for the rmDoor attribute
      * @return rmDoor a String of doors or a single door
      *//*
	public String getRmDoor() {
		return this.rmDoor;
	}

       *//**
       * Method: setRmDoor() Setter method for the rmDoor attribute
       * @param String rmDoor a door or set of doors associated with a particular room
       *//*
	public void setRmDoor(String rmDoor) {
		this.rmDoor = rmDoor;
	}

        *//**
        * Method: getRmName() Getter method for the rmName attribute
        * @return room name in the form of a String
        *//*
	public String getRmName() {
		return this.rmName;
	}

         *//**
         * Method: setRmName() Setter method for the rmName attribute
         * @param String rmName name of a particular room
         *//*
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}

          *//**
          * Method: getMonsterObj() Getter method for the monsterObj attribute
          * @return monsterObj a monster object and its attributes if it exists in the room, null otherwise
          *//*
	public Monster getMonsterObj() {
		if(!this.monsterObj.getID().equalsIgnoreCase(null)) {
			return this.monsterObj;
		}
		return null;
	}

           *//**
           * Method: setMonsterObj() Setter method for the monsterObj attribute
           * @param Monster monsterObj sets the Monster object
           *//*
	public void setMonsterObj(Monster monsterObj) {
		this.monsterObj = monsterObj;
	}

            *//**
            * Method: getPuzzleObj() Getter method for the puzzleObj attribute
            * @return puzzleObj a puzzle object and its attributes if it exists in the room, null otherwise
            *//*
	public Puzzle getPuzzleObj() {

		int n = rand.nextInt(100) + 1;
		Puzzle p1 = new Puzzle("PL0001");
		Puzzle p2 = new Puzzle("PL0002");
		Puzzle p3 = new Puzzle("PL0003");
		Puzzle p4 = new Puzzle("PL0004");
		Puzzle p5 = new Puzzle("PL0005");
		Puzzle p6 = new Puzzle("PL0006");
		Puzzle p7 = new Puzzle("PL0007");

		if(n < 16) {
			puzzleObj = p1;	
		}
		else if(n > 16 && n < 31) {
			puzzleObj = p2;
		}
		else if(n > 31 && n < 46) {
			puzzleObj = p3;
		}
		else if(n > 46 && n < 61) {
			puzzleObj = p4;
		}
		else if(n > 61 && n < 76) {
			puzzleObj = p5;
		}
		else if(n > 76 && n < 91) {
			puzzleObj = p6;	
		}
		else if(n > 91 && n < 101) {
			puzzleObj = p7;
		}

		return this.puzzleObj;
	}

             *//**
             * Method: setPuzzleObj() Setter method for the puzzleObj attribute
             * @param Puzzle puzzleObj sets the puzzle object 
             *//*
	public void setPuzzleObj(Puzzle puzzleObj) {

		this.puzzleObj = puzzleObj;
	}


              *//**
              * Method: getItemObj() Getter method for the itemObj attribute
              * @return itemObj a Artifact object and its attributes if it exists in the room, null otherwise
              *//*
	public Artifact getItemObj() {

		int n = rand.nextInt(5) + 1;
		Artifact a1 = new Artifact("A0000");
		Artifact a2 = new Artifact("A0001");
		Artifact a3 = new Artifact("A0002");
		Artifact a4 = new Artifact("A0003");
		Artifact a5 = new Artifact("A0004");
		Artifact a6 = new Artifact("A0005");
		Artifact a7 = new Artifact("A0006");
		Artifact a8 = new Artifact("A0007");
		Artifact a9 = new Artifact("A0008");
		Artifact a10 = new Artifact("A0009");
		Artifact a11 = new Artifact("A0010");
		Artifact a12 = new Artifact("A0011");
		Artifact a13 = new Artifact("A0012");

		if (n == 1)  { //assigns items with a strength value of 2

			Random r = new Random();
			ArrayList<Artifact> possibleItems = new ArrayList<Artifact>();
				possibleItems.add(a1);
				possibleItems.add(a3);
				possibleItems.add(a7);
				possibleItems.add(a8);
				possibleItems.add(a9);

			int x = r.nextInt(possibleItems.size());
			itemObj = possibleItems.get(x);	
		}

		else if (n == 2) { //assigns item with a strength value of 4

			itemObj = a2;
		}

		else if (n == 3) { //assigns item with a strength value of 5

			Random r = new Random();

			ArrayList<Artifact> possibleItems = new ArrayList<Artifact>();
			possibleItems.add(a5);
			possibleItems.add(a10);
			possibleItems.add(a11);
			possibleItems.add(a13);

			int x = r.nextInt(possibleItems.size());
			itemObj = possibleItems.get(x);	
		}

		else if (n ==  4) { //assigns items with a string value of 6

			itemObj = a4;
		}

		else if (n == 5) {

			Random r = new Random();

			ArrayList<Artifact> possibleItems = new ArrayList<Artifact>();
			possibleItems.add(a6);
			possibleItems.add(a12);

			int x = r.nextInt(possibleItems.size());
			itemObj = possibleItems.get(x);	
		}

		return itemObj;
	}	

               *//**
               * Method: setItemObj() Getter method for the itemObj attribute
               * @param Artifact itemObj sets a Artifact object 
               *//*
	public void setItemObj(Artifact itemObj) {
		this.itemObj = itemObj;
	}

                *//**
                * Method: getPlayerID() Getter method for the playerID attribute
                * @return playerID object attributes if it exists in the room, null otherwise
                *//*
	public Player getPlayerID() {
		if(!this.playerID.getName().equals(null)) {
			return this.playerID;
		}
		return null;
	}

                 *//**
                 * Method: setPlayerID() Setter method for the playerID attribute
                 * @param Player playerID sets the PlayerID
                 *//*
	public void setPlayerID(Player playerID) {
		this.playerID = playerID;
	}

	public void setConsole(ConsoleView console) {
		this.console = console;
	}


                  * Method: printRoomInfo()  Converts the attributes of the class to a text readable
                  * format.
                  * 
                  * Used to replace the standard toString() method

	public void printRoomInfo() {
		String str = "You are on Level: " + getRmLevel() + ".  You're in Room: " + getRmId() + " --> " + getRmName() + ".  It's Doors are: " + getRmDoor() + ".\n"
		 + "Rooms' Monster is: " +  monsterObj + ".\n" + "Rooms' Puzzle is: " + getPuzzleObj().getPzlName() + ".\n"
		 + "Rooms' Artifact is: " + getItemObj().getName();

		console.printConsoleView(str);

	}		
}*/

