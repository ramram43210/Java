import java.util.TreeSet;

/*
 * TreeSet doesn't allow null and throw java.lang.NullPointerException
 * when you will insert null into TreeSet. 
 * Since TreeSet uses compareTo() method of respective elements to compare them  
 * which throws NullPointerException while comparing with null.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("Ram");
		treeSet.add(null);
		
		System.out.println("\ntreeSet : " + treeSet);

	}
}
