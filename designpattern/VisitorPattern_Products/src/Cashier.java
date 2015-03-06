public class Cashier implements ShoppingMallVisitor
{

		private String name;

		private int    totalPrice = 0;

		public int getTotalPrice()
		{
				return totalPrice;
		}

		public Cashier( String name )
		{
				super();
				this.name = name;
		}

		public String getName()
		{
				return name;
		}

		@Override
		public void visit( Product product )
		{
				totalPrice = totalPrice + product.getPrice();
		}

}
