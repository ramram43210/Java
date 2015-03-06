/* 
 * CoffeeBuilder creates coffee by mixing the components[water,milk,sugar,coffee powder]. 
 * CoffeeBuilder implements BeverageBuilder which is bluePrint for creating beverage objects.
 * */
public class CoffeeBuilder extends BeverageBuilder
{
		Beverage createBeverage()
		{
				return new Beverage();
		}

		public void setWater()
		{
				System.out.println("Step 1 : Boiling water");
				getBeverage().setWater(40);
		}

		public void setMilk()
		{
				System.out.println("Step 2 : Adding milk");
				getBeverage().setMilk(50);
		}

		void setSugar()
		{
				System.out.println("Step 3 : Adding sugar");
				getBeverage().setSugar(10);
		}

		void setPowderQuantity()
		{
				System.out.println("Step 4 : Adding 9 Grams of coffee powder");
				getBeverage().setPowderQuantity(9);
		}

		void setBeverageType()
		{
				System.out.println("Coffee");
				getBeverage().setBeverageName("Coffee");
		}

}