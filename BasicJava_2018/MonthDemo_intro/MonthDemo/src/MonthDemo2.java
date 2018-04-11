import java.time.LocalDate;
import java.time.Month;

public class MonthDemo2
{
	public static void main(String[] args)
	{

		LocalDate localDate = LocalDate.now();
		System.out.println("localDate = " + localDate);

		/*
		 * Obtains an instance of Month from a temporal object.
		 * 
		 * Parameters:
		 * 
		 * temporal - the temporal object to convert, not null
		 * 
		 * Returns:
		 * 
		 * the month-of-year, not null
		 */
		Month month = Month.from(localDate);
		System.out.println("Name = " + month.name());
		System.out.println("Value = " + month.getValue());
	}

}
