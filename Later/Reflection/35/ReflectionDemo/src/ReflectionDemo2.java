/**
 * Obtaining the Class Object of an Array
 * 
 */
public class ReflectionDemo2
{
	public static void main(String[] args)
	{
		try
		{
			/*
			 * The JVM represents an int via the letter I. The [ on the left
			 * means it is the class of an int array I am interested in. This
			 * works for all other primitives too
			 */
			Class intArray = Class.forName("[I");
			System.out.println(intArray);
			System.out.println(intArray.getName());

			System.out.println("------------------------------");

			/*
			 * Notice the [L to the left of the class name, and the ; to the
			 * right. This means an array of objects with the given type.
			 */
			Class stringArrayClass = Class.forName("[Ljava.lang.String;");
			System.out.println(stringArrayClass);
			System.out.println(stringArrayClass.getName());
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}