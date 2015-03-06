import java.util.List;

public class CriteriaAndCondition implements Criteria
{

		private Criteria criteria;   /* male or female or married or notMarried Criteria  */
		private Criteria otherCriteria; /* male or female or married or notMarried Criteria  */

		public CriteriaAndCondition( Criteria criteria, Criteria otherCriteria )
		{
				this.criteria = criteria;
				this.otherCriteria = otherCriteria;
		}

		 // This will perform AND operation of two Criteria results
		@Override
		public List<Person> meetCriteria( List<Person> persons )
		{
				List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
				return otherCriteria.meetCriteria(firstCriteriaPersons);
		}
}