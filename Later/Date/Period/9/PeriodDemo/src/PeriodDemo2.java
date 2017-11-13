import java.time.Period;

public class PeriodDemo2
{
	public static void main(String[] args)
	{
		Period period1 = Period.ofMonths(12);
		System.out.println("period1 = "+period1);
		/*
		 * Returns:
		 * 
		 * a Period based on this period with the amounts negated, not null
		 */
		Period period2 = period1.negated();
		System.out.println("period2 = "+period2);
	}

}
