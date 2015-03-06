import java.util.Comparator;

public class AscendingNumberComparator implements Comparator<Integer>
{

	/*
	 * This method used to arrange the numbers in ascending order.
	 */
	@Override
	public int compare(Integer number1, Integer number2)
	{

		System.out
				.print("Compare method has been called in AscendingNumberComparator, to arrange"
						+ " the numbers in ascending order : ");

		System.out.println("number1 = " + number1 + ", number2 = " + number2
				+ "\n");

		if (number1 < number2)
		{
			return -1;
		}
		else
		{
			return +1;
		}
	}

}
