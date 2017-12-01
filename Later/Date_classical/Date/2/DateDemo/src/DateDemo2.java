import java.util.Date;

public class DateDemo2
{
	public static void main(String[] args)
	{
		Date date1 = new Date();

		/*
		 * Returns:a clone of this instance.
		 */
		Object date2 = date1.clone();

		System.out.println("Original Date = " + date1);
		System.out.println("Cloned date   = " + date2);
	}

}
