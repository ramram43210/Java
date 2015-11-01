class ArrayDemo
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

		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 3: " + anArray[3]);
		System.out.println("Element at index 4: " + anArray[4]);
		System.out.println("Element at index 5: " + anArray[5]);
		System.out.println("Element at index 6: " + anArray[6]);
		System.out.println("Element at index 7: " + anArray[7]);
		System.out.println("Element at index 8: " + anArray[8]);
		System.out.println("Element at index 9: " + anArray[9]);
	}
}