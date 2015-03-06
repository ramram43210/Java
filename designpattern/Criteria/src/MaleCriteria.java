import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria
{
		// Return the List of Persons who are male
		@Override
		public List<Person> meetCriteria( List<Person> persons )
		{
				List<Person> malePersons = new ArrayList<Person>();
				for( Person person : persons )
				{
						if( person.getGender().equalsIgnoreCase("male") )
						{
								malePersons.add(person);
						}
				}
				return malePersons;
		}
}