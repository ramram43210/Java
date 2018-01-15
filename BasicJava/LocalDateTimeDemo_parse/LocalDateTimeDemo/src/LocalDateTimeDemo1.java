import java.time.LocalDateTime;

public class LocalDateTimeDemo1
{

	public static void main(String[] args)
	{

		String strDate = "2020-02-03T10:15:30";
		/*
		 * Parameters:
		 * 
		 * text - the text to parse such as "2007-12-03T10:15:30", not
		 * null
		 * 
		 * Returns:the parsed local date-time, not null
		 */
		LocalDateTime localDateTime = LocalDateTime.parse(strDate);

		System.out.println(localDateTime);

	}

}
