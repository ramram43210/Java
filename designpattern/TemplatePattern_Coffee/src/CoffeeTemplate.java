public abstract class CoffeeTemplate
{
		/*
		 *  prepareCoffee method is a template method,this method is final,so
		 *  subclasses cannot override.
		 */
		public final void prepareCoffee()
		{
				boilWater();
				addMilk();
				addSugar();
				addCoffeePowder();
				System.out.println("Hot coffee ready.....");
		}

		public abstract void boilWater();

		public abstract void addMilk();

		public abstract void addSugar();

		public abstract void addCoffeePowder();
}