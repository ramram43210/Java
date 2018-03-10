import java.time.Period;

public class PeriodDemo
{

	public static void main(String[] args)
	{

		Period period1 = Period.ofMonths(14);
		System.out.println("period1 = " + period1);

		/*
		 * Returns a copy of this period with the years and months
		 * normalized.
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with excess months normalized
		 * to years, not null
		 */
		Period period2 = period1.normalized();
		System.out.println("period2 = " + period2);

	}

}
