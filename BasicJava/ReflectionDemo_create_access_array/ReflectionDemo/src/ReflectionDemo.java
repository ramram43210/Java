import java.lang.reflect.Array;

/**
 * Creating Array and Accessing Array.
 * 
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		/*
		 * Creating arrays via Java Reflection is done using the
		 * java.lang.reflect.Array class
		 * 
		 * This code sample creates an array of int. The first parameter
		 * int.class given to the Array.newInstance() method tells what type
		 * each element in the array should be of. The second parameter states
		 * how many elements the array should have space for.
		 */
		int[] intArray = (int[]) Array.newInstance(int.class, 3);

		/*
		 * It is possible to access the elements of an array using Java
		 * Reflection. This is done via the Array.get(...) and Array.set(...)
		 * methods.
		 */
		Array.set(intArray, 0, 10);
		Array.set(intArray, 1, 20);
		Array.set(intArray, 2, 30);

		System.out.println("intArray[0] = " + Array.get(intArray, 0));
		System.out.println("intArray[1] = " + Array.get(intArray, 1));
		System.out.println("intArray[2] = " + Array.get(intArray, 2));

	}

}