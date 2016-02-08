public class StringTest
{

	public static void main(String[] args)
	{

		String s1 = "Welcome";
		String s2 = "Welcome";// will not create new instance  

		System.out.println("s1 hashcode(memory address) = "
				+ s1.hashCode());

		System.out.println("s2 hashcode(memory address) = "
				+ s2.hashCode());

	}

}
