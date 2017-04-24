package Model;

import java.util.Scanner;

public class Puzzle extends RoomClass
{

	private static Puzzle currentPuzzleID;
	private String pzlName;
	private String pzlDescription;
	private String pzlHint;
	private String answer;
	private boolean pzlStatus;
	private Artifact reward;
	private String rmID;
	
	/**
	 * Default constructor
	 */
	public Puzzle() {
		
	}
	public Puzzle (Puzzle ID, String pzlName, String pzlDescription, String pzlHint, String answer, Artifact reward){
		Puzzle.currentPuzzleID = ID;
		this.pzlName = pzlName;
		this.pzlDescription = pzlDescription;
		this.pzlHint = pzlHint;
		this.answer = answer;
		this.reward = reward;
		
	}
	
	public Puzzle(String ID ) {
		
		if(ID.equals("PL0001")) {
			pzlStatus = false;
			pzlName = "Shiny days";
			pzlDescription = "What people can go five days without sleep?";
			pzlHint = "Sleeping during...";
			answer = "Sleeping during the night";
			reward = new Artifact("A0000");
		}
		
		if(ID.equals("PL0002")) {
			pzlStatus = false;
			pzlName = "Fire";
			pzlDescription = "If you enter into the 'dark room'. Inside the room has oil lamp, kindling wood, match, and candle. Which one do you light first?";
			pzlHint = "Not the candle";
			answer = "Match";
			reward = new Artifact("A0003");
		}
		
		if(ID.equals("PL0003")) {
			pzlStatus = false;
			pzlName = "Up and Down";
			pzlDescription = "What goes up and down but remains in the same place?";
			pzlHint = "Sta...";
			answer = "Stairs";
			reward = new Artifact("A0012");
		}
		if(ID.equals("PL0004")) {
			pzlStatus = false;
			pzlName = "Quarter";
			pzlDescription = "What has a head and a tail?";
			pzlHint = "A pair of them can jingle in your pocket";
			answer = "A coin";
			reward = new Artifact("A0011");
		}
		if(ID.equals("PL0005")) {
			pzlStatus = false;
			pzlName = "Light";
			pzlDescription = "You feed me and I live, but you gave me drink and I die. Who am I?";
			pzlHint = "... and Ice";
			answer = "Fire";
			reward = new Artifact("A0004");
		}
		if(ID.equals("PL0006")) {
			pzlStatus = false;
			pzlName = "Mirrors";
			pzlDescription = "Imagine you are in a beautiful garden, full of gorgeous flowers, \n you see a building at the end of the garden. You enter to the building, mirrors are everywhere you just see yourself. \n You are scared.'How do you get out???'";
			pzlHint = "'Imagine'";
			answer = "Stop Imagining";
			reward = new Artifact("A0001");
		}
		
		if(ID.equals("PL0007")) {
			pzlStatus = false;
			pzlName = "Special Room";
			pzlDescription = "What room does not have a door/window, and no one can enter?";
			pzlHint = "Aren't these puzzles Fun, Gus?";
			answer = "Mushroom";
			reward = new Artifact("A0000");
		}	
		
		if(ID.equals("PL0008")) {
			pzlDescription = "There is no puzzle in this room.";
			pzlStatus = true;
		}
	}
	
	
	public void puzzleSolver(Puzzle puzzleObj, Backpack pack)
	{
		int numOfAttempts = 0;
		boolean inPuzzle = true;
		
		/*System.out.println(getPzlDescription());
		String answer = getAnswer();
		getHint();
		
		Scanner playerInput = new Scanner(System.in);
		String playerAnswer = playerInput.nextLine();*/
		
		while (inPuzzle == true && pzlStatus == false)
		{
			System.out.println(getPzlDescription());
			String answer = getAnswer();
			String hint = getHint();
			
			Scanner playerInput = new Scanner(System.in);
			String playerAnswer = playerInput.nextLine();
			if (numOfAttempts < 5)
			{
				
				
				if (playerAnswer.equals(answer))
				{
					System.out.println("You have correctly answer the puzzle!");
					System.out.println(puzzleObj.getReward() + " has been added to your inventory");
					pack.addArtifact(puzzleObj.getReward().getID(), puzzleObj.getReward());
					puzzleObj.setIsDone(true);
					inPuzzle = false;
					playerInput.close();
				}
				else
				{
					System.out.println("That is not the correct answer, please try again.");
					
					numOfAttempts += 1;
				}
			}
			else if (numOfAttempts >= 5 && numOfAttempts <= 10)
			{
				System.out.print("Looks like you are having a little trouble, here is a hint: ");
				System.out.print(hint);
				
				if (playerAnswer.equals(answer))
				{
					System.out.println("You have correctly answer the puzzle!");
					System.out.println(puzzleObj.getReward() + " has been added to your inventory");
					pack.addArtifact(puzzleObj.getReward().getID(), puzzleObj.getReward());
					puzzleObj.setIsDone(true);
					inPuzzle = false;
					playerInput.close();
				}
				else
				{
				numOfAttempts += 1;
				}
			}
			else
			{
				System.out.println("Would you like to come back to this puzzle later?");
				System.out.println("1. Come back to puzzle later");
				System.out.println("2. Keep trying");
				int command = playerInput.nextInt();
				if (command == 1)
				{
					System.out.println("You can always come back and try again, have a safe journey.");
					inPuzzle = false;
					playerInput.close();
				}
				else if (command == 2)
				{
					System.out.println("I like the spirit, lets keep trying.");
					numOfAttempts = 5;
				}
			}
		}
		//playerInput.close();
	}

	public static Puzzle getID() {
		Room rm = new Room();
		
		return rm.getPuzzleObj();
		
	}

	//public void setPzlId(Puzzle ID) {
		//Puzzle.currentPuzzleID = ID;
	//}

	public String getPzlName() {
		return pzlName;
	}

	public void setPzlName(String plzName) {
		this.pzlName = plzName;
	}
	
	public boolean getIsDone() {
		return pzlStatus;
	}
	
	public void setIsDone(boolean pzlStatus) {
		this.pzlStatus = pzlStatus;
	}

	public String getPzlDescription() {
		return pzlDescription;
	}

	//public void setPzlDescription(String pzlDescription) {
		//this.pzlDescription = getPzlDescription();
	//}
	
	public String getHint(){
		return pzlHint;
	}
	
	//public void setHint(String pzlHint){
		//this.pzlHint = pzlHint;
	//}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Artifact getReward() {
		return reward;
	}

	public void setReward(Artifact reward) {
		this.reward = reward;
	}

	public String getRmID() {
		return rmID;
	}

	public void setRmID(String rmID) {
		this.rmID = rmID;
	}
	
}

