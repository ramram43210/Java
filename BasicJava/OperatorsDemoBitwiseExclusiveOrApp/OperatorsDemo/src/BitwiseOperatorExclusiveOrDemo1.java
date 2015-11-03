class BitwiseOperatorExclusiveOrDemo1
{
	public static void main(String[] args)
	{

		int value = 0 ^ 0;
		System.out.println("0 ^ 0 = " + value);

		value = 0 ^ 1;
		System.out.println("0 ^ 1 = " + value);

		value = 1 ^ 0;
		System.out.println("1 ^ 0 = " + value);

		value = 1 ^ 1;
		System.out.println("1 ^ 1 = " + value);

	}

}