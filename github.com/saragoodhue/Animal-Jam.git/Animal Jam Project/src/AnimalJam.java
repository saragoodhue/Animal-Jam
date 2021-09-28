import java.util.ArrayList;
public class AnimalJam
	{

		private String character;
		private String pets;
		private String color;
		
		public AnimalJam(String c, String p, String co)
			{
				character = c;
				pets = p;
				color = co;
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

		
		

	}
