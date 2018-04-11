import java.time.Month;

public class MonthDemo1
{
	public static void main(String[] args)
	{
		Month month = Month.JULY;

		/*
		 * Returns the name of this enum constant
		 */
		System.out.println("Name = " + month.name());
		/*
		 * Gets the month-of-year int value.
		 */
		System.out.println("Value = " + month.getValue());
	}

}
