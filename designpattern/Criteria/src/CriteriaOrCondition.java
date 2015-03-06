import java.util.List;

public class CriteriaOrCondition implements Criteria 
{
		private Criteria criteria; /* male or female or married or notMarried Criteria  */
		private Criteria otherCriteria; /* male or female or married or notMarried Criteria  */

		public CriteriaOrCondition( Criteria criteria, Criteria otherCriteria )
		{
				this.criteria = criteria;
				this.otherCriteria = otherCriteria;
		}

		// This will perform OR operation of two Criteria results
		@Override
		public List<Person> meetCriteria( List<Person> persons )
		{
				List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
				List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

				for( Person person : otherCriteriaItems )
				{
						if( !firstCriteriaItems.contains(person) )
						{
								firstCriteriaItems.add(person);
						}
				}
				return firstCriteriaItems;
		}
}
