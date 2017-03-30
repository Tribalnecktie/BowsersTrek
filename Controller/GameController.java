package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Model.*;

/**
 * @author  Tobin Crone
 * @version 1.0
 * Purpose: This will serve as the main game Controller object. Inputs from the Model will be received.
 * 			These inputs will then be pushed to the View Object to be displayed.
 */

public class GameController 
{
	/*
	 * TODO:	Create Model Class Objects
	 * 			Populate with current working data set
	 * 			Send appropriate object data to the View for display
	 */
	
	public static void main(String[] args)
	{
		
		//Creating our Room Objects with the RoomLibrary_HashMap class
		System.out.println("\nStarting RoomLibrary_HashMap example");
		Map<String,Room> roomInfoMap = new HashMap<String,Room>();
		RoomLibrary_HashMap roomlibrary = new RoomLibrary_HashMap();
		
		//Set 
		roomInfoMap = roomlibrary.getRoomsAL();
		
		//Loop through and print every Key in the HashMap.
		Iterator iterate = roomInfoMap.entrySet().iterator();
		while(iterate.hasNext())
		{
			Map.Entry roomobj = (Map.Entry<String, Room>)iterate.next();
			System.out.println(roomobj.getKey().toString());
			//System.out.println(roomlibrary.getRmDescript(roomobj.getKey().toString()));
		}
		
		Room CurrentRoom = roomInfoMap.get("RM101");
		
		System.out.println(roomlibrary.getRmDescript(CurrentRoom.getRmId()));
		
		
		//Trying with original RoomLibrary class
		System.out.println("\nStarting RoomLibrary example");
		RoomLibrary rl = new RoomLibrary();
		ArrayList<Room> roomList = rl.roomsAL();
		
		for(int x = 0; x < roomList.size(); x++)
		{			
			Room thisroom = roomList.get(x);
			System.out.println(thisroom.getRmId());
		}
		
		
	}

}
