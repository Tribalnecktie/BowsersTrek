package Model;

import java.io.Serializable;

/**
 * Class: Artifact
 * 
 * @author Matthew Coker
 * @version 1.1
 * Course : ITEC 3860 Spring 2017
 * Written: April 20, 2017
 *
 *  This class holds relevant information for the Artifacts
 *          
 *  Purpose: So that the Players may store their items(Artifacts) in the backpack HashMap and use them as such
 **/
public class Artifact implements Serializable {


	String ID;
	String name;
	String description;
	int strength;
	private boolean canHeal = false;
	private boolean addAtk = false;
	
	/**
	 * Constructor: Artifact
	 * Creates an Artifact that calls a method below to set all of its attributes
	 */
	public Artifact(String ID) {
		getArtifact(ID);
	}
	
	/**
	 * Method: getArtifact
	 * Retrieves the Artifacts attributes based on its attributes
	 * @param String
	 */
	void getArtifact(String ID)
	{
		if (ID.equals("A0000"))
		{
			this.ID = ID;
			this.name = "Healing Mushroom";
			this.description = "Consume the mushroom to regain some Health";
			this.strength = 2;
			this.setCanHeal(true);
			this.setAddAtk(false);
		}
		if (ID.equals("A0001"))
		{
			this.ID = ID;
			this.name = "Poison Goomba";
			this.description = "Using this Item will poison your attacks! More damage!!";
			this.strength = 4;
			this.setCanHeal(false);
			this.setAddAtk(true);
		}
		if (ID.equals("A0002"))
		{
			this.ID = ID;
			this.name = "Paralyzing Boo";
			this.description = "This ghost, if selected, can paralyze your enemy for you to catch your breath quickly";
			this.strength = 2;
			this.setCanHeal(false);
			this.setAddAtk(true);
		}
		if (ID.equals("A0003"))
		{
			this.name = "Tri-Shroombow";
			this.description = "This is an ordinary crossbow. With three times the arrows per shot";
			this.strength = 6;
			this.setCanHeal(false);
			this.setAddAtk(true);
		}
		if (ID.equals("A0004"))
		{
			this.name = "Fire Flower";
			this.description = "The fire flower is very useful if you want to keep your distance from your enemy.";
			this.strength = 5;
			this.setCanHeal(false);
			this.setAddAtk(true);
		}
		if (ID.equals("A0005"))
		{
			this.name = "Bowser's Flaming Sword";
			this.description = "This weapon is the rarest of them all. If found, you're in luck. Bowsers sword does very heavy damage.";
			this.strength = 25;
			this.setCanHeal(false);
			this.setAddAtk(true);
		}
		if (ID.equals("A0006"))
		{
			this.name = "Shroom Sword";
			this.description = "A long white piece of mushroom dotted with red spots and sharpened.";
			this.strength = 2;
			this.setCanHeal(false);
			this.setAddAtk(true);
		}
		if (ID.equals("A0007"))
		{
			this.name = "Shroom Bow";
			this.description = "A curved piece of brown mushroom with a string connecting the two ends.";
			this.strength = 2;
			this.setCanHeal(false);
			this.setAddAtk(true);
		}
		if (ID.equals("A0008"))
		{
			this.name = "Shroom Hammer";
			this.description = "A short mushroom stick with a very wide and dense end.";
			this.strength = 2;
			this.setCanHeal(false);
			this.setAddAtk(true);
		}
		if (ID.equals("A0009"))
		{
			this.name = "Shroom Gun";
			this.description = "A small, hollow curved mushroom with small mechanical components.";
			this.strength = 5;
			this.setCanHeal(false);
			this.setAddAtk(true);
			
		}
		if (ID.equals("A0010"))
		{
			this.name = "Coin of Constitution";
			this.description = "A green coin that shimmers and hums with magical energy";
			this.strength = 5;
			this.setCanHeal(true);
		}
		if (ID.equals("A0011"))
		{
			this.name = "Coin of Toughness";
			this.description = "A red coin that shimmers and hums with magical energy";
			this.strength = 10;
			this.setCanHeal(true);
		}
		if (ID.equals("A0012"))
		{
			this.name = "Coin of Brutality";
			this.description = "A blue coin that shimmers and \nhums with magical energy";
			this.strength = 5;
			this.setCanHeal(false);
			this.setAddAtk(true);
		}
	}

	/**
	 * getID
	 * Returns the ID of the Artifact
	 * @return String
	 */
	public String getID() {
		return ID;
	}

	/**
	 * Method: setID
	 * Sets the ID of an Artifact
	 * @param String
	 */
	public void setID(String iD) {
		this.ID = iD;
	}

	/**
	 * Method: getName
	 * Returns the Name of the Artifact
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method: setName
	 * Sets the name of an Artifact
	 * @param String
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method: getDescription
	 * Returns the String Description of an Artifact
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Method: setDescription
	 * Sets the String description of the Artifact
	 * @param String
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Method: getStrength
	 * Returns the int Strength of an Artifact
	 * @return int
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Method: setStrength
	 * Sets the Strength or potency of an Artifact
	 * @param int
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	public boolean isAddAtk() {
		return addAtk;
	}

	public void setAddAtk(boolean addAtk) {
		this.addAtk = addAtk;
	}

	public boolean isCanHeal() {
		return canHeal;
	}

	public void setCanHeal(boolean canHeal) {
		this.canHeal = canHeal;
	}
	
	

}
