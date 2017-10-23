public class ReflectionDemo1
{
	public static void main(String[] args)
	{
		try
		{
			/*
			 * forName method takes fully qualified name of classes or interface
			 * as its argument and returns instance of the class assocaited with
			 * it.
			 */
			Class<?> classObj = Class.forName("Student");
			System.out.println(classObj.getName());
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}