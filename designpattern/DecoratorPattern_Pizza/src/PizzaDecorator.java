abstract class PizzaDecorator implements Pizza
{

		protected Pizza pizza;

		public PizzaDecorator( Pizza pizza )
		{
				this.pizza = pizza;
		}

		public String makePizza()
		{
				return pizza.makePizza();
		}
}