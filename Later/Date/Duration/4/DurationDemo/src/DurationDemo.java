import java.time.Duration;

public class DurationDemo
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
		 * the parsed duration, not null
		 */
		Duration duration = Duration.parse("PT15M");
		System.out.println(duration);

		duration = Duration.parse("PT10H");
		System.out.println(duration);

		duration = Duration.parse("P2D");
		System.out.println(duration);

		duration = Duration.parse("P2DT3H4M");
		System.out.println(duration);

		duration = Duration.parse("P2DT3H4M");
		System.out.println(duration);

	}

}
