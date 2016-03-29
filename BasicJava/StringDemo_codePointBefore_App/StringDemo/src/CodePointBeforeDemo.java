/*
 * public int codePointBefore(int index)
 * 
 * Parameters: 
 * ---------- 
 * index - the index following the code point that
 * should be returned
 * 
 * Returns: 
 * ------- 
 * the Unicode code point value before the given index.
 * 
 * Throws: 
 * ------ 
 * IndexOutOfBoundsException - if the index argument is
 * less than 1 or greater than the length of this
 * string.
 */
public class CodePointBeforeDemo
{

	public static void main(String[] args)
	{
		String str = "JAVA";
		System.out.println("String = " + str);

		// codepoint before index 1 i.e J
		int retval = str.codePointBefore(1);

		// prints character before index1 in string
		System.out.println("Character(unicode point) = " + retval);

	}

}