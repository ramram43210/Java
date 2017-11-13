import java.time.Period;
import java.time.chrono.IsoChronology;

public class PeriodDemo1
{

	public static void main(String[] args)
	{

		Period period = Period.ofMonths(12);
		/*
		 * Returns:
		 * 
		 * the ISO chronology, not null
		 */
		IsoChronology  IsoChronology  = period.getChronology();
		System.out.println(IsoChronology.getId());

	}

}
