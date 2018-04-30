import java.time.Month;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalUnit;

public class MonthDemo
{
	public static void main(String[] args)
	{
		Month month = Month.of(2);

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
		TemporalUnit temporalUnit = month.query(TemporalQueries.precision());
		System.out.println(temporalUnit);
	}

}
