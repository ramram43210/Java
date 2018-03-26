import java.time.Instant;

public class InstantDemo
{
	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * text - the text to parse, not null
		 * 
		 * Returns:
		 * 
		 * the parsed instant, not null
		 */
		Instant instant = Instant.parse("2017-12-03T10:15:30.00Z");
		System.out.println(instant);

	}

}
