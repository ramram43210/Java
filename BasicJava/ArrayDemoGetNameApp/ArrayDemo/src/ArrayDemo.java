/*
 * In java, array is an object. For array object, an proxy class is created 
 * whose name can be obtained by getClass().getName() method on the object.
 */

class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] intArray = new int[5];// declaration and instantiation

		intArray[0] = 110;// initialization
		intArray[1] = 220;
		intArray[2] = 750;

		Class<? extends int[]> classObject = intArray.getClass();
		String name = classObject.getName();

		System.out.println("name : " + name);

	}

}