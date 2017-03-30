package Controller;

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
		
		//Instantiate
		Map<String,Room> roomInfoMap = new HashMap<String,Room>();
		RoomLibrary_HashMap roomlibrary = new RoomLibrary_HashMap();
		
		roomInfoMap = roomlibrary.getRoomsAL();
		
		Iterator iterate = roomInfoMap.entrySet().iterator();
		
		/*while(iterate.hasNext())
		{
			Map.Entry roomobj = (Map.Entry<String, Room>)iterate.next();
			System.out.println(roomobj.getKey().toString());
			//System.out.println(roomlibrary.getRmDescript(roomobj.getKey().toString()));
		}*/
		
		Room CurrentRoom = roomInfoMap.get("RM101");
		
		System.out.println(roomlibrary.getRmDescript(CurrentRoom.getRmId()));
		
	}

}
