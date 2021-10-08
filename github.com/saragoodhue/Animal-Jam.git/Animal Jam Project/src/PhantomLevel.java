
public class PhantomLevel {

	public static void main(String[] args) {
		

	}
	
	public static void changePhantomHealth()
	{
		if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 2)
		{
			AnimalRunner.player.get(AnimalRunner.characterRandom).setPhantomHealth(150);
		}
		
		else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 3)
		{
			AnimalRunner.player.get(AnimalRunner.characterRandom).setPhantomHealth(200);
		}
		
		else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 4)
		{
			AnimalRunner.player.get(AnimalRunner.characterRandom).setPhantomHealth(250);
		}
		
		else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 5)
		{
			AnimalRunner.player.get(AnimalRunner.characterRandom).setPhantomHealth(300);
		}
		
		else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 6)
		{
			AnimalRunner.player.get(AnimalRunner.characterRandom).setPhantomHealth(350);
		}
		
		else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 7)
		{
			AnimalRunner.player.get(AnimalRunner.characterRandom).setPhantomHealth(400);
		}
		
		else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 8)
		{
			AnimalRunner.player.get(AnimalRunner.characterRandom).setPhantomHealth(500);
		}
	}

}
