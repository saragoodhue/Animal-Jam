
public class MoveLevels
	{

		public static void main(String[] args)
			{

			}
		public static void nextLevels()
			{
				for(int i = 0; i <= 1; i++)
					{
						if (AnimalRunner.experiencePoints >= 100 && AnimalRunner.experiencePoints < 200)
							{
								levelTwo();
								i += 1;
							}
					}
				
				for(int i = 0; i <= 1; i++)
					{
						if (AnimalRunner.experiencePoints >= 200 && AnimalRunner.experiencePoints < 300)
							{
								levelThree();
								i += 1;
							}
					}
				
				for(int i = 0; i <= 1; i++)
					{
						if (AnimalRunner.experiencePoints >= 300 && AnimalRunner.experiencePoints < 400)
							{
								levelFour();
								i += 1;
							}
					}

				for(int i = 0; i <= 1; i++)
					{
						if (AnimalRunner.experiencePoints >= 400 && AnimalRunner.experiencePoints < 500)
							{
								levelFive();
								i += 1;
							}
					}

				for(int i = 0; i <= 1; i++)
					{
						if (AnimalRunner.experiencePoints >= 500 && AnimalRunner.experiencePoints < 600)
							{
								levelSix();
								i += 1;
							}
					}
				
				for(int i = 0; i <= 1; i++)
					{
						if (AnimalRunner.experiencePoints >= 600 && AnimalRunner.experiencePoints < 700)
							{
								levelSeven();
								i += 1;
							}
					}
				
				for(int i = 0; i <= 1; i++)
					{
						if (AnimalRunner.experiencePoints >= 700 && AnimalRunner.experiencePoints < 800)
							{
								levelEight();
								i += 1;
							}
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
