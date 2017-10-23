import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * A simple Java program to demonstrate the use of reflection.
 */
public class ReflectionDemo
{
	public static void main(String[] args) throws Exception
	{
		/*
		 * Creating object whose property is to be checked
		 */
		Display displayObj = new Display();

		/*
		 * Creating class object from the object using getclass method
		 */
		Class<? extends Display> classObj = displayObj.getClass();
		System.out.println("The name of class is " + classObj.getName());

		/*
		 * Getting the constructor of the class through the object of the class
		 */
		Constructor<? extends Display> constructor = classObj.getConstructor();
		System.out.println("The name of constructor is " + constructor.getName());

		System.out.println("\nThe public methods of class are : ");

		/*
		 * Getting methods of the class through the object of the class by using
		 * getMethods
		 */
		Method[] methodArray = classObj.getMethods();

		/*
		 * Printing method names
		 */
		for (Method method : methodArray)
		{
			System.out.println(method.getName());
		}

		/*
		 * Creates object of desired method by providing the method name and
		 * parameter class as arguments to the getDeclaredMethod
		 */
		Method method2Obj = classObj.getDeclaredMethod("method2", int.class);

		/*
		 * invokes the method at runtime
		 */
		method2Obj.invoke(displayObj, 19);

		/*
		 * Creates object of the desired field by providing the name of field as
		 * argument to the getDeclaredField method
		 */
		Field field = classObj.getDeclaredField("str");

		/*
		 * Allows the object to access the field irrespective of the access
		 * specifier used with the field
		 */
		field.setAccessible(true);

		/*
		 * Takes object and the new value to be assigned to the field as
		 * arguments
		 */
		field.set(displayObj, "JAVA");

		/*
		 * Creates object of desired method by providing the method name as
		 * argument to the getDeclaredMethod
		 */
		Method method1Obj = classObj.getDeclaredMethod("method1");

		/*
		 * invokes the method at runtime
		 */
		method1Obj.invoke(displayObj);

		/*
		 * Creates object of the desired method by providing the name of method
		 * as argument to the getDeclaredMethod method
		 */
		Method method3Obj = classObj.getDeclaredMethod("method3");

		/*
		 *  Allows the object to access the method irrespective
		 *  of the access specifier used with the method
		 */
		method3Obj.setAccessible(true);

		/*
		 *  invokes the method at runtime
		 */
		method3Obj.invoke(displayObj);
	}

}