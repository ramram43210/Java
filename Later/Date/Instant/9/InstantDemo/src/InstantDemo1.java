import java.time.Instant;

public class InstantDemo1
{
	public static void main(String[] args)
	{

		Instant instant1 = Instant.parse("2014-12-03T10:15:30.00Z");
		Instant instant2 = Instant.parse("2017-12-03T10:15:30.00Z");
		
		/*
		 * Parameters:
		 * 
		 * otherInstant - the other instant to compare to, not null
		 * 
		 * Returns:
		 * 
		 * the comparator value, negative if less, positive if greater
		 */
		int value = instant1.compareTo(instant2);
		System.out.println(value);
		
		/*
		 * Parameters:
		 * 
		 * otherInstant - the other instant, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the other instant is equal to this one
		 */
		boolean isEqual = instant1.equals(instant2);
		System.out.println(isEqual);
		
		
	}

}
