import java.time.Month;

public class MonthDemo1
{
	public static void main(String[] args)
	{
		Month month = Month.FEBRUARY;
		/*
		 * Returns:the minimum length of this month in days, from 28
		 * to 31
		 */
		System.out.println("min length = " + month.minLength());

		/*
		 * Returns:the maximum length of this month in days, from 29
		 * to 31
		 */
		System.out.println("max length = " + month.maxLength());
	}

}
