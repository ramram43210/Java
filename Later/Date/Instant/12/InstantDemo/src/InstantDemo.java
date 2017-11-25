import java.time.Instant;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalUnit;

public class InstantDemo
{
	public static void main(String[] args)
	{

		Instant instant = Instant.parse("2017-12-03T10:15:30.00Z");
		
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
		TemporalUnit temporalUnit = instant.query(TemporalQueries.precision());
		System.out.println(temporalUnit);

	}

}
