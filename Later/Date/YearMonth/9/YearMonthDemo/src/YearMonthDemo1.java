import java.time.LocalDate;
import java.time.YearMonth;

public class YearMonthDemo1
{

	public static void main(String[] args)
	{

		LocalDate localDate = LocalDate.now();

		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to convert, not null
		 * 
		 * Returns:
		 * 
		 * the year-month, not null
		 */
		YearMonth yearMonth = YearMonth.from(localDate);
		System.out.println(yearMonth);

	}

}
