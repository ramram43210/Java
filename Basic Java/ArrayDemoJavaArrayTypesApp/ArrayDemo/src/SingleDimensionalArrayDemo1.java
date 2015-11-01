class SingleDimensionalArrayDemo1
{
	public static void main(String[] args)
	{
		int[] intArray = new int[5];// declaration and instantiation

		intArray[0] = 110;// initialization
		intArray[1] = 220;
		intArray[2] = 750;
		intArray[3] = 130;
		intArray[4] = 150;

		for (int i = 0; i < intArray.length; i++)
		{
			System.out.println("Element at index position " + i + " : " + intArray[i]);
		}
	}

}