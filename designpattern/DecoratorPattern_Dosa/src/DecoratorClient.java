public class DecoratorClient
{

		public static void main( String args[] )
		{
				PlainDosa plainDosaObj = new PlainDosa();
				String plainDosa = plainDosaObj.makeDosa();
				System.out.println(plainDosa);

				String onionDosa = new OnionDosaDecorator(plainDosaObj).makeDosa();
				System.out.println("\n'" + onionDosa + "' using OnionDosaDecorator");

				String masalaDosa = new MasalaDosaDecorator(plainDosaObj).makeDosa();
				System.out.println("\n'" + masalaDosa + "' using MasalaDosaDecorator");

		}

}