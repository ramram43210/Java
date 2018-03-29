import java.time.Instant;

public class InstantDemo
{
	public static void main(String[] args)
	{

		 Instant instant1 = Instant.parse("2016-12-03T10:15:30.00Z");
		 System.out.println("instant1 = "+instant1);
		
		 Instant instant2 = Instant.now();
		 System.out.println("instant2 = "+instant2);
		 
		/*
		 * Parameters:
		 * 
		 * otherInstant - the other instant to compare to, not null
		 * 
		 * Returns:
		 * 
		 * true if this instant is after the specified instant
		 */
		 System.out.println(instant1.isAfter(instant2));
		 
		/*
		 * Parameters:
		 * 
		 * otherInstant - the other instant to compare to, not null
		 * 
		 * Returns:
		 * 
		 * true if this instant is before the specified instant
		 */
		 System.out.println(instant1.isBefore(instant2));

	}

}
