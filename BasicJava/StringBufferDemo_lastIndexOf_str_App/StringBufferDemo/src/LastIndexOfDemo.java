/*
 * public int lastIndexOf(String str)
 * 
 * Parameters: 
 * ---------- 
 * str - the substring to search for.
 * 
 * Returns: 
 * ------- 
 * if the string argument occurs one or
 * more times as a substring within this object, then
 * the index of the first character of the last such
 * substring is returned. If it does not occur as a
 * substring, -1 is returned.
 */
public class LastIndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome.com";
		StringBuffer sb = new StringBuffer(str);

		//Returns 8
		int indexPosition = sb.lastIndexOf("com");
		System.out.println("lastIndexOf(\"com\") = " + indexPosition);

		indexPosition = sb.lastIndexOf("abc");
		System.out.println("lastIndexOf(\"abc\") = " + indexPosition);

	}
}
