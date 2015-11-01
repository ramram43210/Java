class ArrayLoopDemo
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

		System.out
				.println("Using for loop getting each element "
						+ "from the longArray\n");

		/*
		 * Using For loop get all elements from longArray
		 */
		for (int i = 0; i < longArray.length; i++)
		{
			long longValue = longArray[i];
			System.out.println("Element at index " + i + " : " + longValue);

		}
	}
}