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
 * 
 * Throws: 
 * ------ 
 * IndexOutOfBoundsException - if the beginIndex is
 * negative, or endIndex is larger than the length of
 * this String, or beginIndex is larger than endIndex.
 */

public class CodePointCountDemo
{

	public static void main(String[] args)
	{
		String str = "JAVA programming language";
		System.out.println("String = " + str);

		int retval = str.codePointCount(1, 8);

		System.out.println("Codepoint count = " + retval);

	}

}