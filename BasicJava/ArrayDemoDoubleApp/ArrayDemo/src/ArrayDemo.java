class ArrayDemo
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

		System.out.println("Element at index 0: " + doubleArray[0]);
		System.out.println("Element at index 1: " + doubleArray[1]);
		System.out.println("Element at index 2: " + doubleArray[2]);
		System.out.println("Element at index 3: " + doubleArray[3]);
		System.out.println("Element at index 4: " + doubleArray[4]);
		System.out.println("Element at index 5: " + doubleArray[5]);
		System.out.println("Element at index 6: " + doubleArray[6]);
		System.out.println("Element at index 7: " + doubleArray[7]);
		System.out.println("Element at index 8: " + doubleArray[8]);
		System.out.println("Element at index 9: " + doubleArray[9]);

	}
}