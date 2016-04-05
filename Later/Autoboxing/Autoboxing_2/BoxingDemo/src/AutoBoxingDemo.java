import java.util.ArrayList;
import java.util.List;

/*
 * Converting a primitive value (an int, for example)
 * into an object of the corresponding wrapper class
 * (Integer) is called autoboxing. The Java compiler
 * applies autoboxing when a primitive value is:
 * 
 * 1.Passed as a parameter to a method that expects an
 * object of the corresponding wrapper class. 
 * 
 * 2.Assigned to a variable of the corresponding wrapper
 * class.
 */
public class AutoBoxingDemo
{

	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<>();
		/*
		 * Although you add the int values as primitive
		 * types, rather than Integer objects, to li, the
		 * code compiles. Because li is a list of Integer
		 * objects, not a list of int values, you may wonder
		 * why the Java compiler does not issue a
		 * compile-time error. The compiler does not
		 * generate an error because it creates an Integer
		 * object from i and adds the object to li
		 * 
		 * Thus, the compiler converts the code to the
		 * following at runtime:
		 * 
		 * for (int i = 1; i < 20;i += 2) 
		 * {
		 *    li.add(Integer.valueOf(i)); 
		 * }
		 */
		for (int i = 1; i < 20; i += 2)
		{
			li.add(i);
		}
		System.out.println(li);
		System.out.println(li.get(0).getClass());
	}

}
