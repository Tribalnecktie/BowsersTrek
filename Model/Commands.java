package Model;

import java.util.Scanner;

import View.ConsoleView;

public class Commands {
	ConsoleView console = new ConsoleView();
	LoadRoomObj lr = new LoadRoomObj();
	Player player = new Player();
	Monster tempMonster = new Monster();
	Backpack pack = new Backpack();


	public void printRoomOptions() {
		console.printView("\t[1]  Search Room");
		console.printView("\t[2]  Attack Monster");
		console.printView("\t[3]  Solve Puzzle");
		console.printView("\t[4]  Exit Room");		
	}

	public void printMonsterOptions() {

		Monster m = new Monster();
		System.out.println("Are you ready to Rummmmble....You asked for it!!! ");
		if(lr.getRoomsList().containsKey("HW_L1") || lr.getRoomsList().containsKey("HW_L2") || lr.getRoomsList().containsKey("HW_L3") || lr.getRoomsList().containsKey("HW_L4")) {
			console.printView("No Monster in this room");
		}
		else {
			m.encounterEnemy(player, tempMonster, pack);
		}	
	}

	public void printEncounterMonsterMenu() {
		console.printView("\t[1]  Attack");
		console.printView("\t[2]  Equip Weapon");
		console.printView("\t[4]  Escape");
	}

	public void getRandomPuzzles() {


	}
}
