/**
 * 
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tobin
 *
 */
public class MenuOptions 
{
	
	//String is roomid
	//Arraylist is the option list
	
	Map<String, ArrayList<String>> optionsMap = new HashMap<String, ArrayList<String>>();
	//this is our map attribute for this class.
	
	ArrayList<String> optionsList = new ArrayList<String>();
	
	public MenuOptions()
	{
		
		//String ID
		//String Array of each menu option avaialable for that room.	
		this.optionsMap = optionsAL();
	
	}
	
	public Map<String, ArrayList<String>> optionsAL()
	{
		
		//All monsters into an array
		
		optionsMap.put("RM101",addoptions("RM101"));
		optionsMap.put("RM102",addoptions("RM102"));

		return optionsMap;
		
	}
	
	public ArrayList<String> addoptions(String roomid)
	{
		
		if(roomid.equals("RM101"))
		{
			optionsList.add("Door1");
			optionsList.add("Door2");
			optionsList.add("Attack Monster");		
		}
		else if(roomid.equals("RM102"))
		{
			optionsList.add("Door2");
			optionsList.add("Door3");
			optionsList.add("Attack Monster");
			optionsList.add("View Inventory");
			optionsList.add("Check puzzle");
		}
		
		
		return optionsList;
		
	}
	
	
	

}
