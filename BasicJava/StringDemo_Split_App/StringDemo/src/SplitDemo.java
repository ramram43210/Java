/*
 * public String[] split(String regex)
 * 
 * Parameters: 
 * ---------- 
 * regex - the delimiting regular expression
 * 
 * Returns: 
 * ------- 
 * the array of strings computed by splitting this
 * string around matches of the given regular
 * expression
 */

public class SplitDemo
{

	public static void main(String[] args)
	{
		String str = "Peter,Welcome,to,India";
		String strArray[] = str.split(",");
		for (String string : strArray)
		{
			System.out.println(string);
		}

	}
}
