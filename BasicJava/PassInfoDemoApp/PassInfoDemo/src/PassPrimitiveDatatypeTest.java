public class PassPrimitiveDatatypeTest
{

	public static void main(String[] args)
	{

		int x = 3;

		changeIt(x);

		System.out.println("x value inside main method : " + x);

	}

	/*
	 * Passing Primitive Data Type Arguments :
	 * 
	 * Primitive arguments, such as an int or a double, are passed into methods
	 * by value. This means that any changes to the values of the parameters
	 * exist only within the scope of the method. When the method returns, the
	 * parameters are gone and any changes to them are lost.
	 */

	public static void changeIt(int x)
	{
		x = 50;
		System.out.println("x value inside changeIt method : " + x);
		return;
	}

}
