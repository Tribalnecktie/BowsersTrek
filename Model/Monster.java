package Model;

public class Monster extends Character {
	
	String ID;
	String description;
	String itemDrop;
	
	public Monster(String ID)
	{
		if (ID.equals("ML00"))
		{
			name = "Yoshi";
			health = 5;
			attackPower = 1;
			itemDrop = "A0000";
			description = "An intriguingly mesmerizing horse-lizard that appears to be plain, dumb and insignificant. You�re not really sure if it wants to eat or whether it knows you are even there. Feel free to consider it harmless... if you are a fool.";
		}
		else if (ID.equals("ML01"))
		{
			name = "Toad";
			health = 5;
			attackPower = 1;
			itemDrop = "A0003";
			description = "A seemingly asexual being, possibly a human being that happens to have a living mushroom on its head. He seems moderately friendly. You�re not sure whether to ignore it or to make mushroom pizza.";
		}
		else if (ID.equals("ML02"))
		{
			name = "Luigi";
			health = 8;
			attackPower = 2;
			itemDrop = "A0010";
			description = "A medium sized, clumsy, defenseless man. If you�re not careful he�ll give you some damage. As long as you stay on your toes, you should be good.";
		}
		else if (ID.equals("ML03"))
		{
			name = "Daisy";
			health = 8;
			attackPower = 2;
			itemDrop = "A0006";
			description = "A lean, agile, and weak girl. She is as afraid of you as you are of her. But don�t underestimate her, she can give you significant damage.";
		}
		else if (ID.equals("ML04"))
		{
			name = "Mario";
			health = 12;
			attackPower = 3;
			itemDrop = "A0011";
			description = "A short, stubby, hyperactive man with a lot of will and determination. He will mess you up if you don�t put up a good fight.";
		}
		else if (ID.equals("ML05"))
		{
			name = "Peach";
			health = 12;
			attackPower = 3;
			itemDrop = "A0007";
			description = "A beautiful, graceful girl with a lot of guts. She won�t take you lightly, and you shouldn�t take her lightly either.";
		}
		else if (ID.equals("ML06"))
		{
			name = "Wario";
			health = 15;
			attackPower = 4;
			itemDrop = "A0007";
			description = "A fat, slow, yet dangerous old man. One moment he�s trying to tell you a bad joke, the next you are staring death in the face.";
		}
		else if (ID.equals("ML07"))
		{
			name = "Waluigi";
			health = 16;
			attackPower = 5;
			itemDrop = "A0009";
			description = "A tall, lanky old man. He smells as bad as he looks. He will totally rip your heart out if you let him, so beware.";
		}
	
			System.out.println("Invalid ID");
	}
	
	void attack(Player player)
	{
		player.health -= attackPower;
	}
}
