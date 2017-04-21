package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LoadRoomObj {
	
	private HashMap<String, RoomClass> roomsList = new HashMap<String, RoomClass>(); //static to make available to entire class

	public HashMap<String, RoomClass> getRoomsList()
	{
		return roomsList;		
	}

	public HashMap<String, RoomClass> loadRooms(String fileName) {

		Scanner roomReader = null;  //open a Scanner to read data from File 
		File roomTextFile = new File("roomObjects.txt");

		try
		{
			roomReader = new Scanner(roomTextFile);  //open text file			
		}
		catch (FileNotFoundException nfe) 
		{
			System.out.println("No room object found- room file is empty");
		}

		String line; //used to store lines of text file
		while (roomReader != null && roomReader.hasNext())
		{
			line = roomReader.nextLine();
			String[] rawData = line.split("\\* "); //stores each piece of data delimited by "* " into an array

			if(rawData[1].equalsIgnoreCase("RM101")) {            
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM101", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("HW_L1")) { 
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()), rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("HW_L1", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM102")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM102", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM103")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM103", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM104")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM104", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM105")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM105", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM106")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM106", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM107")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM107", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("HW_L2")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("HW_L2", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM201")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM201", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM202")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM202", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM203")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM203", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM204")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM204", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM205")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM205", tempRoom);
			}

			if(rawData[1].equalsIgnoreCase("RM206")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM206", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM207")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM207", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("HW_L3")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("HW_L3", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM301")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM301", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM302")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM302", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM303")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM303", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM304")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM304", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM305")) {
				RoomClass tempRoom = new  RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM305", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("HW_L4")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("HW_L4", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM401")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM401", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM402")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM402", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM403")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM403", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM404")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM404", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM405")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM405", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM406")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM406", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM407")) {
				RoomClass tempRoom = new RoomClass(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM407", tempRoom);
			}

		}
		//roomReader.close();
		return roomsList;
	}

}
