package Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Class: MonsterLibrary_HashMap
 * 
 * @author Matthew Coker
 * @version 1.0
 * Course : ITEC 3860 Spring 2017
 * Written: April 20, 2017
 *
 *  This class holds a hashmap of all the available Monsters in the game
 *          
 *  Purpose: So that the room classes may be able to retrieve the information and roll efficiently
 **/
public class MonsterLibrary_HashMap {

	private Map<String,Monster> monsterAL = new HashMap<String,Monster>();
	/*
	protected String ID;
	protected String description;
	protected Artifact itemDrop;
	*/
	
	/**
	 * Constructor: MonsterLibrary_HashMap
	 * Creates a hashmap that is filled with monsters
	 */
	public MonsterLibrary_HashMap()
	{
		this.monsterAL = monsterAL();
	}
	
	/**
	 * Method: monsterAL
	 * Sets all the Monster's attributes
	 * @return Map<String, Monster>
	 */
	public Map<String, Monster> monsterAL()
	{
		//All monsters into an array
		monsterAL.put("ML00", new Monster("ML00", "Yoshi", 5, 1, getMonsterDesc("ML00"), new Artifact("A0000")));
		monsterAL.put("ML01", new Monster("ML01", "Toad", 5, 1, getMonsterDesc("ML01"), new Artifact("A0001")));
		monsterAL.put("ML02", new Monster("ML02", "Luigi", 8, 2, getMonsterDesc("ML02"), new Artifact("A0010")));
		monsterAL.put("ML03", new Monster("ML03", "Daisy", 8, 2, getMonsterDesc("ML03"), new Artifact("A0006")));
		monsterAL.put("ML04", new Monster("ML04", "Mario", 12, 3, getMonsterDesc("ML04"), new Artifact("A0011")));
		monsterAL.put("ML05", new Monster("ML05", "Peach", 12, 3, getMonsterDesc("ML05"), new Artifact("A0007")));
		monsterAL.put("ML06", new Monster("ML06", "Wario", 15, 4, getMonsterDesc("ML06"), new Artifact("A0007")));
		monsterAL.put("ML07", new Monster("ML07", "Waluigi", 16, 5, getMonsterDesc("ML07"), new Artifact("A0009")));
		return monsterAL;
	}
	
	/**
	 * Method: getMonsterDesc
	 * Retrieves the Monster's description so that it may be used in the monsterAL method,
	 * separated for convenience
	 * @param String
	 */
	public String getMonsterDesc(String ID)
	{
		String tempDesc = "N/A";
		if (ID.equals("ML00"))
		{
			tempDesc = "An intriguingly mesmerizing horse-lizard that appears \nto be plain, dumb and insignificant. You're not really sure if it \nwants to eat or whether it knows you are even there. Feel free to \nconsider it harmless... if you are a fool.";
		}
		else if (ID.equals("ML01"))
		{
			tempDesc = "A seemingly asexual being, possibly a human being that \nhappens to have a living mushroom on its head. He seems moderately \nfriendly. You're not sure whether to ignore it or to make \nmushroom pizza.";
		}
		else if (ID.equals("ML02"))
		{
			tempDesc = "A medium sized, clumsy, defenseless man. If you're not \ncareful he'll give you some damage. As long as you stay on your \ntoes, you should be good.";
		}
		else if (ID.equals("ML03"))
		{
			tempDesc = "A lean, agile, and weak girl. She is as afraid of you as \nyou are of her. But don't underestimate her, she can give you \nsignificant damage.";
		}
		else if (ID.equals("ML04"))
		{
			tempDesc = "A short, stubby, hyperactive man with a lot of will and \ndetermination. He will mess you up if you don't put up a good \nfight.";
		}
		else if (ID.equals("ML05"))
		{
			tempDesc = "A beautiful, graceful girl with a lot of guts. She won't \ntake you lightly, and you shouldn't take her lightly either.";
		}
		else if (ID.equals("ML06"))
		{
			tempDesc =  "A fat, slow, yet dangerous old man. One moment he's trying \nto tell you a bad joke, the next you are staring death in the face.";
		}
		else if (ID.equals("ML07"))
		{
			tempDesc = "A tall, lanky old man. He smells as bad as he looks. He will \ntotally rip your heart out if you let him, so beware.";
		}
		else
			System.out.println("Not Available");
		
		return tempDesc;
		
	}
}
