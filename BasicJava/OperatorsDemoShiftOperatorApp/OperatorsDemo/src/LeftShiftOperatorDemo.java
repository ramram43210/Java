class LeftShiftOperatorDemo
{
	public static void main(String[] args)
	{

		// 00110011
		int a = 51;
		System.out.println("binary of 'a'                       :   "
				+ Integer.toBinaryString(a) + "\n");

		int b = 2;

		// 11001100
		int value = a << b;

		System.out.println("binary of 'value' after Left shift  : "
				+ Integer.toBinaryString(value));
		System.out.println("value : " + value);

		System.out.println("-----------------------------------");

	}

}