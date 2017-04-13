package Model;

import java.io.*;

public class SaveState {

	public void saveTheGame(Player player)
	{

	}

	public void writeBin(Player player, RoomLibrary_HashMap rooms)
	{
		try 
		{
			ObjectOutputStream playerFile = new ObjectOutputStream(new FileOutputStream("playerTest.bin"));
			//lets write the attribute of player
			playerFile.writeObject(player);

			playerFile.close();

		}
		catch (Exception e)
		{
			e.printStackTrace();	
		}
		try
		{
			ObjectOutputStream roomsFile = new ObjectOutputStream(new FileOutputStream("roomsTest.bin"));
			roomsFile.writeObject(rooms);
			
			roomsFile.close();
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
		
	}
	public void loadMap(RoomLibrary_HashMap rooms) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream roomsInFile = new ObjectInputStream(new FileInputStream("roomsTest.bin"));
		rooms = (RoomLibrary_HashMap) roomsInFile.readObject();
		roomsInFile.close();
	}
}