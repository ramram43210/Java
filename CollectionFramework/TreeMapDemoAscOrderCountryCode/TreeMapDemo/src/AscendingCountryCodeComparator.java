import java.util.Comparator;

public class AscendingCountryCodeComparator implements Comparator<String>
{

	/*
	 * This method is used to arrange the CountryCodes in Ascending order.
	 */
	@Override
	public int compare( String countryCode1, String countryCode2 )
	{

		System.out
		        .println("\nCompare method has been called in AscendingCountryCodeComparator,\nto arrange"
		                + " the CountryCodes in ascending order : ");

		System.out.println("countryCode1 = " + countryCode1
		        + ", countryCode2 = " + countryCode2 + "\n");

		return countryCode1.compareTo(countryCode2);
	}

}
