class RightShiftOperatorDemo
{
	public static void main(String[] args)
	{

		// 11001100
		int a = 204;
		System.out.println("binary of 'a'                        : "
				+ Integer.toBinaryString(a) + "\n");

		int b = 2;

		// 00110011
		int value = a >> b;

		System.out.println("binary of 'value' after Right shift  :   "
				+ Integer.toBinaryString(value));
		System.out.println("value: " + value);

	}

}