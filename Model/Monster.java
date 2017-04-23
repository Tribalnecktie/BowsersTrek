package Model;

import java.util.Scanner;

/**
 * Class: Room
 * 
 * @author Matthew Coker
 * @version 1.2
 * Course : ITEC 3860 Spring 2017
 * Written: April 20, 2017
 *
 *  This class holds relevant information for the Monster Class
 *          
 *  Purpose: Allows the player to interact and retrieve items from the monster when it is defeated 
 **/
public class Monster extends Character {
	
	String ID;
	String description;
	Artifact itemDrop;
	boolean isAlive;
	
	/**
	 * Default constructor
	 */
	public Monster () {
		
	}
	/**
	 * Constructor: Monster
	 * Creates a Monster with all the passed attributes
	 * @param String ID, String name, int health, int attackPower, String description, Artifact itemDrop
	 */
	public Monster(String ID, String name, int health, int attackPower, String description, Artifact itemDrop)
	{
		this.ID = ID;
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
		this.description = description;
		this.itemDrop = itemDrop;
		this.isAlive = true;
	}
	
	/**
	 * Method: isAlive
	 * Returns the isAlive boolean
	 * @return boolean
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * Method: setAlive
	 * Sets the setAlive boolean through the passed argument
	 * @param boolean
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	/**
	 * Method: attack
	 * Enables the monster to attack the player and affect their health in relation to the monster's attack power
	 * @param Player
	 */
	void attack(Player player)
	{
		player.health -= attackPower;
	}

	/**
	 * Method: getID
	 * Returns the Monster's ID
	 * @return String
	 */
	public String getID() {
		return ID;
	}

	/**
	 * Method: setID
	 * Sets the Monster's ID through the passed argument
	 * @param String
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * Method: getDescription
	 * Returns the Monster's description which is a String
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Method: setDescription
	 * Sets the Mosnter's description through the String passed
	 * @param String
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Method: getItemDrop
	 * Returns the itemDrop of the Monster which is of type Artifact
	 * @return Artifact
	 */
	public Artifact getItemDrop() {
		return itemDrop;
	}

	/**
	 * Method: setItemDrop
	 * Sets the Artifact that the Monster is holding to the passed new Artifact
	 * @param Player
	 */
	public void setItemDrop(Artifact itemDrop) {
		this.itemDrop = itemDrop;
	}
	
	/**
	 * Method: encounterEnemy
	 * Runs an encounter loop that has the player battling the monster, affectiong statistics and the player backpack
	 * @param Player, Monster, Backpack
	 */
	public void encounterEnemy(Player player, Monster tempMonster, Backpack pack)
	{
		Scanner playerInput = new Scanner(System.in);
		boolean inEncounter = true;
		//Monster tempMonster = mList[0];
		if (tempMonster.getHealth() <= 0)
		{
			System.out.println("You have already slain this monster");
			this.isAlive = false;
			playerInput.close();
			inEncounter = false;
			return;
		}

		System.out.println(tempMonster.getDescription());
		while (inEncounter == true)
		{
			if (player.getHealth() <= 0)
			{
				System.out.println("You died, Better Luck Next TIme");
				inEncounter = false;
				playerInput.close();
			}
			else if (tempMonster.getHealth() <= 0 && inEncounter == true)
			{
				System.out.println("You have slain the beast here is your reward");
				System.out.println(tempMonster.getItemDrop().getName() + " added to your inventory");
				pack.addArtifact(tempMonster.getItemDrop().getID(), tempMonster.getItemDrop());
				player.addScore(tempMonster);
				inEncounter = false;
				playerInput.close();
			}
			else
			{
				System.out.println("\nYour Health " + player.getHealth() + "\n");
				
				System.out.println("1. Attack");
				System.out.println("2. Inventory");
				System.out.println("3. Examine Monster");
				System.out.println("4. Escape");
				int command = playerInput.nextInt();
				if (command == 1)
				{
					System.out.println("You attack for " + player.getAttackPower());
					player.attack(tempMonster);
					System.out.println("Monster Health " + tempMonster.getHealth());
					System.out.println(tempMonster.getName() + " attacks you for " + tempMonster.getAttackPower() + " Health");
					tempMonster.attack(player);
					
				}
				else if (command == 2)
				{
					pack.printBackpack(); 
					
				}
				else if (command == 3)
				{
					System.out.println("Upon examining " + tempMonster.getName() + " you see:");
					System.out.println("Monster Health: " + tempMonster.getHealth());
					System.out.println("Monster Attack Power: " + tempMonster.getAttackPower());
					System.out.println("Item held: " + tempMonster.getItemDrop().name);
				}
				else if (command == 4)
				{
					System.out.println("You've escaped with your life");
					inEncounter = false;
					playerInput.close();
				}
			}
		}
	}
	

	/*
	if (ID.equals("ML00"))
	{
		name = "Yoshi";
		health = 5;
		attackPower = 1;
		itemDrop = new Artifact("A0000");
		description = "An intriguingly mesmerizing horse-lizard that appears to be plain, dumb and insignificant. You�re not really sure if it wants to eat or whether it knows you are even there. Feel free to consider it harmless... if you are a fool.";
	}
	else if (ID.equals("ML01"))
	{
		name = "Toad";
		health = 5;
		attackPower = 1;
		itemDrop = new Artifact("A0003");
		description = "A seemingly asexual being, possibly a human being that happens to have a living mushroom on its head. He seems moderately friendly. You�re not sure whether to ignore it or to make mushroom pizza.";
	}
	else if (ID.equals("ML02"))
	{
		name = "Luigi";
		health = 8;
		attackPower = 2;
		itemDrop = new Artifact("A0010");
		description = "A medium sized, clumsy, defenseless man. If you�re not careful he�ll give you some damage. As long as you stay on your toes, you should be good.";
	}
	else if (ID.equals("ML03"))
	{
		name = "Daisy";
		health = 8;
		attackPower = 2;
		itemDrop = new Artifact("A0006");
		description = "A lean, agile, and weak girl. She is as afraid of you as you are of her. But don�t underestimate her, she can give you significant damage.";
	}
	else if (ID.equals("ML04"))
	{
		name = "Mario";
		health = 12;
		attackPower = 3;
		itemDrop = new Artifact("A0011");
		description = "A short, stubby, hyperactive man with a lot of will and determination. He will mess you up if you don�t put up a good fight.";
	}
	else if (ID.equals("ML05"))
	{
		name = "Peach";
		health = 12;
		attackPower = 3;
		itemDrop = new Artifact("A0007");
		description = "A beautiful, graceful girl with a lot of guts. She won�t take you lightly, and you shouldn�t take her lightly either.";
	}
	else if (ID.equals("ML06"))
	{
		name = "Wario";
		health = 15;
		attackPower = 4;
		itemDrop = new Artifact("A0007");
		description = "A fat, slow, yet dangerous old man. One moment he�s trying to tell you a bad joke, the next you are staring death in the face.";
	}
	else if (ID.equals("ML07"))
	{
		name = "Waluigi";
		health = 16;
		attackPower = 5;
		itemDrop = new Artifact("A0009");
		description = "A tall, lanky old man. He smells as bad as he looks. He will totally rip your heart out if you let him, so beware.";
	}
	else

		System.out.println("Invalid ID");
	*/
	

}
