import java.time.Month;

public class MonthDemo
{
	public static void main(String[] args)
	{
		Month month = Month.FEBRUARY;
		System.out.println("month = " + month);
		
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
