class BitwiseLeftShiftOperatorDemo
{
	public static void main(String[] args)
	{

		int a = 52; // 00110100

		System.out.println("binary of 'a'                       :   "
				+ Integer.toBinaryString(a) + "\n");

		/*
		 * Number of bits needs to be moved to left.
		 */
		int b = 2;

		/*
		 * The left operands value is moved left by the number of bits specified
		 * by the right operand.
		 */
		int value = a << b; // 11010000

		System.out.println("binary of 'value' after Left shift  : "
				+ Integer.toBinaryString(value));
		System.out.println("value : " + value);

	}
}