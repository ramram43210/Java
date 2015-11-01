class ArrayDemo
{
	public static void main(String[] args)
	{
		// declares an intArray and allocates memory for 2 int values
		int[] intArray = new int[2];

		int i=0;
		for (int element : intArray)
		{
			System.out.println("Element at Index "+ i + " : "+element);
			++i;
		}
	}
}