import java.time.YearMonth;

public class YearMonthDemo1
{

	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * text - the text to parse such as "2007-12", not null
		 * 
		 * Returns:
		 * 
		 * the parsed year-month, not null
		 */
		YearMonth yearMonth = YearMonth.parse("2017-03");
		System.out.println(yearMonth);

	}

}
