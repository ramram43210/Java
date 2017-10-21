/**
 * Obtaining the Class Object of an Array
 * 
 */
public class ReflectionDemo1
{
	public static void main(String[] args)
	{
		Class<String[]> stringArrayClassObj = String[].class;
		System.out.println(stringArrayClassObj);
		System.out.println(stringArrayClassObj.getName());
	}

}