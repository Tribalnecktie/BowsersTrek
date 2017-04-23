package Model;

import java.util.HashMap;
import java.util.Map;

import View.ConsoleView;

public class MenuLibrary 
{

	private Map<String,String[]> optionlist = new HashMap<String,String[]>();

	public MenuLibrary()
	{

		//this.optionlist = createOptions();

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
		//LEVEL ONE MENU OPTIONS
		String[] rm101list = new String[6];			
		rm101list[0] = ("Hallway L1");
		rm101list[1] =("DR102");
		rm101list[2] =("Attack Monster");
		rm101list[3] =("Check puzzle");
		rm101list[4] =("View Inventory");
		rm101list[5] = ("Check Stats");		
		optionlist.put("RM101",rm101list);

		String[] hwl1list = new String[9];
		hwl1list[0] = ("DR101");
		hwl1list[1] = ("DR102");
		hwl1list[2] = ("DR103");
		hwl1list[3] = ("DR104");
		hwl1list[4] = ("DR105");
		hwl1list[5] = ("DR106");
		hwl1list[6] = ("DR107");
		hwl1list[7] = ("View Inventory");
		hwl1list[8] = ("Check Stats");
		optionlist.put("HW_L1",hwl1list);

		String[] rm102list = new String[6];
		rm102list[0] = ("DR101");
		rm102list[1] = ("DR103");
		rm102list[2] = ("Attack Monster");
		rm102list[3] = ("Check puzzle");
		rm102list[4] = ("View Inventory");
		rm102list[5] = ("Check Stats");
		optionlist.put("RM102",rm102list);
		
		String[] rm103list = new String[6];
		rm103list[0] = ("DR102");
		rm103list[1] = ("DR104");
		rm103list[2] = ("Attack Monster");
		rm103list[3] = ("Check puzzle");
		rm103list[4] = ("View Inventory");
		rm103list[5] = ("Check Stats");
		optionlist.put("RM103",rm103list);
		
		String[] rm104list = new String[6];
		rm104list[0] = ("DR103");
		rm104list[1] = ("DR105");
		rm104list[2] = ("Attack Monster");
		rm104list[3] = ("Check puzzle");
		rm104list[4] = ("View Inventory");
		rm104list[5] = ("Check Stats");
		optionlist.put("RM104",rm104list);
		
		String[] rm105list = new String[6];		
		rm105list[0] = ("DR104");
		rm105list[1] = ("DR106");
		rm105list[2] = ("Attack Monster");
		rm105list[3] = ("Check puzzle");
		rm105list[4] = ("View Inventory");
		rm105list[5] = ("Check Stats");
		optionlist.put("RM105",rm105list);
			
		String[] rm106list = new String[6];	
		rm106list[0] = ("DR105");
		rm106list[1] = ("DR107");
		rm106list[2] = ("Attack Monster");
		rm106list[3] = ("Check puzzle");
		rm106list[4] = ("View Inventory");
		rm106list[5] = ("Check Stats");
		optionlist.put("RM106",rm106list);
		
		String[] rm107list = new String[6];	
		rm107list[0] = ("DR106");
		rm107list[1] = ("Hallway L1");
		rm107list[2] = ("Attack Monster");
		rm107list[3] = ("Check puzzle");
		rm107list[4] = ("View Inventory");
		rm107list[5] = ("Check Stats");
		optionlist.put("RM107",rm107list);
		
		//LEVEL TWO MENU OPTIONS
		
		String[] hwl2list = new String[11];
		hwl1list[0] = ("DR201");
		hwl1list[1] = ("DR202");
		hwl1list[2] = ("DR203");
		hwl1list[3] = ("DR205");
		hwl1list[4] = ("DR208");
		hwl1list[5] = ("DR209");
		hwl1list[6] = ("DR211");
		hwl1list[7] = ("DR212");
		hwl1list[8] = ("DR213");
		hwl1list[9] = ("View Inventory");
		hwl1list[10] = ("Check Stats");
		optionlist.put("HW_L2",hwl2list);
		
		String[] rm201list = new String[6];	
		rm107list[0] = ("DR204");
		rm107list[1] = ("Hallway L2");
		rm107list[2] = ("Attack Monster");
		rm107list[3] = ("Check puzzle");
		rm107list[4] = ("View Inventory");
		rm107list[5] = ("Check Stats");
		optionlist.put("RM201",rm201list);
		
		String[] rm202list = new String[6];	
		rm107list[0] = ("DR206");
		rm107list[1] = ("Hallway L2");
		rm107list[2] = ("Attack Monster");
		rm107list[3] = ("Check puzzle");
		rm107list[4] = ("View Inventory");
		rm107list[5] = ("Check Stats");
		optionlist.put("RM202",rm202list);
		
		String[] rm203list = new String[7];			
		rm107list[0] = ("DR206");
		rm107list[0] = ("DR207");
		rm107list[1] = ("Hallway L2");
		rm107list[2] = ("Attack Monster");
		rm107list[3] = ("Check puzzle");
		rm107list[4] = ("View Inventory");
		rm107list[5] = ("Check Stats");
		optionlist.put("RM203",rm203list);
		
		String[] rm204list = new String[6];	
		rm107list[0] = ("DR207");
		rm107list[1] = ("Hallway L2");
		rm107list[2] = ("Attack Monster");
		rm107list[3] = ("Check puzzle");
		rm107list[4] = ("View Inventory");
		rm107list[5] = ("Check Stats");
		optionlist.put("RM204",rm204list);


		return optionlist;

	}









}
