public class CompareByEqualsDemo
{

	public static void main(String[] args)
	{
		String s1 = "Peter";
		String s2 = "Peter";
		String s3 = new String("Peter");
		String s4 = "Dave";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
	}

}