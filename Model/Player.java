package Model;

import java.util.ArrayList;

public class Player extends Character {

	public ArrayList<ArtifactTest> inv = new ArrayList<ArtifactTest>();
	
	public Player()
	{
		name = "Player";
		health = 20;
		attackPower = 1;
	}
	
	public ArrayList<ArtifactTest> getInv() {
		return inv;
	}

	public void setInv(ArrayList<ArtifactTest> inv) {
		this.inv = inv;
	}

	public void attack(Monster monster)
	{
		monster.health -= attackPower;
	}
	
	public void printInv()
	{
		for (int i = 0; i < inv.size(); i++)
		{
			System.out.println(inv.get(i).description);
		}
	}
}