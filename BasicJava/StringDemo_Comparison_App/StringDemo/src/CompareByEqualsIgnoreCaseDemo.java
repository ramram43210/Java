public class CompareByEqualsIgnoreCaseDemo
{

	public static void main(String[] args)
	{
		String s1 = "peter";
		String s2 = "PETER";

		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equalsIgnoreCase(s2));// true

	}

}
