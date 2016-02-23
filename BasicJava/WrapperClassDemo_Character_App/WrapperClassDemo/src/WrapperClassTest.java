public class WrapperClassTest
{

	public static void main(String[] args)
	{
		char ch = 'a';
		System.out.println("ch = " + ch);

		Character characterObj = new Character(ch);
		System.out.println("characterObj = " + characterObj);

		/*
		 * If you pass a primitive char into a method that
		 * expects an object, the compiler automatically
		 * converts the char to a Character for you.This
		 * feature is called autoboxing.
		 */
		displayCharObj('c');

		/*
		 * If you pass an object into a method that expects
		 * an primitive char, the compiler automatically
		 * converts the Character to a char for you.This
		 * feature is called unboxing.
		 */

		displayChar(new Character('z'));

	}

	public static void displayCharObj(Character characterObjParam)
	{
		System.out
				.println("characterObjParam = " + characterObjParam);
	}

	public static void displayChar(char chParam)
	{
		System.out.println("chParam = " + chParam);
	}
}
