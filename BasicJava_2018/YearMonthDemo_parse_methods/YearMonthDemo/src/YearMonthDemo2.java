import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class YearMonthDemo2
{

	public static void main(String[] args)
	{

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
				.ofPattern("yyyy-MM");
		/*
		 * Parameters:
		 * 
		 * text - the text to parse, not null formatter - the
		 * formatter to use, not null
		 * 
		 * Returns:
		 * 
		 * the parsed year-month, not null
		 */
		YearMonth yearMonth = YearMonth.parse("2017-09", dateTimeFormatter);
		System.out.println(yearMonth);
	}

}
