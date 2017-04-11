package Model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveState {

	public void saveTheGame(Player player)
	{

	}

	public void writeBin(Player player)
	{
		try 
		{
			ObjectOutputStream outfile = new ObjectOutputStream(new FileOutputStream("test.bin"));
			//lets write the attribute of player
			outfile.writeObject(player);

			outfile.close();

		}
		catch (Exception e)
		{
			e.printStackTrace();	
		}
	}
	
	public void loadBin()
	{
		
	}
}