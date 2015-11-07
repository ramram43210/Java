class PrecedenceOfOperator
{
	public static void main(String[] args)
	{

		/*
		 * Here x is assigned 13, not 20 because operator * has higher
		 * precedence than +, so it first gets multiplied with 3*2 and then adds
		 * into 7.
		 */
		int x = 7 + 3 * 2;

		System.out.println("x : " + x);

		/*
		 * Here is () is higher precedence than * so first 7+3=10 calculation
		 * will be done, then 10 will be multiplied by 2 and the result is 20
		 */

		int y = (7 + 3) * 2;

		System.out.println("y : " + y);

	}
}