package Model;

import java.util.ArrayList;

public class Player extends Character {

	public ArrayList<Artifact> inv = new ArrayList<Artifact>();
	
	public Player()
	{
		name = "Player";
		health = 20;
		attackPower = 1;
	}
	
	public ArrayList<Artifact> getInv() {
		return inv;
	}

	public void setInv(ArrayList<Artifact> inv) {
		this.inv = inv;
	}

	void attack(Monster monster)
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