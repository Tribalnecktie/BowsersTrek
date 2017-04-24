package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import Model.*;
import View.ConsoleView;
import View.ViewConsole;

/**
 * @author  Tobin Crone
 * @version 1.0
 * Purpose: This will serve as the main game Controller object. Inputs from the Model will be received.
 * 			These inputs will then be pushed to the View Object to be displayed.
 */

public class GameController 
{
	private static final int DEBUG = 0;
	/*
	 * TODO:	Create Model Class Objects
	 * 			Populate with current working data set
	 * 			Send appropriate object data to the View for display
	 */

	private static boolean GAMEON = true;

	public static void main(String[] args)
	{
		/**
		 * Game Start
		 * 
		 */

		//Create and start the View for the Main Menu.
		ConsoleView console = new ConsoleView();

		//Display the Main menu
		int choice = console.printMenu("MM00");
		
		//Start Scanner
		Scanner newGameScan;

		//Process the choice for the main menu. proceed from here.		
		//Start a new Game
		if(choice == 1)		
		{
			
			newGameScan = new Scanner(System.in);
			//Set up the room map.
			Map<String,Room> roomInfoMap = new HashMap<String,Room>();
			RoomLibrary_HashMap roomLibrary = new RoomLibrary_HashMap();

			//Set up the Monster map.
			Map<String,Monster> monsterMap = new HashMap<String,Monster>();
			MonsterLibrary_HashMap monsterLibrary = new MonsterLibrary_HashMap();

			//Set the libraries to our Maps.
			roomInfoMap = roomLibrary.roomsAL();
			monsterMap = monsterLibrary.monsterAL();

			//Create our initial objects needed
			Room thisRoom = roomInfoMap.get("HW_L1");	//START NEW GAME ALWAYS AT RM101!!! ***Maybe actually the hallway. not sure how were going to do this.
			Player thisPlayer = new Player();
			Backpack thisBackpack = new Backpack();
			Monster thisMonster = monsterMap.get("ML00");
			Puzzle thisPuzzle = thisRoom.getPuzzleObj();
			
			//Get UserName and save it to the player profile
			System.out.println("Please Enter your Character Name");
			thisPlayer.setName(newGameScan.nextLine());
			console.printView("Ready to start the game " + thisPlayer.getName() + "?");
			
			//for dramatic effect
			try
			{
				console.printView("\nPutting Objects in Oven\n" );
				
				//Thread.sleep(800);
				//THIS IS THE OTHER PART COKER TOUCHED CUZ IT TOOK TO DAMN LONG TO RUN EVERY TIME
				Thread.sleep(0);
				//see if we can clear the screen here also.
			} 
			catch (InterruptedException ie)
			{
				// TODO Auto-generated catch block
				ie.printStackTrace();
			}
			finally
			{
				console.printView("\nQuality Check\n");
				console.printView("\nStarting New Game\n");
			}

			/*
			 * Creating the Game loop here. Testing is below. So far most has worked. 
			 * GAMEON = TRUE
			 * 
			 */
			while(GAMEON)
			{		
				newGameScan = new Scanner(System.in);
				//SET UP THE NEW VARIABLES
				if(thisMonster.isAlive())
				{
					thisMonster = thisRoom.rollMonster();
					thisRoom.setMonsterObj(thisMonster);
					
				}
				
				if(thisPuzzle.getIsDone())
				{
					thisPuzzle = thisRoom.getPuzzleObj();
					thisPuzzle.setIsDone(false);
					thisRoom.setPuzzleObj(thisPuzzle);
				}
				
				console.printView("=========================================================================================");
				//print room description
				console.printView(roomLibrary.getRmDescript(thisRoom.getRmId().toString())); /**@note This seems a little extreme to print a room description -_____-*/
				
				//Get and display menu options.
				MenuLibrary menulib = new MenuLibrary();
				Map<String,String[]> menuMap = new HashMap<String,String[]>();
				
				menuMap = menulib.createOptions();
				
				String[] menu;
				menu = menuMap.get(thisRoom.getRmId());
				
				//Print the menu options for this room.
				int x = 0;
				while(x < menu.length)
				{
					console.printView("\t" + x +". " + menu[x]);
					x++;
				}

				int roomchoice = newGameScan.nextInt();
				String selectedOption = menu[roomchoice];
				
				//Parse and deal with the selection
				//GOING THROUGH A DOOR TO NEW ROOM!
				if(selectedOption.substring(0, 2).equalsIgnoreCase("DR")) //Door
				{
					Room newRoom = new Room();
					String roomNumber = selectedOption.substring(2, selectedOption.length());
					
					newRoom = roomInfoMap.get("RM"+roomNumber);
					
					thisRoom = newRoom;
					thisMonster = thisRoom.rollMonster();
					thisRoom.setMonsterObj(thisMonster);
					thisRoom.getMonsterObj().setAlive(true);					
					
					console.printView("\nYou succesfully walk through a door!\n");
				}
				//GOING INTO THE HALLWAY!
				else if(selectedOption.substring(0, 2).equalsIgnoreCase("Ha")) //hallway
				{
					Room newRoom = new Room();
					String roomNumber = selectedOption.substring(8, selectedOption.length());
					console.printView("");
					
					newRoom = roomInfoMap.get("HW_"+roomNumber);
					
					thisRoom = newRoom;					
				}
				//SELECTED VIEW INVENTORY
				else if(selectedOption.substring(0,4).equalsIgnoreCase("View")) //see inventory
				{	
					/*
					Scanner inventoryScan = new Scanner(System.in);
					thisBackpack.printBackpack();
					boolean inVentory = true;
					
					while(inVentory)
					{
						console.printView("");
						console.printView("Choose an item ID to apply effect \nOr type 0 to exit the inventory");
						
						String userPick = inventoryScan.nextLine();
						
						if(userPick.equalsIgnoreCase("0"))
						{
							inventoryScan.close();
							inVentory = false;
							break;
						}
						else if (!thisBackpack.isEmpty())
						{
							//get the artifact using its id given by user.
							Artifact tempItem = thisBackpack.getItem(userPick);
							
							//apply its effect to thisPlayer
							if(tempItem.isCanHeal())
							{
								int itemStrength = tempItem.getStrength();
								thisPlayer.setHealth(thisPlayer.getHealth() + itemStrength);
								console.printView("Added " + itemStrength + " to Health");
								break;
							}
							else if(tempItem.isAddAtk())
							{
								int itemAttack = tempItem.getStrength();
								thisPlayer.setAttackPower(thisPlayer.getAttackPower() + itemAttack);
								console.printView("Added " + itemAttack + " to Attack");
								break;
							}
						}
						inventoryScan.close();
						break;
					}
					inventoryScan.close();
					*/

					/*
					while (true)
					{
						System.out.println("HERE I AM");
						String potato = newGameScan.nextLine();
						System.out.println("lets print potato");
						System.out.println(potato);
						
					}
					*/
					//thisBackpack.addArtifact(thisMonster.getItemDrop().getID(), new Artifact(thisMonster.getItemDrop().getID()));
					//thisBackpack.printBackpack();
					//Scanner inventoryScan = new Scanner(System.in);
					
					
					System.out.println(" HERE I AM ");
					//int userPick = newGameScan.nextInt();
					thisBackpack.printBackpack();
					boolean inVentory = true;
					//System.out.println(" HERE I AM ");
					//String userPick = newGameScan.nextLine();
					while(inVentory == true)
					{
						console.printView("");
						System.out.println("Choose an item ID to apply effect \nOr type 0 to exit the inventory");
						
						int userPick = newGameScan.nextInt();
						//String userPick = inventoryScan.nextLine();
						//System.out.println(" HERE I AM ");
						//String userPick = newGameScan.nextLine();
						//String userChoicsad = Integer.parseInt(userPick);
						if(userPick == 0)
						{
							inVentory = false;
							//break;
						}
						else if (!thisBackpack.isEmpty())
						{
							//get the artifact using its id given by user.
							String invChoice = "" + userPick;
							Artifact tempItem = thisBackpack.getItem(userPick + "");
							
							//apply its effect to thisPlayer
							if(tempItem.isCanHeal())
							{
								int itemStrength = tempItem.getStrength();
								thisPlayer.setHealth(thisPlayer.getHealth() + itemStrength);
								console.printView("Added " + itemStrength + " to Health");
								break;
							}
							else if(tempItem.isAddAtk())
							{
								int itemAttack = tempItem.getStrength();
								thisPlayer.setAttackPower(thisPlayer.getAttackPower() + itemAttack);
								console.printView("Added " + itemAttack + " to Attack");
								break;
							}
						}
						break;
					}
					//inventoryScan.close();
					
				}
				//SELECTED CHECK STATUS
				else if(selectedOption.substring(0,5).equalsIgnoreCase("Check")) //Check player status
				{
					thisPlayer.viewStatus();
				}
				//Attempt the Puzzle
				else if(selectedOption.substring(0,5).equalsIgnoreCase("Solve")) //Solve the Puzzle
				{
					//thisPuzzle.puzzleSolver(thisPuzzle.getID(), thisBackpack);
					
						int numOfAttempts = 0;
						boolean inPuzzle = true;
						
						thisPuzzle.getIsDone();
						
						while (inPuzzle == true && thisPuzzle.pzlStatus == false)
						{
							System.out.println(thisPuzzle.getPzlDescription());
							String answer = thisPuzzle.getAnswer();
							String hint = thisPuzzle.getHint();
							
							//SCANNERRRRRRRRRRRRRRRRRRRRRRRRR???????????????????
							if (numOfAttempts < 5)
							{
								
								
								if (newGameScan.equals(answer))
								{
									System.out.println("You have correctly answer the puzzle!");
									System.out.println(thisPuzzle.getReward() + " has been added to your inventory");
									thisBackpack.addArtifact(thisPuzzle.getReward().getID(), thisPuzzle.getReward());
									thisPuzzle.setIsDone(true);
									inPuzzle = false;
									newGameScan.close();
								}
								else
								{
									System.out.println("That is not the correct answer, please try again.");
									
									numOfAttempts += 1;
								}
							}
							else if (numOfAttempts >= 5 && numOfAttempts <= 10)
							{
								System.out.print("Looks like you are having a little trouble, here is a hint: ");
								System.out.print(hint + " ");
								
								if (newGameScan.equals(answer))
								{
									System.out.println("You have correctly answer the puzzle!");
									System.out.println(thisPuzzle.getReward() + " has been added to your inventory");
									thisBackpack.addArtifact(thisPuzzle.getReward().getID(), thisPuzzle.getReward());
									thisPuzzle.setIsDone(true);
									inPuzzle = false;
									newGameScan.close();
								}
								else
								{
								numOfAttempts += 1;
								}
							}
							else
							{
								System.out.println("Would you like to come back to this puzzle later?");
								System.out.println("1. Come back to puzzle later");
								System.out.println("2. Keep trying");
								int command = newGameScan.nextInt();
								///////////////////////////////////////////Fix scanner??
								if (command == 1)
								{
									System.out.println("You can always come back and try again, have a safe journey.");
									inPuzzle = false;
									newGameScan.close();
								}
								else if (command == 2)
								{
									System.out.println("I like the spirit, lets keep trying.");
									numOfAttempts = 5;
								}
							}
						}
						
					
				}
				//SELECTED ATTACK MONSTER
				else if(selectedOption.substring(0,6).equalsIgnoreCase("Attack")) //Attack the monster
				{
					//Enter Monster loop if this monster is alive.
					if(thisMonster.isAlive())
					{
						//Scanner playerInput = new Scanner(System.in);
						boolean inEncounter = true;
						//Monster tempMonster = mList[0];
						if (thisMonster.getHealth() <= 0)
						{
							System.out.println("You have already slain this monster");
							thisMonster.setAlive(false);
							//playerInput.close();
							inEncounter = false;
							return;
						}

						System.out.println(thisMonster.getDescription());
						while (inEncounter == true)
						{
							if (thisPlayer.getHealth() <= 0)
							{
								System.out.println("You died, Better Luck Next TIme");
								inEncounter = false;
								//playerInput.close();
							}
							else if (thisMonster.getHealth() <= 0 && inEncounter == true)
							{
								System.out.println("You have slain the beast here is your reward");
								System.out.println(thisMonster.getItemDrop().getName() + " added to your inventory");
								thisBackpack.addArtifact(thisMonster.getItemDrop().getID(), thisMonster.getItemDrop());
								thisPlayer.addScore(thisMonster);
								thisMonster.setAlive(false);
								inEncounter = false;
							}
							else
							{
								System.out.println("\nYour Health " + thisPlayer.getHealth() + "\n");
								
								System.out.println("1. Attack");
								System.out.println("2. Inventory");
								System.out.println("3. Examine Monster");
								System.out.println("4. Escape");
								int command = newGameScan.nextInt();
								if (command == 1)
								{
									System.out.println("You attack for " + thisPlayer.getAttackPower());
									thisPlayer.attack(thisMonster);
									System.out.println("Monster Health " + thisMonster.getHealth());
									System.out.println(thisMonster.getName() + " attacks you for " + thisMonster.getAttackPower() + " Health");
									thisMonster.attack(thisPlayer);	
								}
								else if (command == 2)
								{
									/*
									while (true)
									{
										System.out.println("HERE I AM");
										String potato = newGameScan.nextLine();
										System.out.println("lets print potato");
										System.out.println(potato);
										
									}
									*/
									//thisBackpack.addArtifact(thisMonster.getItemDrop().getID(), new Artifact(thisMonster.getItemDrop().getID()));
									//thisBackpack.printBackpack();
									//Scanner inventoryScan = new Scanner(System.in);
									
									
									System.out.println(" HERE I AM ");
									//int userPick = newGameScan.nextInt();
									thisBackpack.printBackpack();
									boolean inVentory = true;
									//System.out.println(" HERE I AM ");
									//String userPick = newGameScan.nextLine();
									while(inVentory == true)
									{
										console.printView("");
										System.out.println("Choose an item ID to apply effect \nOr type 0 to exit the inventory");
										
										int userPick = newGameScan.nextInt();
										//String userPick = inventoryScan.nextLine();
										//System.out.println(" HERE I AM ");
										//String userPick = newGameScan.nextLine();
										//String userChoicsad = Integer.parseInt(userPick);
										if(userPick == 0)
										{
											inVentory = false;
											//break;
										}
										else if (!thisBackpack.isEmpty())
										{
											//get the artifact using its id given by user.
											String invChoice = "" + userPick;
											Artifact tempItem = thisBackpack.getItem(userPick + "");
											
											//apply its effect to thisPlayer
											if(tempItem.isCanHeal())
											{
												int itemStrength = tempItem.getStrength();
												thisPlayer.setHealth(thisPlayer.getHealth() + itemStrength);
												console.printView("Added " + itemStrength + " to Health");
												break;
											}
											else if(tempItem.isAddAtk())
											{
												int itemAttack = tempItem.getStrength();
												thisPlayer.setAttackPower(thisPlayer.getAttackPower() + itemAttack);
												console.printView("Added " + itemAttack + " to Attack");
												break;
											}
										}
										break;
									}
									//inventoryScan.close();
									

								}
								else if (command == 3)
								{
									System.out.println("Monster Health: " + thisMonster.getHealth());
									System.out.println("Monster Attack Power: " + thisMonster.getAttackPower());
									System.out.println("Monster's Held Item: " + thisMonster.getItemDrop().getName());
								}
								else if (command == 4)
								{
									System.out.println("You've escaped with your life");
									inEncounter = false;
								}
								else
								{
									System.out.println("Invalid Input, please try again");
								}
							}
						}
					}
					else
					{
						console.printView("You've already killt this boi!");
					}								
				}
				
				if(thisPlayer.getHealth() == 0)
				{
					console.printView("Aww good try! Thanks for playing :) \nEat more vegetables and grow big and strong and try again one day!");
					GAMEON = false;
				}
			}
			
			newGameScan.close();
		}
		//Load Game
		else if(choice == 2)	
		{
			//Show the user a list of save files
			//When one is chosen. Load that file.
			System.out.println("Save Files:\n");
			System.out.println("Tobin : Room 1");
			
			/**
			 * Need here a method to check names of all the save files.
			 */
			
			
			//Start player at loaded room ID.
		}
		//Exit the game
		else if(choice == 3)
		{
			System.exit(0);
		}
		//Dev team info
		else if(choice == 4)
		{

		}		
	}
}