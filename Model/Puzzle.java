package Model;

public class Puzzle 
{

	private String ID;
	private String pzlName;
	private String pzlDescription;
	private String pzlHint;
	private String answer;
	private boolean pzlStatus;
	private ArtifactTest reward;
	private Room rmID;
	
	public Puzzle (String ID, String plzName, String plzDescription, String pzlHint, String answer, ArtifactTest reward){
		this.ID = ID;
		this.pzlName = plzName;
		this.pzlDescription = plzDescription;
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
			reward = new ArtifactTest("A0000");
		}
		
		if(ID.equals("PL0002")) {
			pzlStatus = false;
			pzlName = "Fire";
			pzlDescription = "If you enter into the 'dark room'. Inside the room has oil lamp, kindling wood, match, and candle. Which one do you light first?";
			pzlHint = "Not the candle";
			answer = "Match";
			reward = new ArtifactTest("A0003");
		}
		
		if(ID.equals("PL0003")) {
			pzlStatus = false;
			pzlName = "Up and Down";
			pzlDescription = "What goes up and down but remain in the same place?";
			pzlHint = "Sta...";
			answer = "Stairs";
			reward = new ArtifactTest("A0012");
		}
		if(ID.equals("PL0004")) {
			pzlStatus = false;
			pzlName = "Quarter";
			pzlDescription = "What has a head and a tail?";
			pzlHint = "A pair of them can jingle in your pocket";
			answer = "A Coin";
			reward = new ArtifactTest("A0011");
		}
		if(ID.equals("PL0005")) {
			pzlStatus = false;
			pzlName = "Light";
			pzlDescription = "You feed me and I live, but you gave me drink and I die. Who am I?";
			pzlHint = "... and Ice";
			answer = "Fire";
			reward = new ArtifactTest("A0004");
		}
		if(ID.equals("PL0006")) {
			pzlStatus = false;
			pzlName = "Mirrors";
			pzlDescription = "Imagine you are in a beautiful garden, full of gorgeous flowers, you see a building at the end of the garden. You enter to the building, mirrors are everywhere you just see yourself. You are scared.'How do you get out???'";
			pzlHint = "'Imagine'";
			answer = "Stop Imagining";
			reward = new ArtifactTest("A0001");
		}
		
		if(ID.equals("PL0007")) {
			pzlStatus = false;
			pzlName = "Special Room";
			pzlDescription = "What room does not have a door/window, and no one can enter?";
			pzlHint = "Aren't these puzzle Fun, Gus?";
			answer = "Mushroom";
			reward = new ArtifactTest("A0000");
		}	
	}

	public String getID() {
		return ID;
	}

	public void setPzlId(String ID) {
		this.ID = ID;
	}

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

	public void setPzlDescription(String pzlDescription) {
		this.pzlDescription = getPzlDescription();
	}
	
	public String getHint(){
		return pzlHint;
	}
	
	public void setHint(String pzlHint){
		this.pzlHint = pzlHint;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public ArtifactTest getReward() {
		return reward;
	}

	public void setReward(ArtifactTest reward) {
		this.reward = reward;
	}

	public Room getRmID() {
		return rmID;
	}

	public void setRmID(Room rmID) {
		this.rmID = rmID;
	}
	
}

