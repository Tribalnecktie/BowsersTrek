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

	Map<String,Artifact> userBackpack = new HashMap<String,Artifact>();
	boolean isEmpty = true;

	/*
	 * Thought:	How will we store this backpack to the save file for each user.
	 * 			How will the specific backpack for that user be called back when
	 * 			a save file is loaded?
	 */
	
	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	//Backpack class constructor.
	public Backpack()
	{
		
	}
	
	public void addArtifact(String ID, Artifact ArtifactObj)
	{
		
		if(userBackpack.containsKey(ID))
		{
			//System.out.println("ITEM FOUND IN INVENTORY - ADDING QUANTITY");
			Artifact tempArt = this.userBackpack.get(ID);
			//System.out.println("Quantity of AddArtifact: " + tempArt.getQuantity());
			tempArt.setQuantity(tempArt.getQuantity() + 1);
			userBackpack.remove(ID);
			userBackpack.put(ID, tempArt);
		}
		else
		{
			//System.out.println("SETTING QUANTITY TO 1 - NOT FOUND IN INVENTORY");
			ArtifactObj.setQuantity(1);
			userBackpack.put(ID, ArtifactObj);
		}
		
		this.isEmpty = false;
	}
	
	public void removeArtifact(String ID)
	{
		//Remove the artifact from the backpack
		userBackpack.remove(ID);
	}
	
	//---------------------------This might present a problem
	public void printBackpack()
	{
		
		System.out.println("-----------INVENTORY----------");
		Iterator it = this.userBackpack.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry artifact = (Map.Entry<String, Artifact>)it.next();
			
			Artifact thisItem = (Artifact)artifact.getValue();
			
			System.out.println(ArtifactInfoPrint(thisItem));
			//System.out.println(artifact.getKey().toString());			
		}
	}
	
	public String ArtifactInfoPrint(Artifact item)
	{
		String ArtifactInfo = "Default Info";
		
		ArtifactInfo = "ID#: " + item.getID().toString().substring(3,5) + "  \nName: " + item.getName().toString() + " \n\tQuantity: " + item.getQuantity() 
				+ " \n\tStrength: " + item.getStrength() + " \n\tDescription: " + item.getDescription();
		
		return ArtifactInfo;	
	}
	
	
	public Map<String, Artifact> getBackpack()
	{
		return this.userBackpack;
	}
	
	public void setBackpack(Map <String, Artifact> newMap)
	{
		this.userBackpack = newMap;
	}
	
	public Artifact getItem(String artID)
	{
		
		return this.userBackpack.get(artID);
	}

}
