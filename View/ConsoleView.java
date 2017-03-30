/**
 * 
 */
package View;

import java.util.ArrayList;

/**
 * @author Tobin Crone
 * @version 1.0
 * Purpose: This view object will receive strings that will be displayed to the user in the System Console
 * 
 *
 */
public class ConsoleView 
{
	
	String currentroomID;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Print the main menu on startup.
		//ConsoleView will be started by the GameController
		printMenu("MM00"); 
		
		
		

	}
	
	//This method will print the menu to the user.
	//The options show will reflect the current room.
	//If at the main menu (MM00) constants defined below are shown.
	public static void printMenu(String roomid)
	{
		String menutitle = "\t\t\t\t\t\t\tMain Menu:";
		String headerline = "=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=";
		ArrayList<String> MenuOptions = new ArrayList<String>();
		
		String footerline = "=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=\n";
		
		if(roomid.equalsIgnoreCase("MM00"))
			{
				//Set everything to the main menu.
				String[] mainmenu = new String[]{"\t\t\t\t\t\t\t1. New Game","\t\t\t\t\t\t\t2. Load Game","\t\t\t\t\t\t\t3. Exit Game","\t\t\t\t\t\t\t4. Dev Team Info!"};
				
				for(int x = 0; x <= 3; x++)
				{
					MenuOptions.add(mainmenu[x]);					
				};
			};
		
		System.out.println(menutitle);
		System.out.println(headerline);
		for(String option : MenuOptions)
		{
			System.out.println(option);			
		}		
		System.out.println(footerline);
		
		
	}

}
