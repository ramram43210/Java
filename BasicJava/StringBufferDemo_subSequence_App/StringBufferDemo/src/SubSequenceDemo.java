/*
 * public CharSequence subSequence(int start, int end)
 * 
 * Parameters: 
 * ---------- 
 * start - the start index,inclusive. 
 * 
 * end - the end index, exclusive.
 * 
 * Returns: 
 * ------- 
 * the specified subsequence.
 * 
 * Throws: 
 * ------ 
 * IndexOutOfBoundsException - if start or end 
 * are negative, if end is greater than length(),
 * or if start is greater than end
 */
public class SubSequenceDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Welcome");
		CharSequence charSequence = sb.subSequence(3, 6);
		String strValue = (String) charSequence;
		System.out.println("strValue = " + strValue);

	}
}
