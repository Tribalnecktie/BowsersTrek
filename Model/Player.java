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
	
	void attack(Monster monster)
	{
		monster.health -= attackPower;
	}
}