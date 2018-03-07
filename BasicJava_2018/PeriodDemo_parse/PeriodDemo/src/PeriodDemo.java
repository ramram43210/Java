import java.time.Period;

public class PeriodDemo
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * text - the text to parse, not null
		 * 
		 * Examples of valid input:
		 * 
		 * "P2Y" -- Period.ofYears(2) 
		 * "P3M" -- Period.ofMonths(3)
		 * "P4W" -- Period.ofWeeks(4) 
		 * "P5D" -- Period.ofDays(5)
		 * "P2Y2M3D" -- Period.of(2, 2, 3) 
		 * "P2Y2M3W4D" -- Period.of(2, 2, 25) 
		 * "P-2Y2M" -- Period.of(-2, 2, 0)
		 * "-P2Y2M" -- Period.of(-2, -2, 0)
		 * 
		 * Returns:
		 * 
		 * the parsed period, not null 
		 * 
		 */
		Period period = Period.parse("P5D");

		System.out.println("period = " + period);

	}

}
