import java.time.Period;

public class PeriodDemo
{

	public static void main(String[] args)
	{

		Period period1 = Period.ofDays(12);
		System.out.println("period1 = "+period1);
		
		/*
		 * Parameters:
		 * 
		 * scalar - the scalar to multiply by, not null
		 * 
		 * Returns:
		 * 
		 * a Period based on this period with the amounts multiplied
		 * by the scalar, not null
		 */

		Period period2 = period1.multipliedBy(10);
		System.out.println("period2 = "+period2);

	}

}
