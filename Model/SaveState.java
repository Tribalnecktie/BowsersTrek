package Model;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Class: SaveState
 * 
 * @author Matthew Coker
 * @version 1.1
 * Course : ITEC 3860 Spring 2017
 * Written: April 20, 2017
 *
 *  This class is meant to save and load the state of a player, their inventory, and their location
 *          
 *  Purpose: So that the player who controls their game can save their progress and load when they need to 
 **/
public class SaveState {

	/**
	 * Method: saveTheGame
	 * Calls methods below in order to write the game's progress to a file
	 * @param Player, Backpack
	 */
	public void saveTheGame(Player player, Backpack pack)
	{
		writePlayer(player);
		writeInventory(pack);
	}
	
	//WARNING ON LOAD THE GAME, ONLY LOADS THE INVENTORY
	/**
	 * Method: loadTheGame
	 * Loads the Player and Inventory from the bin files
	 * @param Player, Backpack
	 */
	public void loadTheGame(Player player, Backpack pack) throws ClassNotFoundException, FileNotFoundException, IOException
	{
		//loadPlayer(player);
		loadInventory(pack);
	}
	
	public void writeRoom(String rm)
	{
		try
		{
			ObjectOutputStream roomFile = new ObjectOutputStream(new FileOutputStream("roomTest.bin"));
			roomFile.writeObject(rm);
			roomFile.close();
			System.out.println("Room write successful");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String loadTheRoom() throws ClassNotFoundException, IOException
	{
		ObjectInputStream roomInFile = new ObjectInputStream(new FileInputStream("roomTest.bin"));
		String room = (String)roomInFile.readObject();
		roomInFile.close();
		System.out.println("Room load success");
		//System.out.println("");
		
		return room;
	}

	/**
	 * Method: writePlayer
	 * Writes the object of Player into a text file
	 * @param Player
	 */
	public void writePlayer(Player player)
	{
		try
		{
			ObjectOutputStream playerFile = new ObjectOutputStream(new FileOutputStream("playerTest.bin"));
			playerFile.writeObject(player);
			playerFile.close();
			System.out.println("Player write successful");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Method: writeInventory
	 * Deconstructs the inventory hashmap and takes those keys
	 * reads them into an array and then a file
	 * @param Backpack
	 */
	public void writeInventory(Backpack pack)
	{
		//Reading all the keys to an array
		String[] keysArray = new String[13];
		int[] qArray = new int[13];
		int i = 0;
		for (String key: pack.userBackpack.keySet())
		{
			keysArray[i] = key;
			qArray[i] = pack.userBackpack.get(key).getQuantity();
			i++;
		}
		
		//Reading all the artifacts of those keys to an array
		/*
		Artifact[] artifactsArray = new Artifact[13];
		i = 0;
		for (String key: pack.userBackpack.keySet())
		{
			artifactsArray[i] = pack.userBackpack.get(key);
			i++;
		}
		*/
		//Time to read all those keys from the String array into a file
		try
		{
			ObjectOutputStream packFile = new ObjectOutputStream(new FileOutputStream("packKeysTest.bin"));
			packFile.writeObject(keysArray);
			packFile.close();
			System.out.println("BackPack write successful");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			ObjectOutputStream qFile = new ObjectOutputStream(new FileOutputStream("packQTest.bin"));
			qFile.writeObject(qArray);
			qFile.close();
			System.out.println("BackPack Q write successful");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		/*
		try
		{
			ObjectOutputStream packFile = new ObjectOutputStream(new FileOutputStream("packTest.bin"));
			packFile.writeObject(pack);
			packFile.close();
			System.out.println("BackPack write successful");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		*/
	}
	
	/**
	 * Method: loadPlayer
	 * Loads the player from a file
	 * @param Player
	 */
	public Player loadPlayer() throws IOException, ClassNotFoundException, FileNotFoundException
	{
		ObjectInputStream playerInFile = new ObjectInputStream(new FileInputStream("playerTest.bin"));
		Player player = (Player)playerInFile.readObject();
		playerInFile.close();
		System.out.println("In loadPlayer " + player.getHealth());
		System.out.println("Player load successful");
		
		return player;
	}
	
	/**
	 * Method: loadInventory
	 * Loads the inventory from a text file and reconstructs the hashmap using the keys
	 * and the Artifact constructor
	 * @param Backpack
	 */
	public void loadInventory(Backpack pack) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		System.out.println("This is where we read the keys");
		ObjectInputStream packKeysInFile = new ObjectInputStream(new FileInputStream("packKeysTest.bin"));
		String [] keysArray = new String[13];
		keysArray = (String[])packKeysInFile.readObject();
		packKeysInFile.close();
		for (int i = 0; i < keysArray.length; i++)
		{
			System.out.println(keysArray[i]);
		}
		System.out.println("Backpack load successful");
		
	
		ObjectInputStream packQInFile = new ObjectInputStream(new FileInputStream("packQTest.bin"));
		int [] qArray = new int[13];
		qArray = (int[])packQInFile.readObject();
		packQInFile.close();
		
		Map<String, Artifact> sudoPack = new HashMap<String, Artifact>();
		for (int i = 0; i < keysArray.length; i++)
		{
			if (keysArray[i] != null)
			{
			sudoPack.put(keysArray[i], new Artifact(keysArray[i]));
			sudoPack.get(keysArray[i]).setQuantity(qArray[i]);
			}
		}
		pack.userBackpack = sudoPack;
		
		//pack.userBackpack = sudoPack;
		
		//pack.userBackpack = sudoPack;
		
	}
}