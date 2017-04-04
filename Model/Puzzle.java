package Model;

import java.util.ArrayList;

public class Puzzle 
{

	private String plzId;
	private String plzName;
	private String plzDescription;
	private String answer;
	private String reward;
	private Room rmID;
	
	public Puzzle (String plzId, String plzName, String plzDescription, String answer, String reward){
		this.plzId = plzId;
		this.plzName = plzName;
		this.plzDescription = plzDescription;
		this.answer = answer;
		this.reward = reward;
		
	}
	
	public Puzzle(String plzId ) {
		
		if(plzId.equalsIgnoreCase("PL0001")) {
			plzName = "Shiny days";
			plzDescription = "What people can go five days without sleep?";
			answer = "Sleeping during the night";
			reward = "Healing Mushroom";
		}
		
		if(plzId.equalsIgnoreCase("PL0002")) {
			plzName = "Fire";
			plzDescription = "If you enter into the 'dark room'. Inside the room has oil lamp, kindling wood, match, and candle. Which one do you light first?";
			answer = "Match";
			reward = "Tri-Shroom Bow ";
		}
		
		if(plzId.equalsIgnoreCase("PL0003")) {
			plzName = "Up and Down";
			plzDescription = "What goes up and down but remain in the same place?";
			answer = "Stairs";
			reward = "Coin of Brutality ";
		}
		if(plzId.equalsIgnoreCase("PL0004")) {
			plzName = "Quarter";
			plzDescription = "What has a head and a tail?";
			answer = "A Coin";
			reward = "Coin of Toughness ";
		}
		if(plzId.equalsIgnoreCase("PL0005")) {
			plzName = "Light";
			plzDescription = "You feed me and I live, but you gave me drink and I die. Who am I?";
			answer = "Fire";
			reward = "Fire Flower";
		}
		if(plzId.equalsIgnoreCase("PL0006")) {
			plzName = "Mirrors";
			plzDescription = "Imagine you are in a beautiful garden, full of gorgeous flowers, you see a building at the end of the garden. You enter to the building, mirrors are everywhere you just see yourself. You are scared.'How do you get out???'";
			answer = "Stop Imagining";
			reward = "Poison Goomba ";
		}
		
		if(plzId.equalsIgnoreCase("PL0007")) {
			plzName = "Special Room";
			plzDescription = "What room does not have a door/window, and no one can enter?";
			answer = "Mushroom";
			reward = "Healing Mushroom";
		}	
	}

	public String getPlzId() {
		return plzId;
	}

	public void setPlzId(String plzId) {
		this.plzId = plzId;
	}

	public String getPlzName() {
		return plzName;
	}

	public void setPlzName(String plzName) {
		this.plzName = plzName;
	}

	public String getPlzDescription() {
		return plzDescription;
	}

	public void setPlzDescription(String plzDescription) {
		this.plzDescription = plzDescription;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public Room getRmID() {
		return rmID;
	}

	public void setRmID(Room rmID) {
		this.rmID = rmID;
	}
	
}

