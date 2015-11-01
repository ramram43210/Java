class ArrayDemo1
{
	public static void main(String[] args)
	{
		int[] intArray = new int[5];

		// initialize first element
		intArray[0] = 10;
		// initialize second element
		intArray[1] = 20;
		// and so forth
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;

		int i = 0;
		for (int element : intArray)
		{
			System.out.println("Element at Index " + i + " : " + element);
			++i;
		}
	}
}