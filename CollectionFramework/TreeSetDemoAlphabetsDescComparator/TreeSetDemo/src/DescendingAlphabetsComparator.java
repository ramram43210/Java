import java.util.Comparator;

public class DescendingAlphabetsComparator implements Comparator<String>
{

	/*
	 * This method used to arrange the Alphabets in descending order.
	 */
	@Override
	public int compare( String alphabet1, String alphabet2 )
	{

		System.out
		        .print("Compare method has been called in DescendingAlphabetsComparator, to arrange"
		                + " the Alphabets in descending order : ");

		System.out
		        .println("alphabet1 = " + alphabet1 + ", alphabet2 = " + alphabet2 + "\n");

		return alphabet2.compareTo(alphabet1);
	}

}
