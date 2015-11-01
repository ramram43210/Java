public class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[] intArray =
		{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		int i = 0;
		for (int element : intArray)
		{
			System.out.println("Element at Index " + i + " : " + element);
			++i;
		}

	}
}
