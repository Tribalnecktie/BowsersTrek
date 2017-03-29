package Model;


public class Artifact {
	String ID;
	String name;
	String description;
	int strength;
	
	public Artifact(String ID, String name, String description, int strength) 
	{
		this.ID = ID;
		this.name = name;
		this.description = description;
		this.strength = strength;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
		
}
