package Model;

import java.util.ArrayList;
import java.util.Random;

public class Room3 {
	
	
	

    public static void build(Room4[][] room, final int WIDTH, final int HEIGHT) {

    	// Initialize rooms
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                room[i][j] = new Room4(i, "", "", null, null, null);
            }
        }

        room[0][0].setRmLevel(1);
        room[0][0].setRmName("Living Room");
        room[0][0].setRmDescription("You are in your living room.");
        //room[0][0]
        room[0][0].getItems();
        room[0][0].getItems();

        room[0][1].setRmLevel(2);
        room[0][1].setRmName("Bedroom");
        room[0][1].setRmDescription("You are in your bedroom. Your closet is slightly ajar.");
        room[0][1].getItems();
        room[0][1].getItems();

        room[1][0].setRmLevel(3);
        room[1][0].setRmName("Kitchen");
        room[1][0].setRmDescription("You are in your kitchen.");
        room[1][0].getItems();
        room[1][0].getItems();

        room[1][1].setRmLevel(4);
        room[1][1].setRmName("Bathroom");
        room[1][1].setRmDescription("You are in your bathroom.");
        room[1][1].getItems();
        room[1][1].getItems();
    }

    public static void print(Room4[][] room, int x, int y) {

    	System.out.println();
        System.out.println(room[x][y].getRmDescription());
        System.out.println("You see: " + room[x][y].getItems());
    }

    // Remove item from room when added to inventory
    public static void removeItems(Room4[][] room, int x, int y, Artifact items) {
    	
    	room[x][y].deleteItems(items);
    }
}

class Room4 {

    private int rmLevel;
    private String rmName;
    private String rmDescription;
    private Monster monsterObj;
    private Puzzle puzzleObj;
    //private Artifact art;
    public ArrayList<Artifact> items = new ArrayList<>();

    public Room4(int level, String name, String description, Monster monster, Puzzle puzzle,
            ArrayList<Artifact> items) {
    	
    }

    public void setRmLevel(int level) {
        this.rmLevel = level;
    }

    public int getRmLevel() {
        return this.rmLevel;
    }

    public void setRmName(String name) {
        this.rmName = name;
    }

    public String getRmName() {
        return this.rmName;
    }

    public void setRmDescription(String description) {
        this.rmDescription = description;
    }

    public String getRmDescription() {
        return this.rmDescription;
    }
    
    
    public Monster getMonsterObj() {
    	

		return monsterObj;
	}

	public void setMonsterObj(Monster monsterObj) {
		this.monsterObj = monsterObj;
	}

	public Puzzle getPuzzleObj() {
		return puzzleObj;
	}

	public void setPuzzleObj(Puzzle puzzleObj) {
		this.puzzleObj = puzzleObj;
	}

	public void getItems(Artifact items) {
        this.items.add(items);
    }

    public void deleteItems(Artifact items) {
        this.items.remove(items);
    }

    public ArrayList<Artifact> getItems() {
    	
    	
        return this.items;
    }
}
