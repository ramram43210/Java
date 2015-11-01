class UnaryOperatorDemo
{

	public static void main(String[] args)
	{

		int unaryPlusValue = +1;
		System.out.println("unaryPlusValue : " + unaryPlusValue);

		int k = 90;

		int unaryMinusValue = -k;

		System.out.println("unaryMinusValue : " + unaryMinusValue);

		int i = 1;

		System.out.println("Before incrementing, value of i : " + i);

		i++;

		System.out.println("After incrementing, value of i : : " + i);

		int j = 6;

		System.out.println("Before decrementing, value of j : " + j);

		j--;

		System.out.println("After decrementing, value of j : " + j);

		boolean success = false;
		// false
		System.out.println(success);
		// true
		System.out.println(!success);

	}
}