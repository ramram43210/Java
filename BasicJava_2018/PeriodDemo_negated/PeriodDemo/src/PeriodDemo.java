import java.time.Period;

public class PeriodDemo
{

	public static void main(String[] args)
	{

		Period period1 = Period.ofMonths(12);
		System.out.println("period1 = " + period1);
		/*
		 * Returns a new instance with each amount in this period
		 * negated.
		 * 
		 * This returns a period with each of the years, months and
		 * days units individually negated. For example, a period of
		 * "2 years, -3 months and 4 days" will be negated to
		 * "-2 years, 3 months and -4 days".
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the amounts negated, not
		 * null
		 */
		Period period2 = period1.negated();
		System.out.println("period2 = " + period2);

	}

}
