import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria
{
		
		// Return the List of Persons who are female
		@Override
		public List<Person> meetCriteria( List<Person> persons )
		{
				List<Person> femalePersons = new ArrayList<Person>();
				for( Person person : persons )
				{
						if( person.getGender().equalsIgnoreCase("female") )
						{
								femalePersons.add(person);
						}
				}
				return femalePersons;
		}
}