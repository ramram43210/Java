public class WrapperToPrimitiveExample
{

	public static void main(String[] args)
	{
		/*
		 * Wrapper to Primitive
		 * 
		 * Converting Integer to int
		 */
		Integer integerObj = new Integer(3);
		System.out.println("integerObj = " + integerObj);

		/*
		 * converting Integer to int
		 */
		int i = integerObj.intValue();
		System.out.println("i = " + i);

		/*
		 * Unboxing, now compiler will write a.intValue()
		 * internally
		 */
		int j = integerObj;

		System.out.println("j = " + j);

	}

}
