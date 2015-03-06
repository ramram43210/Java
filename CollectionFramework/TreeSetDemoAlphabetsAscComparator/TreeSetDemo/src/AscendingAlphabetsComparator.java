import java.util.Comparator;

public class AscendingAlphabetsComparator implements Comparator<String>
{

	/*
	 * This method used to arrange the Alphabets in Ascending order.
	 */
	@Override
	public int compare( String alphabet1, String alphabet2 )
	{

		System.out
		        .print("Compare method has been called in AscendingAlphabetsComparator, to arrange"
		                + " the Alphabets in ascending order : ");

		System.out
		        .println("alphabet1 = " + alphabet1 + ", alphabet2 = " + alphabet2 + "\n");

		return alphabet1.compareTo(alphabet2);
	}

}
