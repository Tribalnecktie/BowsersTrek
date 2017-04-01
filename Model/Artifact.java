package Model;


public class Artifact {
	String ID;
	String name;
	String description;
	int strength;
	boolean canHeal = false;
	
	public Artifact(String ID) 
	{
		getArtifact(ID);
	}
	
	void getArtifact(String ID)
	{
		if (ID.equals("A0000"))
		{
			name = "Healing Mushroom";
			description = "If you find this mushroom your character will be able to heal itself. You can consume the mushroom to regain 60HP";
			strength = 2;
			canHeal = true;
		}
		if (ID.equals("A0001"))
		{
			name = "Poison Goomba";
			description = "If you find this item you will be able to poison your enemy (making the opposition nauseous), and gain the opportunity to catch your breath.";
			strength = 4;
			canHeal = true;
		}
		if (ID.equals("A0002"))
		{
			name = "Paralyzing Boo";
			description = "This ghost, if selected, can paralyze your enemy for you to catch your breath quickly";
			strength = 2;
			canHeal = true;
		}
		if (ID.equals("A0003"))
		{
			name = "Tri-Shroombow";
			description = "This is an ordinary crossbow, but it can shoot three arrows at a time. It’s better than your normal crossbow, which can only shoot one. This crossbow can deal 3 times the damage than your normal crossbow.";
			strength = 6;
		}
		if (ID.equals("A0004"))
		{
			name = "Fire Flower";
			description = "The fire flower is very useful if you want to keep your distance from your enemy. If blown, it will create a line of fire between you and your enemy. It lasts the duration of the fight. If the enemy happens to touch the fire it can deal up to 5 damage. Until the enemy stops touching the fire.";
			strength = 5;
		}
		if (ID.equals("A0005"))
		{
			name = "Bowser's Flaming Sword";
			description = "This weapon is the rarest of them all. If found, you’re in luck. Bowsers sword does very heavy damage.";
			strength = 10;
		}
		//htfytdtyd
		if (ID.equals("A0006"))
		{
			name = "Shroom Sword";
			description = "A long white piece of mushroom dotted with red spots and sharpened.";
			strength = 2;
		}
		if (ID.equals("A0007"))
		{
			name = "Shroom Bow";
			description = "A curved piece of brown mushroom with a string connecting the two ends.";
			strength = 2;
		}
		if (ID.equals("A0008"))
		{
			name = "Shroom Hammer";
			description = "A short mushroom stick with a very wide and dense end.";
			strength = 2;
		}
		if (ID.equals("A0009"))
		{
			name = "Shroom Gun";
			description = "A small, hollow curved mushroom with small mechanical components.";
			strength = 5;
		}
		if (ID.equals("A0010"))
		{
			name = "Coin of Constitution";
			description = "A green coin that shimmers and hums with magical energy";
			strength = 5;
			canHeal = true;
		}
		if (ID.equals("A0011"))
		{
			name = "Coin of Toughness";
			description = "A red coin that shimmers and hums with magical energy";
			strength = 10;
			canHeal = true;
		}
		if (ID.equals("A0012"))
		{
			name = "Coin of Brutality";
			description = "A blue coin that shimmers and hums with magical energy";
			strength = 5;
			canHeal = false;
		}
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
