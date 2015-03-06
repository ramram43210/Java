import java.util.Comparator;

public class DescendingCountryCodeComparator implements Comparator<String>
{

	/*
	 * This method is used to arrange the CountryCodes in descending order.
	 */
	@Override
	public int compare( String countryCode1, String countryCode2 )
	{

		System.out
		        .println("\nCompare method has been called in DescendingCountryCodeComparator,\nto arrange"
		                + " the CountryCodes in decending order : ");

		System.out.println("countryCode1 = " + countryCode1
		        + ", countryCode2 = " + countryCode2 + "\n");

		return countryCode2.compareTo(countryCode1);
	}

}
