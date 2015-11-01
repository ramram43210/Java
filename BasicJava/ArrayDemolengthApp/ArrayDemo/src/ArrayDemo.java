class ArrayDemo
{
	public static void main(String[] args)
	{
		// declares an array of shorts
		short[] shortArray;

		// allocates memory for 7 shorts
		shortArray = new short[7];

		System.out.println("Length of the Array : " + shortArray.length);

		// initialize first element
		shortArray[0] = 300;
		// initialize second element
		shortArray[1] = 600;
		// and so forth
		shortArray[2] = 900;
		shortArray[3] = 150;
		shortArray[4] = 4500;
		shortArray[5] = 5000;
		shortArray[6] = 3000;

		System.out.println("Length of the Array : " + shortArray.length);

	}
}