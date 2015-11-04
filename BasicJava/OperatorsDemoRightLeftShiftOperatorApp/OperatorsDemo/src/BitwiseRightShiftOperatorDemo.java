public class BitwiseRightShiftOperatorDemo
{
	public static void main(String[] args)
	{

		int a = 172; // 10101100
		
		System.out.println("binary of 'a'                        : "
				+ Integer.toBinaryString(a) + "\n");

		/*
		 * Number of bits needs to be moved to right.
		 */
		int b = 1;

		/*
		 * The left operand value is moved right by the number of bits
		 * specified by the right operand.
		 */
		int value = a >> b; // 01010110

		System.out.println("binary of 'value' after Right shift  :  "
				+ Integer.toBinaryString(value));
		System.out.println("value: " + value);

	}
}
