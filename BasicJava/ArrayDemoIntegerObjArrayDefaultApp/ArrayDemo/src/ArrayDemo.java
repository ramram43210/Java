class ArrayDemo
{
	public static void main(String[] args)
	{
		/*
		 * Declares an array of Integer Objects and allocates memory for 3 Integer Objects.
		 */
		Integer[] integerObjectArray = new Integer[3];

		int i = 0;
		for (Integer element : integerObjectArray)
		{
			System.out.println("Element at Index " + i + " : " + element);
			++i;
		}
	}
}