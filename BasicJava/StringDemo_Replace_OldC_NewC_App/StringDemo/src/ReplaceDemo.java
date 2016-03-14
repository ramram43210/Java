/*
 * public String replace(char oldChar, char newChar)
 * 
 * Parameters: 
 * ---------- 
 * oldChar - the old character. 
 * newChar - the new character.
 * 
 * Returns: 
 * ------- 
 * Returns a string resulting from replacing all
 * occurrences of oldChar in this string with
 * newChar.
 */

public class ReplaceDemo
{

	public static void main(String[] args)
	{
		String str = "aaabbb";
		System.out.println("str         =  " + str);
		String replacedStr = str.replace('a', 'z');
		System.out.println("replacedStr =  " + replacedStr);
	}
}
