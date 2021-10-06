import java.util.ArrayList;
import java.util.Scanner;

public class AnimalRunner
	{
		static ArrayList<AnimalJam> player = new ArrayList<AnimalJam>();
		static int experiencePoints = 0;
		static int health = 100;
		static int randomMove;
		
		public static void main(String[] args)
			{
				player.add(new AnimalJam("Seal", "Clownfish", "Pink"));
				player.add(new AnimalJam("Wolf", "Bear Cub", "Blue"));
				player.add(new AnimalJam("Rhino", "Pigeon", "Black"));
				player.add(new AnimalJam("Bunny", "BumbleBee", "Purple"));
				player.add(new AnimalJam("Tiger", "Wild Dog", "Orange"));
				player.add(new AnimalJam("Koala", "LadyBug", "Red"));
				player.add(new AnimalJam("Panda", "Monkey", "White"));
				player.add(new AnimalJam("Penguin", "Krill", "Yellow"));

				playerCharacter();
				beginJourney();

			}

		public static void playerCharacter()
			{				
				int characterRandom = (int) (Math.random()*7) + 1;			
				int petRandom = (int) (Math.random()*7) + 1;
				int colorRandom = (int) (Math.random()*7) + 1;

				System.out.println("Welcome to Animal Jam! (revised version)");
				System.out.println("You will be randomly assigned an avatar");
				System.out.println("You will be a " + player.get(characterRandom).getCharacter() + ", your pet is a "
						+ player.get(petRandom).getPets() + ", and your color is "
						+ player.get(colorRandom).getColor());

				System.out.println();

			}
		
		public static void phantomAttack()
			{
				randomMove = (int) (Math.random()*2) + 1;
			}
	
		
		public static void fightPhantoms()
			{	
				int phantomHealth = 100;
				
				System.out.println("You've encountered a phantom! To continue, you will need to fight them");
				System.out.println("You can attack the phantom from 1. the right or 2. the left, which way do you want to attack? (Enter 1 or 2)");
				
				while(phantomHealth > 0)
					{
						Scanner fightMove = new Scanner(System.in);
						int userAttack = fightMove.nextInt();
						phantomAttack();

						if(userAttack == randomMove)
							{
								System.out.println("You hit the phantom! You gain 10 XP, and the phantom loses 50 Health. He is still alive, so make another move!");
								experiencePoints += 10;
								phantomHealth -= 50;
							}						
						else if(userAttack != randomMove)
							{
								System.out.println("The phantom dodged you, try again!");
							}

					}
				
				if(phantomHealth == 0)
					{
						experiencePoints += 50;
						System.out.println("You defeated the phantom! You now have " + experiencePoints + " XP");
						System.out.println("You can now continue on your journey! Choose your path again.");
						
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
								System.out.println("You chose a safe path! Continue on your journey. Your new XP is " + experiencePoints);
								continueJourney();
							}
						
					}
				else
					{
						System.out.println("Thanks for playing!");
					}
				

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
					}
				
				else if(userDirection != randomMove)
					{
						experiencePoints = experiencePoints + 10;
						System.out.println("You chose a safe path! Continue on your journey. Your new XP is " + experiencePoints);
					}
			}

	}
