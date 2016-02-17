public class WrapperClassTest
{

	public static void main(String[] args)
	{
		Integer integerObj = new Integer(10);

		byte byteValue = integerObj.byteValue();
		System.out.println("byteValue = " + byteValue);

		short shortValue = integerObj.shortValue();
		System.out.println("shortValue = " + shortValue);

		int intValue = integerObj.intValue();
		System.out.println("intValue = " + intValue);

		long longValue = integerObj.longValue();
		System.out.println("longValue = " + longValue);

		float floatValue = integerObj.floatValue();
		System.out.println("floatValue = " + floatValue);

		double doubleValue = integerObj.doubleValue();
		System.out.println("doubleValue = " + doubleValue);
	}

}
