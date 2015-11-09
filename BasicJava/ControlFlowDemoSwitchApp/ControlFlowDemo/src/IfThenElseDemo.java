public class IfThenElseDemo
{

	public static void main(String[] args)
	{
		int month = 3;
		String monthValue;
		if (month == 1)
		{
			monthValue = "January";
		}
		else if (month == 2)
		{
			monthValue = "February";
		}
		else if (month == 3)
		{
			monthValue = "March";
		}
		else if (month == 4)
		{
			monthValue = "April";
		}
		else if (month == 5)
		{
			monthValue = "May";
		}
		else if (month == 6)
		{
			monthValue = "June";
		}
		else if (month == 7)
		{
			monthValue = "July";
		}
		else if (month == 8)
		{
			monthValue = "August";
		}
		else if (month == 9)
		{
			monthValue = "September";
		}
		else if (month == 10)
		{
			monthValue = "October";
		}
		else if (month == 11)
		{
			monthValue = "November";
		}
		else if (month == 12)
		{
			monthValue = "December";
		}
		else
		{
			monthValue = "Invalid month";
		}
		System.out.println("Month is : " + monthValue);

	}
}
