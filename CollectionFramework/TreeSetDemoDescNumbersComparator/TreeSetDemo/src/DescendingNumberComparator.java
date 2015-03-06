import java.util.Comparator;

public class DescendingNumberComparator implements Comparator<Integer>
{

	/*
	 * This method used to arrange the numbers in descending order.
	 */
	@Override
	public int compare( Integer number1, Integer number2 )
	{

		System.out
		        .print("Compare method has been called in DescendingNumberComparator, to arrange"
		                + " the numbers in descending order : ");

		System.out
		        .println("number1 = " + number1 + ", number2 = " + number2 + "\n");

		if( number1 < number2 )
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
