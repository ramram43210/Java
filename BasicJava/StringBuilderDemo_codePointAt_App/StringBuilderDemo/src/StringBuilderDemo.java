/*
 * public int codePointAt(int index)
 * 
 * Parameters: 
 * ---------- 
 * index - the index to the char values
 * 
 * Returns: 
 * ------- 
 * the code point value of the character at the index. 
 */

public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		String str = "JAVA";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("sb = " + sb);

		int retval = sb.codePointAt(1);// returns 65
		System.out.println("Character(unicode point) = " + retval);

	}
}
