import java.util.ArrayList;

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
				player.add(new AnimalJam("Koala", "Owl", "Red"));
				player.add(new AnimalJam("Panda", "Monkey", "White"));
				player.add(new AnimalJam("Penguin", "Krill", "Yellow"));

			}

	}
