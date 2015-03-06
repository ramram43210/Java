import java.util.Comparator;

public class AscendingNameComparator implements Comparator<String>
{

	/*
	 * This method used to arrange the names in ascending order.
	 */
	@Override
	public int compare( String name1, String name2 )
	{

		return name1.compareTo(name2);
	}

}
