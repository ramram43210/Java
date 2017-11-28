import java.time.Month;

public class MonthDemo1
{
	public static void main(String[] args)
	{
		Month month = Month.JULY;
		
		System.out.println("Name = "+month.name());
		System.out.println("Value = "+month.getValue());
	}

}
