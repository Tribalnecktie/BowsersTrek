package Model;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SaveState {

	public void saveTheGame(Player player)
	{

	}

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
	
	public void writeInventory(Backpack pack)
	{
		//Reading all the keys to an array
		String[] keysArray = new String[13];
		int i = 0;
		for (String key: pack.userBackpack.keySet())
		{
			keysArray[i] = key;
			i++;
		}

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
		
		//Time to read all those artifacts from that array into a file
		
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
	

	public void loadPlayer(Player player) throws IOException, ClassNotFoundException, FileNotFoundException
	{
		ObjectInputStream playerInFile = new ObjectInputStream(new FileInputStream("playerTest.bin"));
		player = (Player)playerInFile.readObject();
		playerInFile.close();
		System.out.println("Player load successful");
	}
	
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
		
		//Now we must retrieve the array of Artifacts
		ObjectInputStream packArtifactsInFile = new ObjectInputStream(new FileInputStream("packArtifactsTest.bin"));
		Artifact[] artifactsArray = new Artifact[13];
		artifactsArray = (Artifact[])packArtifactsInFile.readObject();
		
		packArtifactsInFile.close();
		
		for (int i = 0; i < keysArray.length; i++)
		{
			if (keysArray[i] != null)
			pack.addArtifact(keysArray[i], new Artifact(keysArray[i]));
		}
		
		System.out.println("Now reading the backpack");
		for (String key: pack.userBackpack.keySet())
		{
			System.out.println(pack.userBackpack.get(key));
		}
		/*
		Map<String, Artifact> sudoPack = new HashMap<String, Artifact>();
		for (int i = 0; i < keysArray.length; i++)
		{
			sudoPack.put(keysArray[i], artifactsArray[i]);
		}
		for (String key: sudoPack.keySet())
		{
			System.out.println(sudoPack.get(key));
		}
		*/
		//pack.userBackpack = sudoPack;
		
		//pack.userBackpack = sudoPack;
		
	}
}