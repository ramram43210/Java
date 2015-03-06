public class NuttyDecorator extends IcecreamDecorator
{

		public NuttyDecorator( Icecream specialVanillaIcecream )
		{
				super(specialVanillaIcecream);
		}

		public String makeIcecream()
		{
				return specialVanillaIcecream.makeIcecream() + addNuts();
		}

		private String addNuts()
		{
				return " + with nuts";
		}
}