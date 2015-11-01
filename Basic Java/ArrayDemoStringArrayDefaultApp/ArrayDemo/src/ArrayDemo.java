class ArrayDemo
{
	public static void main(String[] args)
	{
		/*
		 * Declares an array of strings and allocates memory for 2 strings.
		 */
		String[] stringArray = new String[2];

		int i = 0;
		for (String element : stringArray)
		{
			System.out.println("Element at Index " + i + " : " + element);
			++i;
		}
	}
}