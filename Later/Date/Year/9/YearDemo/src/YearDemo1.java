import java.time.LocalDate;
import java.time.Year;

public class YearDemo1
{

	public static void main(String[] args)
	{

		LocalDate localDate = LocalDate.now();

		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to convert, not null
		 * 
		 * Returns:the year, not null
		 */
		Year year = Year.from(localDate);
		System.out.println(year);

	}

}
