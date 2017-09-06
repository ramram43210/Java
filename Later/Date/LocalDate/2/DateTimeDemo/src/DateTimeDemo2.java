
public class DateTimeDemo2
{

	public static void main(String[] args)
	{
		/*
		 * 1 way
		 */
		java.util.Date date1 = new java.util.Date();
		System.out.println(date1);

		/*
		 * 2nd way
		 */
		long millis = System.currentTimeMillis();
		java.util.Date date2 = new java.util.Date(millis);
		System.out.println(date2);
	}

}
