public class CompareByCompareToDemo
{

	public static void main(String[] args)
	{
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		
		System.out.println(s1.compareTo(s2));// 0

		/*
		 * 1(because s1>s3)
		 */
		System.out.println(s1.compareTo(s3));
		/*
		 * -1(because s3 < s1 )
		 */
		System.out.println(s3.compareTo(s1));

	}

}
