import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ShoppingMallProducts
{

		static LinkedHashMap<String, Product> productMap;

		static
		{
				productMap = new LinkedHashMap<String, Product>();

				Book weArebackBook = new Book("We are Back", "ISBN-999", 200);
				Book jesusStoryBook = new Book("Jesus Story", "ISBN-1999", 500);
				Book moralStoryBook = new Book("Moral Story", "ISBN-2999", 600);

				DVD dieHard2Dvd = new DVD("Die Hard 2", 100);
				DVD terminatorDvd = new DVD("The Terminator", 150);
				DVD titanicDvd = new DVD("Titanic", 120);

				Shirt zeroShirt = new Shirt("Zero", "42", 1500);
				Shirt peterEnglandShirt = new Shirt("Peter England", "42", 2500);
				Shirt johnPlayersShirt = new Shirt("John Players", "40", 2500);

				productMap.put("weArebackBook", weArebackBook);
				productMap.put("jesusStoryBook", jesusStoryBook);
				productMap.put("moralStoryBook", moralStoryBook);
				productMap.put("dieHard2Dvd", dieHard2Dvd);
				productMap.put("terminatorDvd", terminatorDvd);
				productMap.put("titanicDvd", titanicDvd);
				productMap.put("zeroShirt", zeroShirt);
				productMap.put("peterEnglandShirt", peterEnglandShirt);
				productMap.put("johnPlayersShirt", johnPlayersShirt);

		}

		public int getTotalAmount( ArrayList<Product> purchasedProductList )
		{
				
				Cashier cashier = new Cashier("John");

				System.out.println("Puschased Products details : \n");
				
				for( Product product : purchasedProductList )
				{
						// Each product accepts the visitor
						product.accept(cashier);
						
						System.out.println(product+"\n");
				}

				return cashier.getTotalPrice();
		}

}
