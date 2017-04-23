package Model;

/**
 * Class: Room
 * 
 * @author Matthew Coker
 * @version 1.3
 * Course : ITEC 3860 Spring 2017
 * Written: April 20, 2017
 *
 *  This class holds relevant information for the Player
 *          
 *  Purpose: So that Player can attack, get attacked, and get score from Monsters
 **/
public class Player extends Character {

	private int score;
	
	/**
	 * Constructor: Player
	 * Creates a Player with all the default attributes
	 */
	public Player()
	{
		name = "Player";
		health = 20;
		attackPower = 1;
		score = 0;
	}
	
	/**
	 * Method: getScore
	 * Returns the score of the Player
	 * @return int
	 */
	public int getScore()
	{
		return score;
	}

	/**
	 * Method: attack
	 * Allows the player an object of type Monster
	 * @param Monster
	 */
	public void attack(Monster monster)
	{
		monster.health -= attackPower;
	}
	
	/**
	 * Method: addScore
	 * Adds the appropriate score to the Player depending on the Monster's ID
	 * @param Monster
	 */
	public void addScore(Monster monster)
	{
		if (monster.getID().equals("ML00"))
		{
			score += 10;
		}
		else if (monster.getID().equals("ML01"))
		{
			score += 15;
		}
		else if (monster.getID().equals("ML02"))
		{
			score += 25;
		}
		else if (monster.getID().equals("ML03"))
		{
			score += 35;
		}
		else if (monster.getID().equals("ML04"))
		{
			score += 50;
		}
		else if (monster.getID().equals("ML05"))
		{
			score += 65;
		}
		else if (monster.getID().equals("ML06"))
		{
			score += 80;
		}
		else if (monster.getID().equals("ML07"))
		{
			score += 100;
		}
		else 
		{
			System.out.println("Invalid Monster ID, check Player.java for errors in addScore");
		}
	}
	
	public void viewStatus()
	{
		System.out.println("Player Health: " + this.health + " Score: " + this.score);
	}
	
}