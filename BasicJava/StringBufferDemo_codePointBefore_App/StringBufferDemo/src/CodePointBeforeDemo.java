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
 */
public class CodePointBeforeDemo
{

	public static void main(String[] args)
	{
		String str = "JAVA";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("sb = " + sb);

		// codepoint before index 1 i.e J
		int retval = sb.codePointBefore(1);

		// prints character before index1 in string
		System.out.println("Character(unicode point) = " + retval);

	}

}