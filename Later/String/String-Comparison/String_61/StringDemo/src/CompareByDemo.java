public class CompareByDemo
{

	public static void main(String[] args)
	{
		String s1 = "Peter";
		String s2 = "Peter";
		String s3 = new String("Peter");

		/*
		 * true (because both refer to same instance)
		 */
		System.out.println(s1 == s2);

		/*
		 * false(because s3 refers to instance created in
		 * nonpool)
		 */
		System.out.println(s1 == s3);

	}

}
