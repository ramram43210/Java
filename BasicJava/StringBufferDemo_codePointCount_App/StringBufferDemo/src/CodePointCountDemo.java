/*
 * public int codePointCount(int beginIndex, int
 *                                      endIndex)
 * 
 * Parameters: 
 * ---------- 
 * beginIndex - the index to the first char of the text
 * range. 
 * 
 * endIndex - the index after the last char of
 * the text range.
 * 
 * Returns: 
 * ------- 
 * the number of Unicode code points in the specified
 * text range
 */

public class CodePointCountDemo
{

	public static void main(String[] args)
	{
		String str = "JAVA programming language";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("sb = " + sb);

		int retval = sb.codePointCount(1, 8);

		System.out.println("Codepoint count = " + retval);

	}

}