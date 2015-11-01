class ConditionalOrOperatorDemo
{
	public static void main(String[] args)
	{
		int value1 = 1;
		int value2 = 2;

		/*
		 * true || true is true
		 * 
		 * 1 || 1 is 1
		 */
		
		boolean value = (value1 == 1) || (value2 == 2);
		System.out.println(value);

		/*
		 * true || false is true
		 * 
		 * 1 || 0 is 1
		 */
		
		value = (value1 == 1) || (value2 == 90);
		
		System.out.println(value);

		/*
		 * false || true is true
		 * 
		 * 0 || 1 is 1
		 */
		value = (value1 == 20) || (value2 == 2);
		System.out.println(value);

		/*
		 * false || false is false
		 * 
		 * 0 || 0 is 0
		 */
		value = (value1 == 100) || (value2 == 90);
		System.out.println(value);

	}
}