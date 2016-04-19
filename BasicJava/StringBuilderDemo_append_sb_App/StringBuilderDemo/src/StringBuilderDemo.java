/*
 * public StringBuilder append(StringBuffer sb)
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


public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder stringbuilder = new StringBuilder("Hello ");
		StringBuffer stringBuffer = new StringBuffer("Java");
		stringbuilder.append(stringBuffer);
		System.out.println(stringbuilder);
	}
}
