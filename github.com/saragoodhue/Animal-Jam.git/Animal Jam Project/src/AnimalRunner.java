import java.util.ArrayList;
import java.util.Random;

public class AnimalRunner
	{
		static ArrayList<AnimalJam> player = new ArrayList<AnimalJam>();

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

		public static void beginJourney()
			{
				int experiencePoints = 0;
				int health = 100;
				
				

			}

	}
