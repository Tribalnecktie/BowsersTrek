package Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import Model.Room2;
import Model.RoomLibray.RoomLibrary;

public class mainTestLibrary {

	public static void main(String[] args) 
	{
		
			RoomLibrary rl = new RoomLibrary();
			Map<String,Room2> roomInfo = new HashMap<String,Room2>();
			Room2 currentRoom = roomInfo.get("RM104");
			
			rl.printRoomInfo();
			
	}
}


