/**
 * 
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Class: Menu Options
 * 
 * @author Tobin Crone and Katrina Smith 
 * @version 1.1 
 * Course : ITEC 3860 Spring 2017
 * Written: April 11, 2017
 *
 *  This class – Maps a list of MenuOptions to a specific Room ID that the player can choose from.
 *          
 *  Purpose: – Orient the player to the available options i.e. adjacent doors to a specified Room ID and if a Monster, Artifact and/or Puzzle is present in that particular Room. Player can also view Inventory and view their stats (health level).
 **/
public class MenuOptions 
{
	
	public Map<String, ArrayList<String>> optionsMap = new HashMap<String, ArrayList<String>>(); ; //String = Room object ID attribute, ArrayList<String> = optionsList
	public ArrayList<String> optionsList;  //ArrayList of String objects associated with a specific Room ID

	/**
	 * Method: MenuOptions() Constructor
	 */
	public MenuOptions()
	{
		this.optionsMap = optionsAL();
		this.optionsList = new ArrayList<String>();
	 
	}


	/**
	 * Method: getAddOptions() getter method for accessing optionsList 
	 * Creates an ArrayList of Strings that represent available menu options for the player to choose from
	 * @param rmID rmID from Room object
	 * @return optionsList of type ArrayList<String>
	 */
	public ArrayList<String> addOptions(String rmID)
	{
		if(rmID.equals("RM101"))
		{
			optionsList.add("DR101");
			optionsList.add("DR102");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("HW_L1"))
		{
			optionsList.add("DR101");
			optionsList.add("DR102");
			optionsList.add("DR103");
			optionsList.add("DR104");
			optionsList.add("DR105");
			optionsList.add("DR106");
			optionsList.add("DR107");
			optionsList.add("DR108");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}

		else if(rmID.equals("RM102"))
		{
			optionsList.add("DR102");
			optionsList.add("DR103");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("RM103"))
		{
			optionsList.add("DR103");
			optionsList.add("DR104");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("RM104"))
		{
			optionsList.add("DR104");
			optionsList.add("DR105");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("RM105"))
		{
			optionsList.add("DR105");
			optionsList.add("DR106");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("RM106"))
		{
			optionsList.add("DR106");
			optionsList.add("DR107");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("RM107"))
		{
			optionsList.add("DR107");
			optionsList.add("DR108");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("HW_L2"))
		{
			optionsList.add("DR201");  
			optionsList.add("DR202");
			optionsList.add("DR203");
			optionsList.add("DR205");
			optionsList.add("DR208");
			optionsList.add("DR209");
			optionsList.add("DR211");
			optionsList.add("DR212");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR201"))
		{
			optionsList.add("DR201");  
			optionsList.add("DR202");
			optionsList.add("DR203");
			optionsList.add("DR204");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR202"))
		{
			optionsList.add("DR205");  
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR203"))
		{
			optionsList.add("DR206");  
			optionsList.add("DR207");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR204"))
		{
			optionsList.add("DR207");  
			optionsList.add("DR208");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR205"))
		{
			optionsList.add("DR209");  
			optionsList.add("DR210");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR206"))
		{
			optionsList.add("DR210");  
			optionsList.add("DR211");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR207"))
		{
			optionsList.add("DR204");  
			optionsList.add("DR212");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("HW_L3"))
		{
			optionsList.add("DR300");  
			optionsList.add("DR301");
			optionsList.add("DR302");  
			optionsList.add("DR303");
			optionsList.add("DR304");  
			optionsList.add("DR306");
			optionsList.add("DR307");  
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR301"))
		{
			optionsList.add("DR300");  
			optionsList.add("DR301");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR302"))
		{
			optionsList.add("DR302");  
			optionsList.add("DR303");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR303"))
		{
			optionsList.add("DR306");  
			optionsList.add("DR307");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR304"))
		{
			optionsList.add("DR304");  
			optionsList.add("DR305");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR305"))
		{
			optionsList.add("DR315");  
			optionsList.add("DR316");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("HW_L4"))
		{
			optionsList.add("DR401");  
			optionsList.add("DR402");
			optionsList.add("DR403");  
			optionsList.add("DR405");
			optionsList.add("DR407");  
			optionsList.add("DR408");
			optionsList.add("DR409");  
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR401"))
		{
			optionsList.add("DR401");  
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR402"))
		{
			optionsList.add("DR402");  
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR403"))
		{
			optionsList.add("DR403"); 
			optionsList.add("DR404");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR404"))
		{
			optionsList.add("DR405");  
			optionsList.add("DR406");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR405"))
		{
			optionsList.add("DR406");  
			optionsList.add("DR407");
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR406"))
		{
			optionsList.add("DR408");  
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}
		else if(rmID.equals("DR407"))
		{
			optionsList.add("DR409");  
			optionsList.add("Attack Monster");
			optionsList.add("Check puzzle");
			optionsList.add("View Inventory");
			optionsList.add("View Stats");
		}

		return optionsList;		
	}

	/**
	 * Method: getOptionsMap() getter method for accessing optionsMap
	 * Creates an HashMap of room options based on a specific Room object ID
	 * @return optionsMap of type HashMap<String, ArrayList<String>()
	 */
	public Map<String, ArrayList<String>> optionsAL()
	{
		//OPTIONS FOR LEVEL 1 ROOMS
		optionsMap.put("HW_L1",addOptions("HW_L1"));
		optionsMap.put("RM101",addOptions("RM101"));
		optionsMap.put("RM102",addOptions("RM102"));
		optionsMap.put("RM103",addOptions("RM103"));
		optionsMap.put("RM104",addOptions("RM104"));
		optionsMap.put("RM105",addOptions("RM105"));
		optionsMap.put("RM106",addOptions("RM106"));
		optionsMap.put("RM107",addOptions("RM107"));

		//OPTIONS FOR LEVEL 2 ROOMS
		optionsMap.put("HW_L2",addOptions("HW_L2"));
		optionsMap.put("RM201",addOptions("RM201"));
		optionsMap.put("RM202",addOptions("RM202"));
		optionsMap.put("RM203",addOptions("RM203"));
		optionsMap.put("RM204",addOptions("RM204"));
		optionsMap.put("RM205",addOptions("RM205"));
		optionsMap.put("RM206",addOptions("RM206"));
		optionsMap.put("RM207",addOptions("RM207"));

		//OPTIONS FOR LEVEL 3 ROOMS
		optionsMap.put("HW_L3",addOptions("HW_L3"));
		optionsMap.put("RM301",addOptions("RM301"));
		optionsMap.put("RM302",addOptions("RM302"));
		optionsMap.put("RM303",addOptions("RM303"));
		optionsMap.put("RM304",addOptions("RM304"));
		optionsMap.put("RM305",addOptions("RM305"));

		//OPTIONS FOR LEVEL 2 ROOMS
		optionsMap.put("HW_L4",addOptions("HW_L4"));
		optionsMap.put("RM401",addOptions("RM401"));
		optionsMap.put("RM402",addOptions("RM402"));
		optionsMap.put("RM403",addOptions("RM403"));
		optionsMap.put("RM404",addOptions("RM404"));
		optionsMap.put("RM405",addOptions("RM405"));
		optionsMap.put("RM406",addOptions("RM406"));
		optionsMap.put("RM407",addOptions("RM407"));

		return optionsMap;
	}	
}
