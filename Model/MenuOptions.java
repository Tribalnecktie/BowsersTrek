/**
 * 
 *//*
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

*//**
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
 **//*
public class MenuOptions 
{
	
	private Map<String, ArrayList<String>> optionsMap = new HashMap<String, ArrayList<String>>(); ; //String = Room object ID attribute, ArrayList<String> = optionsList
	private ArrayList<String> optionsList;  //ArrayList of String objects associated with a specific Room ID

	*//**
	 * Method: MenuOptions() Constructor
	 *//*
	public MenuOptions()
	{
		this.optionsMap = optionsAL();
		this.optionsList = new ArrayList<String>();
		
	}


	*//**
	 * Method: getAddOptions() getter method for accessing optionsList 
	 * Creates an ArrayList of Strings that represent available menu options for the player to choose from
	 * @param rmID rmID from Room object
	 * @return optionsList of type ArrayList<String>
	 *//*
	public ArrayList<String> addOptions(String rmID)
	{
		if(rmID.equals("RM101"))
		{
			optionsList.add("DR101");
			this.optionsList.add("DR102");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList[6] = ("View Stats");
		}
		else if(rmID.equals("HW_L1"))
		{
			this.optionsList.add("DR101");
			this.optionsList.add("DR102");
			this.optionsList.add("DR103");
			this.optionsList.add("DR104");
			this.optionsList.add("DR105");
			this.optionsList.add("DR106");
			this.optionsList.add("DR107");
			this.optionsList.add("DR108");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}

		else if(rmID.equals("RM102"))
		{
			this.optionsList.add("DR102");
			this.optionsList.add("DR103");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("RM103"))
		{
			this.optionsList.add("DR103");
			this.optionsList.add("DR104");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("RM104"))
		{
			this.optionsList.add("DR104");
			this.optionsList.add("DR105");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("RM105"))
		{
			this.optionsList.add("DR105");
			this.optionsList.add("DR106");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("RM106"))
		{
			this.optionsList.add("DR106");
			this.optionsList.add("DR107");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("RM107"))
		{
			this.optionsList.add("DR107");
			this.optionsList.add("DR108");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("HW_L2"))
		{
			this.optionsList.add("DR201");  
			this.optionsList.add("DR202");
			this.optionsList.add("DR203");
			this.optionsList.add("DR205");
			this.optionsList.add("DR208");
			this.optionsList.add("DR209");
			this.optionsList.add("DR211");
			this.optionsList.add("DR212");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR201"))
		{
			this.optionsList.add("DR201");  
			this.optionsList.add("DR202");
			this.optionsList.add("DR203");
			this.optionsList.add("DR204");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR202"))
		{
			this.optionsList.add("DR205");  
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR203"))
		{
			this.optionsList.add("DR206");  
			this.optionsList.add("DR207");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR204"))
		{
			this.optionsList.add("DR207");  
			this.optionsList.add("DR208");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR205"))
		{
			this.optionsList.add("DR209");  
			this.optionsList.add("DR210");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR206"))
		{
			this.optionsList.add("DR210");  
			this.optionsList.add("DR211");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR207"))
		{
			this.optionsList.add("DR204");  
			this.optionsList.add("DR212");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("HW_L3"))
		{
			this.optionsList.add("DR300");  
			this.optionsList.add("DR301");
			this.optionsList.add("DR302");  
			this.optionsList.add("DR303");
			this.optionsList.add("DR304");  
			this.optionsList.add("DR306");
			this.optionsList.add("DR307");  
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR301"))
		{
			this.optionsList.add("DR300");  
			this.optionsList.add("DR301");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR302"))
		{
			this.optionsList.add("DR302");  
			this.optionsList.add("DR303");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR303"))
		{
			this.optionsList.add("DR306");  
			this.optionsList.add("DR307");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR304"))
		{
			this.optionsList.add("DR304");  
			this.optionsList.add("DR305");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR305"))
		{
			this.optionsList.add("DR315");  
			this.optionsList.add("DR316");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("HW_L4"))
		{
			this.optionsList.add("DR401");  
			this.optionsList.add("DR402");
			this.optionsList.add("DR403");  
			this.optionsList.add("DR405");
			this.optionsList.add("DR407");  
			this.optionsList.add("DR408");
			this.optionsList.add("DR409");  
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR401"))
		{
			this.optionsList.add("DR401");  
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR402"))
		{
			this.optionsList.add("DR402");  
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR403"))
		{
			this.optionsList.add("DR403"); 
			this.optionsList.add("DR404");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR404"))
		{
			this.optionsList.add("DR405");  
			this.optionsList.add("DR406");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR405"))
		{
			this.optionsList.add("DR406");  
			this.optionsList.add("DR407");
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR406"))
		{
			this.optionsList.add("DR408");  
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}
		else if(rmID.equals("DR407"))
		{
			this.optionsList.add("DR409");  
			this.optionsList.add("Attack Monster");
			this.optionsList.add("Check puzzle");
			this.optionsList.add("View Inventory");
			this.optionsList.add("View Stats");
		}

		return optionsList;		
	}

	public Map<String, ArrayList<String>> getOptionsMap() {
		return optionsMap;
	}


	public void setOptionsMap(Map<String, ArrayList<String>> optionsMap) {
		this.optionsMap = optionsMap;
	}


	public ArrayList<String> getOptionsList() {
		return optionsList;
	}


	public void setOptionsList(ArrayList<String> optionsList) {
		this.optionsList = optionsList;
	}


	*//**
	 * Method: getOptionsMap() getter method for accessing optionsMap
	 * Creates an HashMap of room options based on a specific Room object ID
	 * @return optionsMap of type HashMap<String, ArrayList<String>()
	 *//*
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
*/