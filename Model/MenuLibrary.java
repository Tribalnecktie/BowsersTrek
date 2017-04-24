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
		rm101list[3] =("Solve puzzle");
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
		rm102list[3] = ("Solve puzzle");
		rm102list[4] = ("View Inventory");
		rm102list[5] = ("Check Stats");
		optionlist.put("RM102",rm102list);

		String[] rm103list = new String[6];
		rm103list[0] = ("DR102");
		rm103list[1] = ("DR104");
		rm103list[2] = ("Attack Monster");
		rm103list[3] = ("Solve puzzle");
		rm103list[4] = ("View Inventory");
		rm103list[5] = ("Check Stats");
		optionlist.put("RM103",rm103list);

		String[] rm104list = new String[6];
		rm104list[0] = ("DR103");
		rm104list[1] = ("DR105");
		rm104list[2] = ("Attack Monster");
		rm104list[3] = ("Solve puzzle");
		rm104list[4] = ("View Inventory");
		rm104list[5] = ("Check Stats");
		optionlist.put("RM104",rm104list);

		String[] rm105list = new String[6];		
		rm105list[0] = ("DR104");
		rm105list[1] = ("DR106");
		rm105list[2] = ("Attack Monster");
		rm105list[3] = ("Solve puzzle");
		rm105list[4] = ("View Inventory");
		rm105list[5] = ("Check Stats");
		optionlist.put("RM105",rm105list);

		String[] rm106list = new String[6];	
		rm106list[0] = ("DR105");
		rm106list[1] = ("DR107");
		rm106list[2] = ("Attack Monster");
		rm106list[3] = ("Solve puzzle");
		rm106list[4] = ("View Inventory");
		rm106list[5] = ("Check Stats");
		optionlist.put("RM106",rm106list);

		String[] rm107list = new String[6];	
		rm107list[0] = ("DR106");
		rm107list[1] = ("Hallway L1");
		rm107list[2] = ("Attack Monster");
		rm107list[3] = ("Solve puzzle");
		rm107list[4] = ("View Inventory");
		rm107list[5] = ("Check Stats");
		optionlist.put("RM107",rm107list);

		//LEVEL TWO MENU OPTIONS

		String[] hwl2list = new String[10];
		hwl2list[0] = ("DR201");  
		hwl2list[1] = ("DR202");
		hwl2list[2] = ("DR203");
		hwl2list[3] = ("DR205");
		hwl2list[4] = ("DR208");
		hwl2list[5] = ("DR209");
		hwl2list[6] = ("DR211");
		hwl2list[7] = ("DR212");
		hwl2list[8] = ("View Inventory");
		hwl2list[9] = ("Check Stats");
		optionlist.put("HW_L2",hwl2list);

		String[] rm201list = new String[8];
		rm201list[0] = ("Hallway L2");  
		rm201list[1] = ("DR202");
		rm201list[2] = ("DR203");
		rm201list[3] = ("DR204");
		rm201list[4] = ("Attack Monster");
		rm201list[5] = ("Solve puzzle");
		rm201list[6] = ("View Inventory");
		rm201list[7] = ("Check Stats");
		optionlist.put("DR201",rm201list);

		String[] rm202list = new String[6];
		rm202list[0] = ("DR205");
		rm202list[0] = ("DR201"); 
		rm202list[2] = ("Attack Monster");
		rm202list[3] = ("Solve puzzle");
		rm202list[4] = ("View Inventory");
		rm202list[5] = ("Check Stats");
		optionlist.put("DR202",rm202list);

		String[] rm203list = new String[6];
		rm203list[0] = ("DR206");  
		rm203list[1] = ("DR207");
		rm203list[2] = ("Attack Monster");
		rm203list[3] = ("Solve puzzle");
		rm203list[4] = ("View Inventory");
		rm203list[5] = ("Check Stats");
		optionlist.put("DR203",rm203list);
		
		String[] rm204list = new String[6];
		rm204list[0] = ("DR207");  
		rm204list[1] = ("DR208");
		rm204list[2] = ("Attack Monster");
		rm204list[3] = ("Solve puzzle");
		rm204list[4] = ("View Inventory");
		rm204list[5] = ("Check Stats");
		optionlist.put("DR204",rm204list);
		
		String[] rm205list = new String[6];
		rm205list[0] = ("DR209");  
		rm205list[1] = ("DR210");
		rm205list[2] = ("Attack Monster");
		rm205list[3] = ("Solve puzzle");
		rm205list[4] = ("View Inventory");
		rm205list[5] = ("Check Stats");
		optionlist.put("DR205",rm205list);

		String[] rm206list = new String[6];
		rm206list[0] = ("DR210");  
		rm206list[1] = ("DR211");
		rm206list[2] = ("Attack Monster");
		rm206list[3] = ("Solve puzzle");
		rm206list[4] = ("View Inventory");
		rm206list[5] = ("Check Stats");
		optionlist.put("DR206",rm206list);
		
		String[] rm207list = new String[6];
		rm207list[0] = ("DR204");  
		rm207list[1] = ("DR212");
		rm207list[2] = ("Attack Monster");
		rm207list[3] = ("Solve puzzle");
		rm207list[4] = ("View Inventory");
		rm207list[5] = ("Check Stats");
		optionlist.put("DR207",rm207list);
		
		//LEVEL THREE MENU OPTIONS
		
		String[] hwl3list = new String[9];
		hwl3list[0] = ("DR300");  
		hwl3list[1] = ("DR301");
		hwl3list[2] = ("DR302");  
		hwl3list[3] = ("DR303");
		hwl3list[4] = ("DR304");  
		hwl3list[5] = ("DR306");
		hwl3list[6] = ("DR307");  
		hwl3list[7] = ("View Inventory");
		hwl3list[8] = ("Check Stats");
		optionlist.put("HW_L3",hwl3list);
		
		String[] rm301list = new String[6];
		rm301list[0] = ("DR300");  
		rm301list[1] = ("DR301");
		rm301list[2] = ("Attack Monster");
		rm301list[3] = ("Solve puzzle");
		rm301list[4] = ("View Inventory");
		rm301list[5] = ("Check Stats");
		optionlist.put("DR301",rm301list);
		
		String[] rm302list = new String[6];
		rm302list[0] = ("DR302");  
		rm302list[1] = ("DR303");
		rm302list[2] = ("Attack Monster");
		rm302list[3] = ("Solve puzzle");
		rm302list[4] = ("View Inventory");
		rm302list[5] = ("Check Stats");
		optionlist.put("DR302",rm302list);
		
		String[] rm303list = new String[6];
		rm303list[0] = ("DR306");  
		rm303list[1] = ("DR307");
		rm303list[2] = ("Attack Monster");
		rm303list[3] = ("Solve puzzle");
		rm303list[4] = ("View Inventory");
		rm303list[5] = ("Check Stats");
		optionlist.put("DR303",rm303list);
		
		String[] rm304list = new String[6];
		rm304list[0] = ("DR304");  
		rm304list[1] = ("DR305");
		rm304list[2] = ("Attack Monster");
		rm304list[3] = ("Solve puzzle");
		rm304list[4] = ("View Inventory");
		rm304list[5] = ("Check Stats");
		optionlist.put("DR304",rm304list);
		
		String[] rm305list = new String[6];
		rm305list[0] = ("DR315");  
		rm305list[1] = ("DR316");
		rm305list[2] = ("Attack Monster");
		rm305list[3] = ("Solve puzzle");
		rm305list[4] = ("View Inventory");
		rm305list[5] = ("Check Stats");
		optionlist.put("DR305",rm305list);
		
		//LEVEL FOUR MENU OPTIONS
		String[] hwl4list = new String[9];
		hwl4list[0] = ("DR401");  
		hwl4list[1] = ("DR402");
		hwl4list[2] = ("DR403");  
		hwl4list[3] = ("DR405");
		hwl4list[4] = ("DR407");  
		hwl4list[5] = ("DR408");
		hwl4list[6] = ("DR409");  
		hwl4list[7] = ("View Inventory");
		hwl4list[8] = ("Check Stats");
		optionlist.put("HW_L4",hwl4list);
		
		String[] rm401list = new String[6];
		rm401list[0] = ("Hallway L4");  
		rm401list[1] = ("DR401");
		rm401list[2] = ("Attack Monster");
		rm401list[3] = ("Solve puzzle");
		rm401list[4] = ("View Inventory");
		rm401list[5] = ("Check Stats");
		optionlist.put("DR401",rm401list);
		
		String[] rm402list = new String[6];
		rm402list[0] = ("Hallway L4");  
		rm402list[1] = ("DR402");
		rm402list[2] = ("Attack Monster");
		rm402list[3] = ("Solve puzzle");
		rm402list[4] = ("View Inventory");
		rm402list[5] = ("Check Stats");
		optionlist.put("DR402",rm402list);
		
		String[] rm403list = new String[7];
		rm403list[0] = ("Hallway L4");  
		rm403list[1] = ("DR403");
		rm403list[2] = ("DR404");
		rm403list[3] = ("Attack Monster");
		rm403list[4] = ("Solve puzzle");
		rm403list[5] = ("View Inventory");
		rm403list[6] = ("Check Stats");
		optionlist.put("DR403",rm403list);
		
		String[] rm404list = new String[8];
		rm404list[0] = ("Hallway L4");  
		rm404list[1] = ("DR404");
		rm404list[2] = ("DR405");
		rm404list[3] = ("DR406");
		rm404list[4] = ("Attack Monster");
		rm404list[5] = ("Solve puzzle");
		rm404list[6] = ("View Inventory");
		rm404list[7] = ("Check Stats");
		optionlist.put("DR404",rm404list);
		
		String[] rm405list = new String[7];
		rm405list[0] = ("Hallway L4");  
		rm405list[1] = ("DR406");
		rm405list[2] = ("DR407");
		rm405list[3] = ("Attack Monster");
		rm405list[4] = ("Solve puzzle");
		rm405list[5] = ("View Inventory");
		rm405list[6] = ("Check Stats");
		optionlist.put("DR405",rm405list);
		
		String[] rm406list = new String[6];
		rm406list[0] = ("Hallway L4");  
		rm406list[1] = ("DR408");
		rm406list[2] = ("Attack Monster");
		rm406list[3] = ("Solve puzzle");
		rm406list[4] = ("View Inventory");
		rm406list[5] = ("Check Stats");
		optionlist.put("DR406",rm406list);
		
		String[] rm407list = new String[6];
		rm407list[0] = ("Hallway L4");  
		rm407list[1] = ("DR409");
		rm407list[2] = ("Attack Monster");
		rm407list[3] = ("Solve puzzle");
		rm407list[4] = ("View Inventory");
		rm407list[5] = ("Check Stats");
		optionlist.put("DR407",rm407list);
		
		return optionlist;

	}









}
