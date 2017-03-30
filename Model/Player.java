package Model;

import java.util.ArrayList;

public class Player extends Character {

	ArrayList<String> inv = new ArrayList<String>();
	
	public Player()
	{
		name = "Player";
		health = 20;
		attackPower = 1;
	}
	
	public ArrayList<String> getInv() {
		return inv;
	}

	public void setInv(ArrayList<String> inv) {
		this.inv = inv;
	}

	void attack(Monster monster)
	{
		monster.health -= attackPower;
	}
}