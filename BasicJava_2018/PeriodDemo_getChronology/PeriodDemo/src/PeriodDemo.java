import java.time.Period;
import java.time.chrono.IsoChronology;

public class PeriodDemo
{

	public static void main(String[] args)
	{

		Period period = Period.ofMonths(12);
		/*
		 * Returns:
		 * 
		 * the ISO chronology, not null
		 */
		IsoChronology  isoChronology  = period.getChronology();
		System.out.println(isoChronology.getId());

	}

}
