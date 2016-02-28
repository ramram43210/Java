public class StringTest
{

	public static void main(String[] args)
	{
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = "Dog";
		String s4 = new String("Cat");

		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1 == s3 : " + (s1 == s4));
	}

}
