public class StringBufferDemo
{

	public static void main(String[] args)
	{
		/*
		 * Constructs a string buffer with no characters in
		 * it and an initial capacity of 16 characters.
		 */
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1 = " + sb1);
		System.out.println("sb1 capacity = " + sb1.capacity());

		System.out.println("-----------------------");

		/*
		 * Constructs a string buffer with no characters in
		 * it and the specified initial capacity.
		 */
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb2 capacity = " + sb2.capacity());

		System.out.println("-----------------------");

		/*
		 * Constructs a string buffer initialized to the
		 * contents of the specified string. The initial
		 * capacity of the string buffer is 16 plus the
		 * length of the string argument.
		 */
		String str = "Hello";
		StringBuffer sb3 = new StringBuffer(str);
		System.out.println("sb3 = " + sb3);
		System.out.println("sb3 capacity = " + sb3.capacity());

		System.out.println("-----------------------");

		/*
		 * Constructs a string buffer that contains the same
		 * characters as the specified CharSequence. The
		 * initial capacity of the string buffer is 16 plus
		 * the length of the CharSequence argument.
		 */
		CharSequence charSequence = new StringBuffer("Welcome");
		StringBuffer sb4 = new StringBuffer(charSequence);
		System.out.println("sb4 = " + sb4);
		System.out.println("sb4 capacity = " + sb4.capacity());

	}
}
