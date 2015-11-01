class ArrayLoopDemo
{
	public static void main(String[] args)
	{
		// declares an array of doubles
		double[] doubleArray;

		// allocates memory for 10 doubles
		doubleArray = new double[10];

		// initialize first element
		doubleArray[0] = 10.2;
		// initialize second element
		doubleArray[1] = 20.3;
		// and so forth
		doubleArray[2] = 30.8;
		doubleArray[3] = 50.8;
		doubleArray[4] = 90.9;
		doubleArray[5] = 100.8;
		doubleArray[6] = 23.5;
		doubleArray[7] = 99.9;
		doubleArray[8] = 88.4;
		doubleArray[9] = 97.8;

		System.out
				.println("-------------------------------------------------------");
		System.out
				.println("Using for each loop get all elements from doubleArray");
		System.out
				.println("-------------------------------------------------------");

		int i = 0;
		for (double element : doubleArray)
		{
			System.out.println("Element at Index " + i + " : " + element);
			++i;
		}
	}
}