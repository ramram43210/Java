import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;

public class DayOfWeekDemo2
{
	public static void main(String[] args)
	{

		LocalDate localDate = LocalDate.of(2014, Month.JUNE, 21);
		DayOfWeek dayOfWeek = DayOfWeek.from(localDate);

		TemporalQuery<TemporalUnit> localDateQuery = TemporalQueries.precision();

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

		System.out.println(dayOfWeek.query(localDateQuery));

	}

}
