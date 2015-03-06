public class DVD extends Product
{

		private String name;

		public DVD( String name, int price )
		{
				super();
				this.name = name;
				this.price = price;
		}

		public String getName()
		{
				return name;
		}

		@Override
		public void accept( ShoppingMallVisitor shoppingMallVisitor )
		{
				shoppingMallVisitor.visit(this);
		}

		@Override
		public String toString()
		{
				return "DVD [name=" + name + ", price=" + price + "]";
		}

}