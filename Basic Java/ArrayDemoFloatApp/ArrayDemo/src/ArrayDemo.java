class ArrayDemo
{
	public static void main(String[] args)
	{
		// declares an array of floats
		float[] floatArray;

		// allocates memory for 10 floats
		floatArray = new float[10];

		// initialize first element
		floatArray[0] = 11.1f;
		// initialize second element
		floatArray[1] = 11.2f;
		// and so forth
		floatArray[2] = 11.3f;
		floatArray[3] = 12.1f;
		floatArray[4] = 12.2f;
		floatArray[5] = 12.3f;
		floatArray[6] = 13.1f;
		floatArray[7] = 13.2f;
		floatArray[8] = 13.3f;
		floatArray[9] = 14.1f;

		System.out.println("Element at index 0: " + floatArray[0]);
		System.out.println("Element at index 1: " + floatArray[1]);
		System.out.println("Element at index 2: " + floatArray[2]);
		System.out.println("Element at index 3: " + floatArray[3]);
		System.out.println("Element at index 4: " + floatArray[4]);
		System.out.println("Element at index 5: " + floatArray[5]);
		System.out.println("Element at index 6: " + floatArray[6]);
		System.out.println("Element at index 7: " + floatArray[7]);
		System.out.println("Element at index 8: " + floatArray[8]);
		System.out.println("Element at index 9: " + floatArray[9]);

	}
}