/*
 * public StringBuffer append(StringBuffer sb)
 * 
 * Appends the specified StringBuffer to this sequence.
 * 
 * Parameters:
 * ----------   
 * sb - the StringBuffer to append.
 * 
 * Returns:
 * -------
 * a reference to this object.
 */

public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Hello ");
		StringBuffer sb2 = new StringBuffer("Java");
		sb1.append(sb2);
		System.out.println(sb1);
	}
}
