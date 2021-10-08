import java.util.ArrayList;
public class AnimalJam
	{
		
		private String character;
		private String pets;
		private String color;
		private int level;
		private int health;
		private int phantomHealth;
		
		public AnimalJam(String c, String p, String co, int l, int h, int ph)
			{
				character = c;
				pets = p;
				color = co;
				level = l;
				health = h;
				phantomHealth = ph;
			}
		
		public String getCharacter()
			{
				return character;
			}
		public void setCharacter(String character)
			{
				this.character = character;
			}
		public String getPets()
			{
				return pets;
			}
		public void setPets(String pets)
			{
				this.pets = pets;
			}

		public String getColor()
			{
				return color;
			}

		public void setColor(String color)
			{
				this.color = color;
			}

		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}

		public int getHealth() {
			return health;
		}

		public void setHealth(int health) {
			this.health = health;
		}

		public int getPhantomHealth() {
			return phantomHealth;
		}

		public void setPhantomHealth(int phantomHealth) {
			this.phantomHealth = phantomHealth;
		}
		
		

		
		

	}
