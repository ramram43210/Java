class ArrayDemo
{
	public static void main(String[] args)
	{
		int[][] intArray = new int[2][3];

		intArray[0][0] = 10;
		intArray[0][1] = 20;
		intArray[0][2] = 30;

		intArray[1][0] = 100;
		intArray[1][1] = 200;
		intArray[1][2] = 300;

		System.out.println("Element at intArray[0][0] : " + intArray[0][0]);
		System.out.println("Element at intArray[0][1] : " + intArray[0][1]);
		System.out.println("Element at intArray[0][2] : " + intArray[0][2]);

		System.out.println();

		System.out.println("Element at intArray[1][0] : " + intArray[1][0]);
		System.out.println("Element at intArray[1][1] : " + intArray[1][1]);
		System.out.println("Element at intArray[1][2] : " + intArray[1][2]);

	}
}