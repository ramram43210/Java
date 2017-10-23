import java.lang.reflect.Constructor;

public class ReflectionDemo2
{
	public static void main(String[] args)
	{

		try
		{
			Class<?> classObj = Class.forName("Student");

			/*
			 * getConstructors() method returns array of Constructors object
			 * that represent all the public constructors of the invoking
			 * object. Remember, this method only returns public constructors.
			 */
			Constructor<?>[] ct = classObj.getConstructors();
			for (int i = 0; i < ct.length; i++)
			{
				System.out.println(ct[i]);
			}

			System.out.println("--------------------------------------");

			/*
			 * If you want to see all the declared constructors of a class then
			 * use getDeclaredConstructors()
			 */
			Constructor<?>[] cdt = classObj.getDeclaredConstructors();
			for (int i = 0; i < cdt.length; i++)
			{
				System.out.println(cdt[i]);
			}
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
