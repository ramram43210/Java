class AssignmentOperatorDemo3
{
	public static void main(String[] args)
	{

		int a = 5;
		int b = 2;

		/*
		 * subtracts right operand from the left operand and assign the result
		 * to left operand.
		 * 
		 * a-=b is same as a=a-b
		 */
		a -= b;

		System.out.println("a = " + a);

	}
}