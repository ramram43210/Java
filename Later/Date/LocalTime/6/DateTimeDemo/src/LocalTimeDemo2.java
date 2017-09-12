import java.time.LocalTime;

public class LocalTimeDemo2
{

	public static void main(String[] args)
	{
		LocalTime time1 = LocalTime.parse("05:30:30");
		System.out.println(time1);

		LocalTime time2 = LocalTime.parse("05:30:30");
		System.out.println(time2);

		/*
		 * Parameters:
		 * 
		 * obj - the object to check, null returns false
		 * 
		 * Returns:true if this is equal to the other time
		 */

		boolean value = time1.equals(time2);

		System.out.println(value);
	}

}
