class BitwiseUnsignedRightShiftOperatorDemo
{
	public static void main(String[] args)
	{
		
		int a = 240; // 11110000
		
		System.out.println("binary of 'a'            :"
				+ Integer.toBinaryString(a) + "\n");


		/*
		 * Number of bits needs to be moved to Right.
		 */
		int b = 2; 

		/*
		 * The left operand value is moved right by the number of bits specified
		 * by the right operand and shifted values are filled up with zeros.
		 */		
		int value = a >>> b; // 00111100
		
		System.out.println("binary of 'value' after\n unsigned right shift  :    "
				+ Integer.toBinaryString(value));

		System.out.println("Value : " + value);

	}
}