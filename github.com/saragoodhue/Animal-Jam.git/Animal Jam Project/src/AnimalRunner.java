import java.util.ArrayList;
import java.util.Scanner;

public class AnimalRunner
	{
		static ArrayList<AnimalJam> player = new ArrayList<AnimalJam>();
		static int experiencePoints = 0;
		static int randomMove;
		static int characterRandom;
		
		public static void main(String[] args)
			{
				player.add(new AnimalJam("Seal", "Clownfish", "Pink", 1, 100, 100));
				player.add(new AnimalJam("Wolf", "Bear Cub", "Blue", 1, 100, 100));
				player.add(new AnimalJam("Rhino", "Pigeon", "Black", 1, 100, 100));
				player.add(new AnimalJam("Bunny", "BumbleBee", "Purple", 1, 100, 100));
				player.add(new AnimalJam("Tiger", "Wild Dog", "Orange", 1, 100, 100));
				player.add(new AnimalJam("Koala", "LadyBug", "Red", 1, 100, 100));
				player.add(new AnimalJam("Panda", "Monkey", "White", 1, 100, 100));
				player.add(new AnimalJam("Penguin", "Krill", "Yellow", 1, 100, 100));

				playerCharacter();
				beginJourney();

			}

		public static void playerCharacter()
			{				
				characterRandom = (int) (Math.random()*7) + 1;			
				
				System.out.println("Welcome to Animal Jam! (revised version)");
				System.out.println("You will be randomly assigned an avatar");
				System.out.println("You will be a " + player.get(characterRandom).getCharacter() + ", your pet is a "
						+ player.get(characterRandom).getPets() + ", and your color is "
						+ player.get(characterRandom).getColor());

				System.out.println();
				
				

			}
		
		public static void phantomAttack()
			{
				randomMove = (int) (Math.random()*2) + 1;
				checkForLevelUp();
			}
		
		public static void continueJourney()
			{
				System.out.println("Would you like to turn 1. right or 2. left?");
				Scanner chooseDirection = new Scanner(System.in);
				int userDirection = chooseDirection.nextInt();
				System.out.println();
				
				if(userDirection == randomMove)
					{
						fightPhantoms();
						checkForLevelUp();
						
					}
				
				else if(userDirection != randomMove)
					{
						experiencePoints = experiencePoints + 10;
						checkForLevelUp();
						System.out.println("You chose a safe path! Continue on your journey. Your new XP is " + experiencePoints + " and you are on Level " + player.get(characterRandom).getLevel());
						
						continueJourney();						
					}
			}
		public static void checkIfDead()
			{
				if(player.get(characterRandom).getHealth() == 0)
					{
						System.out.println("Sorry, you died! Do you want to play again?");
						System.out.println();
						beginJourney();
					}
			}
		
		public static void fightPhantoms()
			{	
				player.get(characterRandom).setPhantomHealth(100);
				PhantomLevel.changePhantomHealth();
				
				System.out.println("You've encountered a phantom! To continue, you will need to fight them");
				System.out.println("You can attack the phantom from 1. the right or 2. the left, which way do you want to attack? (Enter 1 or 2)");
				
				while(player.get(characterRandom).getPhantomHealth() > 0)
					{
						Scanner fightMove = new Scanner(System.in);
						int userAttack = fightMove.nextInt();
						phantomAttack();

						if(userAttack == randomMove)
							{
								System.out.println("You hit the phantom! You gain 10 XP, and the phantom loses 50 Health. If he is still alive, make another move!");
								experiencePoints += 10;
								player.get(characterRandom).setPhantomHealth(player.get(characterRandom).getPhantomHealth() - 50);
								
							}						
						else if(userAttack != randomMove)
							{
								player.get(characterRandom).setHealth(player.get(characterRandom).getHealth() - 5);
								System.out.println("The phantom dodged you, try again! Your new health is " + player.get(characterRandom).getHealth());								
								checkIfDead();
							}

					}
				
				if(player.get(characterRandom).getPhantomHealth() == 0)
					{
						experiencePoints += 50;
						System.out.println();
						checkForLevelUp();
						System.out.println("You defeated the phantom! You now have " + experiencePoints + " XP" + " and you are on Level " + player.get(characterRandom).getLevel());
						System.out.println("You can now continue on your journey! Choose your path again.");
						System.out.println();
						
						continueJourney();
						
					}
			}

		public static void beginJourney()
			{
				
				System.out.println("You are beginning with 0 XP and 100 Health");
				System.out.println("Would you like to enter the first part of your journey? Enter Y or N");
				Scanner chooseToPlay = new Scanner(System.in);
				String continueJourney = chooseToPlay.nextLine();
				System.out.println();
				
				if (continueJourney.equals("Y"))
					{
						phantomAttack();
						Map.jamaaTownship();
						System.out.println("Would you like to turn 1. right or 2. left?");
						Scanner chooseDirection = new Scanner(System.in);
						int userDirection = chooseDirection.nextInt();
						System.out.println();
						
						if(userDirection == randomMove)
							{
								fightPhantoms();
							}
						
						else if(userDirection != randomMove)
							{
								experiencePoints = experiencePoints + 10;
								System.out.println("You chose a safe path! Continue on your journey. Your new XP is " + experiencePoints + " " + player.get(characterRandom).getLevel());
								
								continueJourney();
							}
					}
				else
					{
						System.out.println("Thanks for playing!");
					}

			}
		
		public static void checkForLevelUp()
			{
				if (experiencePoints >= 100 && experiencePoints < 200)
					{
						if(AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 1)
							{
								AnimalRunner.player.get(AnimalRunner.characterRandom).setLevel(2);
								MoveLevels.nextLevels();
							}
					}
				
				else if (experiencePoints >= 200 && experiencePoints < 300)
					{
						if(AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 2)
							{
								AnimalRunner.player.get(AnimalRunner.characterRandom).setLevel(3);
								MoveLevels.nextLevels();
							}
					}
				
				else if (experiencePoints >= 300 && experiencePoints < 400)
					{
						if(AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 3)
							{
								AnimalRunner.player.get(AnimalRunner.characterRandom).setLevel(4);
								MoveLevels.nextLevels();
							}
					}
				
				else if (experiencePoints >= 400 && experiencePoints < 500)
					{
						if(AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 4)
							{
								AnimalRunner.player.get(AnimalRunner.characterRandom).setLevel(5);
								MoveLevels.nextLevels();
							}
					}
				
				else if (experiencePoints >= 500 && experiencePoints < 600)
					{
						if(AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 5)
							{
								AnimalRunner.player.get(AnimalRunner.characterRandom).setLevel(6);
								MoveLevels.nextLevels();
							}
					}
				
				else if (experiencePoints >= 600 && experiencePoints < 700)
					{
						if(AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 6)
							{
								AnimalRunner.player.get(AnimalRunner.characterRandom).setLevel(7);
								MoveLevels.nextLevels();
							}
					}
				
				else if (experiencePoints >= 700 && experiencePoints < 800)
					{
						if(AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 7)
							{
								AnimalRunner.player.get(AnimalRunner.characterRandom).setLevel(8);
								MoveLevels.nextLevels();
							}
					}
				
				else if (experiencePoints >= 800)
					{
						System.out.println("You have beat all of the levels! Thanks for playing");
					}
			}
		
		

	}
