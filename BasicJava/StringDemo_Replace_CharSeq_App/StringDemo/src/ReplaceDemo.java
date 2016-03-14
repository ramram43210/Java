/*
 * public String replace(CharSequence target,
 *                        CharSequence replacement)
 * 
 * Parameters: 
 * ---------- 
 * target - The sequence of char values to be
 * replaced.
 * 
 * replacement - The replacement sequence
 * of char values.
 * 
 * Returns: 
 * ------- 
 * Replaces each substring of this string that
 * matches the literal target sequence with the
 * specified literal replacement sequence. The
 * replacement proceeds from the beginning of the
 * string to the end.
 */

public class ReplaceDemo
{

	public static void main(String[] args)
	{
		String str = "My name is Peter,her name is Juli";
		System.out.println("str         =  " + str);
		String replacedStr = str.replace("is", "was");
		System.out.println("replacedStr =  " + replacedStr);

	}
}
