import java.time.DayOfWeek;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;

public class DayOfWeekDemo
{
	public static void main(String[] args)
	{
		DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
		TemporalQuery<TemporalUnit> temporalQuery = TemporalQueries.precision();

		/*
		 * Parameters:
		 * 
		 * query - the query to invoke, not null
		 * 
		 * Returns:
		 * 
		 * the query result, null may be returned (defined by the
		 * query)
		 */

		System.out.println(dayOfWeek.query(temporalQuery));

	}

}
