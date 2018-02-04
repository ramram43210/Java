import java.time.Duration;
import java.time.OffsetTime;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{
		OffsetTime offsetTime1 = OffsetTime.now();
		System.out.println("offsetTime1   = " + offsetTime1);
		
		Duration duration = Duration.ofHours(2);
		System.out.println("duration      = "+duration);
		
		/*
		 * Parameters:
		 * 
		 * amountToAdd - the amount to add, not null
		 * 
		 * Returns:
		 * 
		 * an OffsetTime based on this time with the addition made,
		 * not null
		 */
		OffsetTime offsetTime2 = offsetTime1.plus(duration);
		System.out.println("offsetTime2   = " + offsetTime2);
	}

}
