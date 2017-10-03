public class ReflectionDemo
{
	public static void main(String[] args)
	{

		try
		{
			Class<?> classObj = Class.forName("DisplayMessage");
			/*
			 * Returns:a newly allocated instance of the class represented by
			 * this object.
			 */
			DisplayMessage displayMessage = (DisplayMessage) classObj.newInstance();
			displayMessage.sayHello();
		}
		catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}