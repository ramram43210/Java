import java.time.LocalDate;

public class LocalDateDemo3
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * text - the text to parse such as "2007-12-03", not null
		 * 
		 * Returns: 
		 * 
		 * the parsed local date, not null
		 * 
		 */
		LocalDate localDate = LocalDate.parse("2007-12-03");
		System.out.println(localDate);

	}

}
