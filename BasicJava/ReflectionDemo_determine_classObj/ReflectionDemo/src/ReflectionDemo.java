/**
 * How to determine the class object.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Class<?>  classObj = Class.forName("java.util.List");
			
			/*
			 * Returns:true if this object represents an interface; false otherwise.
			 */
			System.out.println("Is a Interface  = " + classObj.isInterface());
			/*
			 * Returns:true if and only if this class is a member class.
			 */
			System.out.println("Is a MemberClass = " + classObj.isMemberClass());
			/*
			 * Returns:true if and only if this class represents a primitive type
			 */
			System.out.println("Is a Primitive = " + classObj.isPrimitive());
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}