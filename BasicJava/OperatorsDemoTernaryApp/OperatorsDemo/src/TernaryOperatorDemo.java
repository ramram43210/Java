class TernaryOperatorDemo
{
	public static void main(String[] args)
	{
		int value1 = 10;
		int value2 = 20;
		int result;

		boolean flag = true;

		/*
		 * If flag is true, assign the value of value1 to result.
		 * Otherwise, assign the value of value2 to result.
		 */

		result = flag ? value1 : value2;

		System.out.println("flag is true  : " + result);

		flag = false;

		/*
		 * If flag is true, assign the value of value1 to result.
		 * Otherwise, assign the value of value2 to result.
		 */

		result = flag ? value1 : value2;

		System.out.println("flag is false : " + result);
	}

}