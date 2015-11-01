class ArrayDemo
{
	public static void main(String[] args)
	{
		// declares an array of bytes and allocates memory for 2 bytes
		byte[] byteArray = new byte[2];

		System.out.println("Length of the Array : " + byteArray.length);

		// initialize first element
		byteArray[0] = 1;
		// initialize second element
		byteArray[1] = 2;
		// and so forth
		byteArray[2] = 3;
		byteArray[3] = 4;

	}
}