class ConditionalAndOperatorDemo
{
	public static void main(String[] args)
	{
		int value1 = 1;
		int value2 = 2;

		/*
		 * true && true is true
		 * 
		 * 1 && 1 is 1
		 */
		System.out.println((value1 == 1) && (value2 == 2));

		/*
		 * true && false is false
		 * 
		 * 1 && 0 is 0
		 */
		System.out.println((value1 == 1) && (value2 == 90));

		/*
		 * false && true is false
		 * 
		 * 0 && 1 is 0
		 */
		System.out.println((value1 == 20) && (value2 == 2));

		/*
		 * false && false is false
		 * 
		 * 0 && 0 is 0
		 */
		System.out.println((value1 == 100) && (value2 == 90));

	}
}