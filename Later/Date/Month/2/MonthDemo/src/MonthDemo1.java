import java.time.Month;

public class MonthDemo1
{
	public static void main(String[] args)
	{
		/*
		 * Returns:
		 * 
		 * an array containing the constants of this enum type, in the
		 * order they are declared
		 */
		Month[] monthArray = Month.values();
		for (Month month : monthArray)
		{
			System.out.println(month);
		}
	}

}
