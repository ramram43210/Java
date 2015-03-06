import java.util.Comparator;

public class DescendingNameComparator implements Comparator<String>
{

	/*
	 * This method used to arrange the names in descending order.
	 */
	@Override
	public int compare( String name1, String name2 )
	{

		System.out
		        .print("Compare method has been called in DescendingNameComparator, to arrange"
		                + " the names in decending order : ");

		System.out
		        .println("name1 = " + name1 + ", name2 = " + name2 + "\n");

		return name2.compareTo(name1);
	}

}
