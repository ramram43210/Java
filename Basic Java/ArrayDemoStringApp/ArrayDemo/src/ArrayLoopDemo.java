class ArrayLoopDemo
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
		
		System.out.println("Using For-each loop getting each element from the String Array\n");

		/*
		 * Using For-each loop get all elements from strArray
		 */
		int i=0;
		for (String value : strArray)
		{
			System.out.println("Element at index " +i+" : "+ value);
			++i;
		}
	}
}