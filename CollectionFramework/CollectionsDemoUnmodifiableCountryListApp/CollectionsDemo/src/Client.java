import java.util.List;

/*
 Method: 

 public static <T> List<T> unmodifiableList(List<? extends T> list)

 Parameters:

 list - the list for which an unmodifiable view is to be returned.

 Returns:

 an unmodifiable view of the specified list.

 */

public class Client
{

	public static void main(String[] args)
	{

		CountryInfo countryInfo = new CountryInfo();
		List<String> countryList = countryInfo.getCountryList("I");

		System.out.println("countryList : " + countryList + "\n");

		countryList.add("USA");

	}

}
