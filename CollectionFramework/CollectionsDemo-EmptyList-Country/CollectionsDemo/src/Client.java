import java.util.List;

/*
 Method: 

 public static final <T> List<T> emptyList()

 Parameters:

 c - the collection for which an enumeration is to be returned.

 Returns:

 an empty immutable list.

 */

public class Client
{

	public static void main(String[] args)
	{

		CountryInfo countryInfo = new CountryInfo();
		List<String> countryList = countryInfo.getCountryList(null);

		System.out.println("countryList size : " + countryList.size());

	}

}
