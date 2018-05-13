import java.util.Date;

public class DateDemo
{
	public static void main(String[] args)
	{
		Date date1 = new Date();
		System.out.println("Original Date = " + date1);

		/*
		 * Return a copy of this object.
		 */
		Object date2 = date1.clone();
		System.out.println("Cloned date   = " + date2);
	}

}
