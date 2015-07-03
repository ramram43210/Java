import java.util.Comparator;

public class CountrySortByNameComparator implements Comparator<Country>
{

	/*
	 * This method has logic to arrange the country objects in ascending order
	 * based on Country Name.
	 */

	@Override
	public int compare(Country country1, Country country2)
	{

		System.out
				.println("Compare method in CountrySortByNameComparator has been called"
						+ "\nin order to arrange the country objects in ascending order \nbased on Country Name.\n");

		return country1.getCountryName().compareTo(country2.getCountryName());

	}

}