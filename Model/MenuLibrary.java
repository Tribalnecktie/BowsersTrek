package Model;

import java.util.HashMap;
import java.util.Map;

import View.ConsoleView;

public class MenuLibrary 
{

	private Map<String,String[]> optionlist = new HashMap<String,String[]>();

	public MenuLibrary()
	{

		this.optionlist = createOptions();

	}

	/**
	 * @author Tobin Crone
	 * @author Katrina Smith
	 * Method: createOptions()
	 * Purpose: This method should create the list of menu options associated with its room id
	 * 
	 * @return
	 */
	public Map<String, String[]> createOptions()
	{

		String[] rm101list = new String[6];			
		rm101list[0] = ("DR101");
		rm101list[1] =("DR102");
		rm101list[2] =("Attack Monster");
		rm101list[3] =("Check puzzle");
		rm101list[4] =("View Inventory");
		rm101list[5] = ("View Stats");
		ConsoleView console = new ConsoleView();
		console.printView("Creating optionlist map");
		
		optionlist.put("RM101",rm101list);




		/*if(roomid == "HW_L1")
		{
			String[] hw_lilist = null;

			hw_lilist[0] = ("DR101");
			hw_lilist[1] = ("DR102");
			hw_lilist[2] = ("DR103");
			hw_lilist[3] = ("DR104");
			hw_lilist[4] = ("DR105");
			hw_lilist[5] = ("DR106");
			hw_lilist[6] = ("DR107");
			hw_lilist[7] = ("DR108");
			hw_lilist[8] = ("View Inventory");
			hw_lilist[9] = ("View Stats");
		}*/



		return optionlist;

	}









}
