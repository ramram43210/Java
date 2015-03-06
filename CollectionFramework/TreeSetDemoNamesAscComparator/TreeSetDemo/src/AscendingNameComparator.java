import java.util.Comparator;

public class AscendingNameComparator implements Comparator<String>
{

	/*
	 * This method used to arrange the names in ascending order.
	 */
	@Override
	public int compare( String name1, String name2 )
	{

		System.out
		        .print("Compare method has been called in AscendingNameComparator, to arrange"
		                + " the names in ascending order : ");

		System.out
		        .println("name1 = " + name1 + ", name2 = " + name2 + "\n");

		return name1.compareTo(name2);
	}

}
