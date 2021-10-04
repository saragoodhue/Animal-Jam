import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AnimalRunner
	{
		static String randomMove;
		static ArrayList<AnimalJam> player = new ArrayList<AnimalJam>();
		static int experiencePoints = 0;
		static int health = 100;

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
				Random playerCharacter = new Random();
				Random playerPet = new Random();
				Random playerColor = new Random();
				int upperbound = 8;
				int characterRandom = playerCharacter.nextInt(upperbound);
				int petRandom = playerPet.nextInt(upperbound);
				int colorRandom = playerColor.nextInt(upperbound);

				System.out.println("Welcome to Animal Jam! (revised version)");
				System.out.println("You will be randomly assigned an avatar");
				System.out.println("You will be a " + player.get(characterRandom).getCharacter() + ", your pet is a "
						+ player.get(petRandom).getPets() + ", and your color is "
						+ player.get(colorRandom).getColor());

				System.out.println();

			}
		
		public static void phantomAttack()
			{
				int phantomHealth = 100;
			
				Random phantomMove = new Random();
				int max = 1;
				int randomPhantom = phantomMove.nextInt(max);
			
				if(randomPhantom == 0)
					{
						randomMove = "Right";
					}
				else if(randomPhantom == 1)
					{
						randomMove = "Left";
					}
			}
	
		
		public static void fightPhantoms()
			{	
				System.out.println("You've encountered a phantom! To continue, you will need to fight them");
				System.out.println("You can attack the phantom from the right or the left, which way do you want to attack?");
				Scanner fightMove = new Scanner(System.in);
				String userAttack = fightMove.nextLine();
				
				if(!userAttack.equals(randomMove))
					{
						System.out.println("The phantom dodged you, try again!");
					}
				else if(userAttack.equals(randomMove))
					{
						System.out.println("You hit the phantom! You gain 10 XP");
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
						Map.jamaaTownship();
						System.out.println("Would you like to turn right or left?");
						Scanner chooseDirection = new Scanner(System.in);
						String userDirection = chooseDirection.nextLine();
						
						if(userDirection.equals("right"))
							{
								fightPhantoms();
							}
						
						else if(userDirection.equals("left"))
							{
								experiencePoints = experiencePoints + 10;
								System.out.println("You chose a safe path! Continue on your journey. Your new XP is " + experiencePoints);
							}
						
					}
				else
					{
						System.out.println("Thanks for playing!");
					}
				

			}

	}
