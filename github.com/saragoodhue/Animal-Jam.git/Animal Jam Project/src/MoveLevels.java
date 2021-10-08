
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
					
				
						else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 3)
							{
								levelThree();
							}

						else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 4)
							{
								levelFour();
							}
					
						else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 5)
							{
								levelFive();
							}
						else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 6)
							{
								levelSix();
							}
				
						else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 7)
							{
								levelSeven();
							}

						else if (AnimalRunner.player.get(AnimalRunner.characterRandom).getLevel() == 8)
							{
								levelEight();
							}
					}
			
		
		public static void levelTwo()
			{
				Map.appondale();
			}	
		
		public static void levelThree()
			{
				Map.kimbaraOutback();
			}
		
		public static void levelFour()
			{
				Map.mtShiveer();
			}
		
		public static void levelFive()
			{
				Map.coralCanyons();
			}
		
		public static void levelSix()
			{
				Map.crystalSands();
			}
		
		public static void levelSeven()
			{
				Map.serapiaForest();
			}
		
		public static void levelEight()
			{
				Map.templeOfZios();
			}

	}
