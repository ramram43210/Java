import java.time.Month;

public class MonthDemo
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * name - the name of the enum constant to be returned.
		 * 
		 * Returns:
		 * 
		 * the enum constant with the specified name
		 */
		Month month = Month.valueOf("JUNE");

		System.out.println("Name = " + month.name());
		System.out.println("Value = " + month.getValue());
	}

}
