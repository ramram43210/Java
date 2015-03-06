public class Beverage
{

		private int    water;
		private int    milk;
		private int    sugar;
		private int    powderQuantity;
		private String beverageName;

		public int getWater()
		{
				return water;
		}

		public void setWater( int water )
		{
				this.water = water;
		}

		public int getMilk()
		{
				return milk;
		}

		public void setMilk( int milk )
		{
				this.milk = milk;
		}

		public int getSugar()
		{
				return sugar;
		}

		public void setSugar( int sugar )
		{
				this.sugar = sugar;
		}

		public int getPowderQuantity()
		{
				return powderQuantity;
		}

		public void setPowderQuantity( int powderQuantity )
		{
				this.powderQuantity = powderQuantity;
		}

		public String getBeverageName()
		{
				return beverageName;
		}

		public void setBeverageName( String beverageName )
		{
				this.beverageName = beverageName;
		}

		public String toString()
		{
				return "Hot " + beverageName + "!!!!  [" + water + " ml of water, " + milk + "ml of milk, " + sugar
				                + " gm of sugar, " + powderQuantity + " gm of " + beverageName + "]\n";
		}

}