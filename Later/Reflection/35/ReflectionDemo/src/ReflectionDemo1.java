/**
 * Obtaining the Class Object of an Array
 * 
 */
public class ReflectionDemo1
{
	public static void main(String[] args)
	{
		Class stringArrayClass = String[].class;
		System.out.println(stringArrayClass);
		System.out.println(stringArrayClass.getName());
	}

}