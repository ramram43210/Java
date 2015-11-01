/*
 * We can pass the java array to method so that we can reuse the same logic on any array.
 */

class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] intArray1 = new int[5];// declaration and instantiation

		intArray1[0] = 110;// initialization
		intArray1[1] = 220;
		intArray1[2] = 750;
		intArray1[3] = 130;
		intArray1[4] = 150;

		System.out.print("Max value in intArray1 :");
		max(intArray1);
		
		
		int[] intArray2 = new int[3];// declaration and instantiation

		intArray2[0] = 45;// initialization
		intArray2[1] = 50;
		intArray2[2] = 10;
		
		System.out.print("Max value in intArray2 :");
		max(intArray2);
		
	}

	private static void max(int[] intArray)
	{
		int max = intArray[0];
		for (int i = 0; i < intArray.length; i++)
		{
			if (max < intArray[i])
			{
				max = intArray[i];
			}
		}
		System.out.println(max);
	}

}