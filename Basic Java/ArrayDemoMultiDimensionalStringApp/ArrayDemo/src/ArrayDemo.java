class ArrayDemo
{
	public static void main(String[] args)
	{

		String[][] strArray = new String[3][2];
		
		strArray[0][0] = "Ram";
		strArray[0][1] = "Peter";

		strArray[1][0] = "Apple";
		strArray[1][1] = "Ball";

		strArray[2][0] = "Bike";
		strArray[2][1] = "Car";
		
		System.out.println("Element at strArray[0][0] : " + strArray[0][0]);
		System.out.println("Element at strArray[0][1] : " + strArray[0][1]);

		System.out.println();

		System.out.println("Element at strArray[1][0] : " + strArray[1][0]);
		System.out.println("Element at strArray[1][1] : " + strArray[1][1]);

		System.out.println();

		System.out.println("Element at strArray[2][0] : " + strArray[2][0]);
		System.out.println("Element at strArray[2][1] : " + strArray[2][1]);

	}
}