package Model;

import java.util.HashMap;
import java.util.Map;

public class MonsterLibrary_HashMap {

	private Map<String,Monster> monsterAL = new HashMap<String,Monster>();
	/*
	protected String ID;
	protected String description;
	protected Artifact itemDrop;
	*/
	
	public MonsterLibrary_HashMap()
	{
		this.monsterAL = monsterAL();
	}
	
	public Map<String, Monster> monsterAL()
	{
		//All monsters into an array
		monsterAL.put("ML00", new Monster("ML00", "Yoshi", 5, 1, getMonsterDesc("ML00"), new ArtifactTest("A0000")));
		monsterAL.put("ML01", new Monster("ML01", "Toad", 5, 1, getMonsterDesc("ML01"), new ArtifactTest("A0001")));
		monsterAL.put("ML02", new Monster("ML02", "Luigi", 8, 2, getMonsterDesc("ML02"), new ArtifactTest("A0010")));
		monsterAL.put("ML03", new Monster("ML03", "Daisy", 8, 2, getMonsterDesc("ML03"), new ArtifactTest("A0006")));
		monsterAL.put("ML04", new Monster("ML04", "Mario", 12, 3, getMonsterDesc("ML04"), new ArtifactTest("A0011")));
		monsterAL.put("ML05", new Monster("ML05", "Peach", 12, 3, getMonsterDesc("ML05"), new ArtifactTest("A0007")));
		monsterAL.put("ML06", new Monster("ML06", "Wario", 15, 4, getMonsterDesc("ML06"), new ArtifactTest("A0007")));
		monsterAL.put("ML07", new Monster("ML07", "Waluigi", 16, 5, getMonsterDesc("ML07"), new ArtifactTest("A0009")));
		return monsterAL;
	}
	
	public String getMonsterDesc(String ID)
	{
		String tempDesc = "N/A";
		if (ID.equals("ML00"))
		{
			tempDesc = "An intriguingly mesmerizing horse-lizard that appears to be plain, dumb and insignificant. You�re not really sure if it wants to eat or whether it knows you are even there. Feel free to consider it harmless... if you are a fool.";
		}
		else if (ID.equals("ML01"))
		{
			tempDesc = "A seemingly asexual being, possibly a human being that happens to have a living mushroom on its head. He seems moderately friendly. You�re not sure whether to ignore it or to make mushroom pizza.";
		}
		else if (ID.equals("ML02"))
		{
			tempDesc = "A medium sized, clumsy, defenseless man. If you�re not careful he�ll give you some damage. As long as you stay on your toes, you should be good.";
		}
		else if (ID.equals("ML03"))
		{
			tempDesc = "A lean, agile, and weak girl. She is as afraid of you as you are of her. But don�t underestimate her, she can give you significant damage.";
		}
		else if (ID.equals("ML04"))
		{
			tempDesc = "A short, stubby, hyperactive man with a lot of will and determination. He will mess you up if you don�t put up a good fight.";
		}
		else if (ID.equals("ML05"))
		{
			tempDesc = "A beautiful, graceful girl with a lot of guts. She won�t take you lightly, and you shouldn�t take her lightly either.";
		}
		else if (ID.equals("ML06"))
		{
			tempDesc =  "A fat, slow, yet dangerous old man. One moment he�s trying to tell you a bad joke, the next you are staring death in the face.";
		}
		else if (ID.equals("ML07"))
		{
			tempDesc = "A tall, lanky old man. He smells as bad as he looks. He will totally rip your heart out if you let him, so beware.";
		}
		else
			System.out.println("Not Available");
		
		return tempDesc;
		
	}
}
