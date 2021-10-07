
public class MoveLevels
	{

		public static void main(String[] args)
			{

			}
		public static void nextLevels()
			{
						if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 2)
							{
								levelTwo();
							}
					
				
						if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 3)
							{
								levelThree();
							}

						if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 4)
							{
								levelFour();
							}
					
						if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 5)
							{
								levelFive();
							}
						if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 6)
							{
								levelSix();
							}
				
						if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 7)
							{
								levelSeven();
							}

						if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 8)
							{
								levelEight();
							}
					}
			
		
		public static void levelTwo()
			{
				Map.appondale();
				AnimalRunner.phantomHealth = 150;
				AnimalRunner.health = 100;
			}	
		public static void levelThree()
			{
				Map.kimbaraOutback();
				AnimalRunner.phantomHealth = 200;
				AnimalRunner.health = 100;
			}
		public static void levelFour()
			{
				Map.mtShiveer();
				AnimalRunner.health = 100;
			}
		public static void levelFive()
			{
				Map.coralCanyons();
				AnimalRunner.health = 100;
			}
		public static void levelSix()
			{
				Map.crystalSands();
				AnimalRunner.health = 100;
			}
		public static void levelSeven()
			{
				Map.serapiaForest();
				AnimalRunner.health = 100;
			}
		public static void levelEight()
			{
				Map.templeOfZios();
				AnimalRunner.health = 100;
			}

	}
