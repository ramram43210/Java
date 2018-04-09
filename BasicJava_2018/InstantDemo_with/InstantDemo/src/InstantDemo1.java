import java.time.Instant;

public class InstantDemo1
{
	public static void main(String[] args)
	{
		Instant instant1 = Instant.parse("2015-12-03T10:15:30.00Z");
		System.out.println("instant1 = "+instant1);
		
		Instant instant2 = Instant.now();
		System.out.println("instant2 = "+instant2);
		
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
		System.out.println("instant3 = "+instant3);
	}

}
