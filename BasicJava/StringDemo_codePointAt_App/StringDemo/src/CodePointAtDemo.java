/*
 * public int codePointAt(int index)
 * 
 * Parameters: 
 * ---------- 
 * index - the index to the char values
 * 
 * Returns: 
 * ------- 
 * the code point value of the character at the index
 * 
 * Throws: 
 * ------ 
 * IndexOutOfBoundsException - if the index argument is
 * negative or not less than the length of this string.
 */

public class CodePointAtDemo
{

	public static void main(String[] args)
	{
		String str = "JAVA";
		System.out.println("String = " + str);

		int retval = str.codePointAt(1);
		System.out.println("Character(unicode point) = " + retval);
		
	}

}