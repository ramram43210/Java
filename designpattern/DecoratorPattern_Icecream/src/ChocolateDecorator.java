public class ChocolateDecorator extends IcecreamDecorator
{

		public ChocolateDecorator( Icecream specialIcecream )
		{
				super(specialIcecream);
		}

		public String makeIcecream()
		{
				return specialVanillaIcecream.makeIcecream() + addChocolate();
		}

		private String addChocolate()
		{
				return " + with chocolate";
		}
}