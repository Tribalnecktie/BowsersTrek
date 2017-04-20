/**
 * 
 */
package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Tobin Crone
 * @version 1.0
 * Purpose:	This class will serve as the inventory list that will store all items the player has picked up
 * 			The inventory menu will be displayed to the user upon request and will allow them to select an item.
 * 			On item selection, its purpose will be evaluated, and its effect will be applied appropriately.
 *
 */
public class Backpack implements Serializable {

<<<<<<< Updated upstream
	Map<String,Artifact> userBackpack = new HashMap<String,Artifact>();
=======
	Map userBackpack = new HashMap<String,ArtifactTest>();
>>>>>>> Stashed changes

	/*
	 * Thought:	How will we store this backpack to the save file for each user.
	 * 			How will the specific backpack for that user be called back when
	 * 			a save file is loaded?
	 */
	
	//Backpack class constructor.
	public Backpack()
	{
		
	}
	
	public void addArtifact(String ID, ArtifactTest ArtifactObj)
	{
		userBackpack.put(ID, ArtifactObj);
	}
	
	public void removeArtifact(String ID)
	{
		//Remove the artifact from the backpack
		userBackpack.remove(ID);
	}
	
	//---------------------------This might present a problem
	public void printBackpack()
	{
		
		System.out.println("INVENTORY----------");
		Iterator it = userBackpack.entrySet().iterator();
		while(it.hasNext())
		{
			
			Map.Entry artifact = (Map.Entry<String, ArtifactTest>)it.next();
			
			ArtifactTest thisItem = (ArtifactTest)artifact.getValue();
			
			
			System.out.println(ArtifactInfoPrint(thisItem));
			//System.out.println(artifact.getKey().toString());
			
			
		}
	}
	
	public String ArtifactInfoPrint(ArtifactTest item)
	{
		String ArtifactInfo = "Default Info";
		
		ArtifactInfo = item.getID().toString() + " " + item.getName().toString()
				+ " " + item.getStrength() + " " + item.getDescription();
		
		
		return ArtifactInfo;
		
	}
	
	/*
	 * This method should be given the players name or ID or something.
	 * Then go and look for the backpack file. and load it in.
	 * I may have this done as a recreation of the backpack depending on how we read it in.
	 * Store only the item id into a file. and read in each one and create the objects and add them
	 * to the list here.
	 */
	public Backpack readinBackpack()
	{
		
		
		return null; //Return the users backpack.
		
	}
	
	public Map<String, Artifact> getBackpack()
	{
		return this.userBackpack;
	}
	
	public void setBackpack(Map <String, Artifact> newMap)
	{
		this.userBackpack = newMap;
	}

}
