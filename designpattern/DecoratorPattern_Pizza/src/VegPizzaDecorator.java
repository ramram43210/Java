public class VegPizzaDecorator extends PizzaDecorator
{

		public VegPizzaDecorator( Pizza pizza )
		{
				super(pizza);
		}

		public String makePizza()
		{
				return pizza.makePizza() + addVegetableAndCheese();
		}

		private String addVegetableAndCheese()
		{
				return ",Vegetable and Cheese added";

		}
}