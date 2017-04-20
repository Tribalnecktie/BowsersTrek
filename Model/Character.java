package Model;

import java.io.Serializable;

/**
 * Class: Room
 * 
 * @author Matthew Coker
 * @version 1.1
 * Course : ITEC 3860 Spring 2017
 * Written: April 20, 2017
 *
 *  This class holds attributes and methods that the Player and Monster will inherit
 *          
 *  Purpose: To server to making writing Monster and Player more streamlined
 **/
public abstract class Character implements Serializable{
	protected String name;
	protected int health;
	protected int attackPower;
	
	/*
	public Character()
	{
		
	}
	*/

	/**
	 * Method: getName
	 * Gets the name of the Character
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method: setName
	 * Sets the name of the character
	 * @param String
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Method: getHealth
	 * Gets the health of the character
	 * @return int
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Method: setHealth
	 * Sets the health of the character
	 * @param int
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * Method: getAttackPower
	 * Gets the attack power of the Character
	 * @return int
	 */
	public int getAttackPower() {
		return attackPower;
	}

	/**
	 * Method: setAttackPower
	 * Sets the attack power of the Character
	 * @param int
	 */
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
}
