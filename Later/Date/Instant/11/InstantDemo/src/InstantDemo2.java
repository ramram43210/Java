import java.time.Instant;

public class InstantDemo2
{
	public static void main(String[] args)
	{
		Instant instant1 = Instant.parse("2015-12-03T10:15:30.00Z");
		Instant instant2 = Instant.now();
		
		/*
		 * Parameters:
		 * 
		 * adjuster - the adjuster to use, not null
		 * 
		 * Returns:
		 * 
		 * an Instant based on this with the adjustment made, not null
		 */
		Instant instant3 = instant1.with(instant2);
		System.out.println(instant3);
	}

}
