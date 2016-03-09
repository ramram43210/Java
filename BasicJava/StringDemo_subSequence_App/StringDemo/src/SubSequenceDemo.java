/*
 * public CharSequence subSequence(int beginIndex,
 *                                     int endIndex)
 * 
 * Parameters: 
 * ----------  
 * beginIndex - the begin index,
 * inclusive. endIndex - the end index, exclusive.
 * 
 * Returns: 
 * -------
 * Returns a character sequence that is a
 * subsequence of this sequence. 
 * 
 * An invocation of this method of the form
 * 
 * str.subSequence(begin, end) 
 * 
 * behaves in exactly the same way as the 
 * invocation
 * 
 * str.substring(begin, end)
 */

public class SubSequenceDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";
		CharSequence charSequence = str.subSequence(3, 6);
		String strValue = (String) charSequence;
		System.out.println("strValue = " + strValue);

	}
}
