public class ReflectionDemo1
{
	public static void main(String[] args)
	{
		try
		{
			/*
			 * forName() method is used to load the class dynamically
			 *
			 * Returns:the Class object for the class with the
			 * specified name.
			 *
			 * forName() method should be used if you know the fully
			 * qualified name of class.This cannot be used for
			 * primitive types. r 
			 */
			Class<?> classObj = Class.forName("com.Student");
			System.out.println(classObj.getName());
			System.out.println(classObj.getSimpleName());
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}