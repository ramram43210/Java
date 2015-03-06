import java.util.TreeMap;

/*
 * Example of comparator() method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		AscendingCountryCodeComparator ascendingCountryCodeComparator = new AscendingCountryCodeComparator();

		TreeMap<String, String> treeMap = new TreeMap<String, String>(
				ascendingCountryCodeComparator);
		/*
		 * Key is CountryCode - Value is CountryName
		 */

		System.out.println("Key:CN,Value:CHINA is going to be add in treeMap");
		treeMap.put("CN", "CHINA");
	
		System.out.println("Key:BE,Value:BELGIUM is going to be add in treeMap");
		treeMap.put("BE", "BELGIUM");
		
		System.out.println("Key:AF,Value:AFGHANISTAN is going to be add in treeMap");
		treeMap.put("AF", "AFGHANISTAN");
		
		System.out.println("Key:DK,Value:DENMARK is going to be add in treeMap");
		treeMap.put("DK", "DENMARK");

		System.out.println("treeMap : " + treeMap + "\n");

	}
}
