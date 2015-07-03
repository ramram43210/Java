import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of sort(List<T> list, Comparator<? super T> c) method
 */

public class CollectionsSortExample
{

	public static void main(String[] args)
	{
		Country india = new Country(1, "Bangladesh");
		Country china = new Country(4, "China");
		Country usa = new Country(3, "Australia");
		Country srilanka = new Country(2, "Denmark");

		ArrayList<Country> countryList = new ArrayList<Country>();
		countryList.add(india);
		countryList.add(china);
		countryList.add(usa);
		countryList.add(srilanka);

		System.out.println("Before Sort  : \n");

		for (Country country : countryList)
		{
			System.out.println("Country Id: " + country.getCountryId() + " || "
					+ "Country Name: " + country.getCountryName());
		}

		System.out.println("-------------------------------------------------");
		/*
		 * Sorts the specified list according to the order induced by the
		 * specified comparator.
		 */
		Collections.sort(countryList, new CountrySortByNameComparator());

		System.out.println("-------------------------------------------------");
		System.out.println("\nAfter Sort  : \n");

		for (Country country : countryList)
		{
			System.out.println("Country Id: " + country.getCountryId() + " || "
					+ "Country Name: " + country.getCountryName());
		}

	}

}
