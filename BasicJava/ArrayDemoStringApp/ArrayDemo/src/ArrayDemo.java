class ArrayDemo
{
	public static void main(String[] args)
	{
		// declares an array of Strings and allocates memory for 10 Strings
		String[] strArray = new String[10];

		// initialize first element
		strArray[0] = "Apple";
		// initialize second element
		strArray[1] = "Ball";
		// and so forth
		strArray[2] = "Car";
		strArray[3] = "Dog";
		strArray[4] = "Eagle";
		strArray[5] = "Fox";
		strArray[6] = "Girl";
		strArray[7] = "Horse";
		strArray[8] = "Ink";
		strArray[9] = "Jack";

		System.out.println("Element at index 0: " + strArray[0]);
		System.out.println("Element at index 1: " + strArray[1]);
		System.out.println("Element at index 2: " + strArray[2]);
		System.out.println("Element at index 3: " + strArray[3]);
		System.out.println("Element at index 4: " + strArray[4]);
		System.out.println("Element at index 5: " + strArray[5]);
		System.out.println("Element at index 6: " + strArray[6]);
		System.out.println("Element at index 7: " + strArray[7]);
		System.out.println("Element at index 8: " + strArray[8]);
		System.out.println("Element at index 9: " + strArray[9]);

	}
}