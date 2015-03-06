import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorPatternDemo
{

		public static void main( String[] args )
		{
				ArrayList<String> listOfCountries = new ArrayList<String>();
				listOfCountries.add("India");
				listOfCountries.add("US");
				listOfCountries.add("Japan");
				listOfCountries.add("France");

				Iterator<String> iterator = listOfCountries.iterator();
				System.out.println("Iterator type for the Datastructure ArrayList : "+iterator.toString());
				System.out.println();
				while( iterator.hasNext() )
				{
						String countryName = iterator.next();
						System.out.println("Country Name : " + countryName);
				}
				System.out.println();
				
				Set<String> setOfCountries = new HashSet<String>();
				setOfCountries.add("India");
				setOfCountries.add("US");
				setOfCountries.add("Japan");
				setOfCountries.add("France");
				
				Iterator<String> iterator1 = setOfCountries.iterator();
				System.out.println("Iterator type for the Datastructure HashSet : "+iterator1.toString());
				System.out.println();
				while( iterator1.hasNext() )
				{
						String countryName = iterator1.next();
						System.out.println("Country Name : " + countryName);
				}

		}

}
