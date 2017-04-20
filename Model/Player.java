package Model;

import java.util.ArrayList;

public class Player extends Character {

	private int score;
	
	public Player()
	{
		name = "Player";
		health = 20;
		attackPower = 1;
		score = 0;
	}
	
	public int getScore()
	{
		return score;
	}


	public void attack(Monster monster)
	{
		monster.health -= attackPower;
	}
	
	public void addScore(Monster monster)
	{
		if (monster.getID().equals("ML00"))
		{
			score += 10;
		}
		else if (monster.getID().equals("ML01"))
		{
			score += 15;
		}
		else if (monster.getID().equals("ML02"))
		{
			score += 25;
		}
		else if (monster.getID().equals("ML03"))
		{
			score += 35;
		}
		else if (monster.getID().equals("ML04"))
		{
			score += 50;
		}
		else if (monster.getID().equals("ML05"))
		{
			score += 65;
		}
		else if (monster.getID().equals("ML06"))
		{
			score += 80;
		}
		else if (monster.getID().equals("ML07"))
		{
			score += 100;
		}
		else 
		{
			System.out.println("Invalid Monster ID, check Player.java for errors in addScore");
		}
	}
	
}