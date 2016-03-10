/*
 * public String[] split(String regex, int limit)
 * 
 * Parameters: 
 * ----------  
 * regex - the delimiting regular expression
 * 
 * limit - limit for the number of strings in array.
 * If it is zero, it will returns all the strings
 * matching regex.
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
		String strArray[] = str.split(",", 3);
		for (String string : strArray)
		{
			System.out.println(string);
		}

	}
}
