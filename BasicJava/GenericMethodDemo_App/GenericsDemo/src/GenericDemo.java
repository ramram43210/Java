/*
 * Like generic class, we can create generic method that can accept any type
 * of argument. 
 * 
 * Let’s see a simple example of java generic method to print
 * array elements. We are using here E to denote the element.
 */
public class GenericDemo
{
	public static void main(String[] args)
	{
		Integer[] intArray =
		{ 100, 200, 300, 400, 500 };
		
		System.out.println("Printing Integer Array");
		printArray(intArray);

		Character[] charArray =
		{ 'J', 'A', 'V', 'A' };

		System.out.println("Printing Character Array");
		printArray(charArray);
	}

	public static <E> void printArray(E[] elements)
	{
		for (E element : elements)
		{
			System.out.println(element);
		}
		System.out.println();
	}
}