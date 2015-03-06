public class Book extends Product
{

		private String name;
		private String isbnNumber;

		public Book( String name, String isbnNumber, int price )
		{
				super();
				this.name = name;
				this.isbnNumber = isbnNumber;
				this.price = price;
		}

		public String getName()
		{
				return name;
		}

		public String getIsbnNumber()
		{
				return isbnNumber;
		}

		@Override
		public void accept( ShoppingMallVisitor shoppingMallVisitor )
		{
				shoppingMallVisitor.visit(this);
		}

		@Override
		public String toString()
		{
				return "Book [name=" + name + ", isbnNumber=" + isbnNumber + ", price=" + price + "]";
		}

}