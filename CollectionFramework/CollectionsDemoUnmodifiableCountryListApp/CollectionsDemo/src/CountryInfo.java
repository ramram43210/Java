import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryInfo
{

	List<String> countryList = new ArrayList<String>()
	{
		private static final long serialVersionUID = 1L;

		{
			add("India");
			add("Pakistan");
			add("China");
			add("Iran");
		}
	};

	public List<String> getCountryList(String startingWith)
	{

		if (startingWith == null)
		{
			/*
			 * You should always return an emptyList instead of null
			 */
			// return null;
			return Collections.emptyList();
		}

		ArrayList<String> filteredCountryList = new ArrayList<String>();
		for (String countryName : countryList)
		{
			if (countryName.startsWith(startingWith))
			{
				filteredCountryList.add(countryName);
			}
		}
		/*
		 * Returns an unmodifiable view of the specified list.
		 * 
		 * If we don't want calling client method to modify the
		 * filteredCountryList then we can make unmodifiable like below.
		 */
		return Collections.unmodifiableList(filteredCountryList);
	}

}
