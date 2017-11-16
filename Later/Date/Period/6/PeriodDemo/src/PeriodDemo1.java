import java.time.Period;

public class PeriodDemo1
{

	public static void main(String[] args)
	{

		Period periodTemporal = Period.ofMonths(12);
		/*
		 * Parameters:
		 * 
		 * amount - the temporal amount to convert, not null
		 * 
		 * Returns:
		 * 
		 * the equivalent period, not null
		 */
		Period period = Period.from(periodTemporal);

		System.out.println(period);

	}

}
