class ArrayDemo
{
	public static void main(String[] args)
	{
		// declares an array of longs and allocates memory for 10 longs
		long[] longArray = new long[10];

		// initialize first element
		longArray[0] = 10000L;
		// initialize second element
		longArray[1] = 30000L;
		// and so forth
		longArray[2] = 35000L;
		longArray[3] = 40000L;
		longArray[4] = 45000L;
		longArray[5] = 42000L;
		longArray[6] = 50000L;
		longArray[7] = 60000L;
		longArray[8] = 90000L;
		longArray[9] = 80000L;

		System.out.println("Element at index 0: " + longArray[0]);
		System.out.println("Element at index 1: " + longArray[1]);
		System.out.println("Element at index 2: " + longArray[2]);
		System.out.println("Element at index 3: " + longArray[3]);
		System.out.println("Element at index 4: " + longArray[4]);
		System.out.println("Element at index 5: " + longArray[5]);
		System.out.println("Element at index 6: " + longArray[6]);
		System.out.println("Element at index 7: " + longArray[7]);
		System.out.println("Element at index 8: " + longArray[8]);
		System.out.println("Element at index 9: " + longArray[9]);

	}
}