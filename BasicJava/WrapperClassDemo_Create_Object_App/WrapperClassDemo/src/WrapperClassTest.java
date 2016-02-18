public class WrapperClassTest
{

	public static void main(String[] args)
	{

		Integer integerObj1 = new Integer(80);
		System.out.println("integerObj1 = " + integerObj1);

		Integer integerObj2 = new Integer("100");
		System.out.println("integerObj2 = " + integerObj2);

		Double doubleObj1 = new Double(10.99);
		System.out.println("doubleObj1 = " + doubleObj1);

		Double doubleObj2 = new Double("98.55");
		System.out.println("doubleObj2 = " + doubleObj2);

	}
}
