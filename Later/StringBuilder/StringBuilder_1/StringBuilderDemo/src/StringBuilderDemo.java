public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		/*
		 * Constructs a string Builder with no characters in
		 * it and an initial capacity of 16 characters.
		 */
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 = " + sb1);
		System.out.println("sb1 capacity = " + sb1.capacity());

		System.out.println("-----------------------");

		/*
		 * Constructs a string Builder with no characters in
		 * it and the specified initial capacity.
		 */
		StringBuilder sb2 = new StringBuilder(50);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb2 capacity = " + sb2.capacity());

		System.out.println("-----------------------");

		/*
		 * Constructs a string Builder initialized to the
		 * contents of the specified string. The initial
		 * capacity of the string Builder is 16 plus the
		 * length of the string argument.
		 */
		String str = "Hello";
		StringBuilder sb3 = new StringBuilder(str);
		System.out.println("sb3 = " + sb3);
		System.out.println("sb3 capacity = " + sb3.capacity());

		System.out.println("-----------------------");

		/*
		 * Constructs a string Builder that contains the same
		 * characters as the specified CharSequence. The
		 * initial capacity of the string Builder is 16 plus
		 * the length of the CharSequence argument.
		 */
		CharSequence charSequence = new StringBuilder("Welcome");
		StringBuilder sb4 = new StringBuilder(charSequence);
		System.out.println("sb4 = " + sb4);
		System.out.println("sb4 capacity = " + sb4.capacity());

	}
}
