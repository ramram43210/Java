import java.time.Year;
import java.time.format.DateTimeFormatter;

public class YearDemo2
{

	public static void main(String[] args)
	{
		DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy");
		/*
		 * Parameters:
		 * 
		 * text - the text to parse, not null
		 * formatter - the formatter to use, not null
		 * 
		 * Returns:
		 * 
		 * the parsed year, not null
		 */
		Year year = Year.parse("2017",dateTimeFormatter);
		System.out.println(year);
	}

}
