package Model;

import java.io.*;

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
		ObjectInputStream packInFile = new ObjectInputStream(new FileInputStream("packTest.bin"));
		pack = (Backpack)packInFile.readObject();
		packInFile.close();
		System.out.println("Backpack load successful");
	}
}