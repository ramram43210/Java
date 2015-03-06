import java.util.ArrayList;
import java.util.List;

public class NotMarriedCriteria implements Criteria
{

		// Return the List of Persons who are not Married
		@Override
		public List<Person> meetCriteria( List<Person> persons )
		{
				List<Person> notMarriedPersons = new ArrayList<Person>();
				for( Person person : persons )
				{
						if( person.getMaritalStatus().equalsIgnoreCase("notMarried") )
						{
							notMarriedPersons.add(person);
						}
				}
				return notMarriedPersons;
		}
}