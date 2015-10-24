class ArrayLoopDemo
{
	public static void main(String[] args)
	{
		// declares an array of integers
		int[] anArray;

		// allocates memory for 10 integers
		anArray = new int[10];

		// initialize first element
		anArray[0] = 300;
		// initialize second element
		anArray[1] = 600;
		// and so forth
		anArray[2] = 900;
		anArray[3] = 150;
		anArray[4] = 4500;
		anArray[5] = 5000;
		anArray[6] = 3000;
		anArray[7] = 1000;
		anArray[8] = 8000;
		anArray[9] = 2000;

		System.out.println("Getting each element from the array using foreach loop:\n");
		int i=0;
		for (int element : anArray)
		{
			System.out.println("Element at Index "+ i + " : "+element);
			++i;
		}
	}
}