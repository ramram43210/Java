import java.util.Comparator;

public class CountrySortByIdComparator implements Comparator<Country>
{

	/*
	 * This method has logic to arrange the country objects in Ascending order based on Country Id.
	 * 
	 * If country1.getCountryId()<country2.getCountryId():then compare method
	 * will return -1
	 * 
	 * If country1.getCountryId()>country2.getCountryId():then compare method
	 * will return 1
	 * 
	 * If country1.getCountryId()==country2.getCountryId():then compare method
	 * will return 0
	 */

	@Override
	public int compare(Country country1, Country country2)
	{

		System.out
				.println("Compare method in CountrySortByIdComparator has been called"
						+ "\nin order to arrange the country objects in ascending order \nbased on Country Id\n");

		return (country1.getCountryId() < country2.getCountryId()) ? -1
				: (country1.getCountryId() > country2.getCountryId()) ? 1 : 0;
	}

}