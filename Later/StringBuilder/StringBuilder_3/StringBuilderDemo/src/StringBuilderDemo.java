/*
 * public StringBuilder append(StringBuffer sb)
 * 
 * Appends the specified StringBuilder to this sequence.
 * 
 * Parameters:
 * ----------   
 * sb - the StringBuilder to append.
 * 
 * Returns:
 * -------
 * a reference to this object.
 */


public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("Hello ");
		StringBuffer sb2 = new StringBuffer("Java");
		sb1.append(sb2);
		System.out.println(sb1);
	}
}
