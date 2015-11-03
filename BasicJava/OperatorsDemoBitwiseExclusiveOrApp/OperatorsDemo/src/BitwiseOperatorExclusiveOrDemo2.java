class BitwiseOperatorExclusiveOrDemo2
{
	public static void main(String[] args)
	{

		boolean value = false ^ false;
		System.out.println("false ^ false = " + value);

		value = false ^ true;
		System.out.println("false ^ true  = " + value);

		value = true ^ false;
		System.out.println("true  ^ false = " + value);

		value = true ^ true;
		System.out.println("true  ^ true  = " + value);

	}

}