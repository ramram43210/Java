class ArrayDemo
{
	public static void main(String[] args)
	{
		/*
		 * Declares an array of doubles and allocates memory for 5 doubles.
		 */
		double[] doubleArray = new double[5];

		int i = 0;
		for (double element : doubleArray)
		{
			System.out.println("Element at Index " + i + " : " + element);
			++i;
		}
	}
}