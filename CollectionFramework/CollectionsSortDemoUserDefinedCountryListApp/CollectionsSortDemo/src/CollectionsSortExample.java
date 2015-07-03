import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of sort(List<T> list) method
 */

public class CollectionsSortExample
{

	public static void main(String[] args)
	{
		Country india = new Country(1, "India");
		Country china = new Country(4, "China");
		Country usa = new Country(3, "USA");
		Country srilanka = new Country(2, "Srilanka");

		ArrayList<Country> countryList = new ArrayList<Country>();
		countryList.add(india);
		countryList.add(china);
		countryList.add(usa);
		countryList.add(srilanka);

		System.out.println("Before Sort  : ");

		for (Country country : countryList)
		{
			System.out.println("Country Id: " + country.getCountryId() + " || "
					+ "Country name: " + country.getCountryName());
		}

		/*
		 * Sorts the specified list into ascending order, according to the
		 * natural ordering of its elements.
		 * 
		 * All elements in the list must implement the Comparable interface.
		 */
		Collections.sort(countryList);

		
		System.out.println("\nAfter Sort  : ");
		
		for (Country country : countryList)
		{
			System.out.println("Country Id: " + country.getCountryId() + " || "
					+ "Country name: " + country.getCountryName());
		}

	}

}
