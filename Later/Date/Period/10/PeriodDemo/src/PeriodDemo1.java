import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodDemo1
{

	public static void main(String[] args)
	{

		Period period = Period.ofDays(12);
		System.out.println("period = "+period);
		
		LocalDate localDate = LocalDate.now();
		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to adjust, not null
		 * 
		 * Returns:
		 * 
		 * an object of the same type with the adjustment made, not
		 * null
		 */

		Temporal temporal = period.subtractFrom(localDate);
	    System.out.println("temporal = "+temporal);

	}

}
