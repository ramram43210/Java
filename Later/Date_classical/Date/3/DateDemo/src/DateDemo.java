import java.util.Calendar;
import java.util.Date;

public class DateDemo
{
	public static void main(String[] args)
	{
		Date date1 = Calendar.getInstance().getTime();
		System.out.println("date1 = " + date1);
		 
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.YEAR, 2000);
	    Date date2 = cal.getTime();
	    System.out.println("date2 = " + date2);

		/*
		 * Parameters:
		 * 
		 * anotherDate - the Date to be compared.
		 * 
		 * Returns:
		 * 
		 * the value 0 if the argument Date is equal to this Date; a
		 * value less than 0 if this Date is before the Date argument;
		 * and a value greater than 0 if this Date is after the Date
		 * argument.
		 */
	    int result = date1.compareTo(date2);	    
	    System.out.println(result); 
	    
		/*
		 * Parameters:
		 * 
		 * obj - the object to compare with.
		 * 
		 * Returns:
		 * 
		 * true if the objects are the same; false otherwise.
		 */
	    boolean isEqual = date1.equals(date2);
	    System.out.println(isEqual);
	    
	}

}
