import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
				.ofPattern("--MM-dd");
		String strDate = "--11-15";

		/*
		 * Parameters:
		 * 
		 * text - the text to parse, not null
		 * 
		 * formatter - the formatter to use, not nullReturns:the
		 * parsed month-day, not null
		 * 
		 * Returns: 
		 * 
		 * the parsed month-day, not null
		 * 
		 */
		MonthDay monthDay = MonthDay.parse(strDate, dateTimeFormatter);
		System.out.println(monthDay);
	}

}
