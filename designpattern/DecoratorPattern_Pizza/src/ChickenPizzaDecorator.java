public class ChickenPizzaDecorator extends PizzaDecorator
{

		public ChickenPizzaDecorator( Pizza pizza )
		{
				super(pizza);
		}

		public String makePizza()
		{
				return pizza.makePizza() + addChickenAndCheese();

		}

		private String addChickenAndCheese()
		{
				return ",Chicken and Cheese added";
		}
}