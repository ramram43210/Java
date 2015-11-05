class AssignmentOperatorDemo6
{
	public static void main(String[] args)
	{

		int a = 5;
		int b = 2;

		/*
		 * calculate modulus using two operands and assign the result to left
		 * operand.
		 * 
		 * a%=b is same as a=a%b
		 */
		a %= b;

		System.out.println("a = " + a);

	}
}