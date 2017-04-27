/*
 * Code to use the generic class.
 */
public class GenericDemo
{
	public static void main(String[] args)
	{
		useInteger();  
		useString();
	}

	private static void useInteger()
	{
		MyGeneric<Integer> myGeneric=new MyGeneric<Integer>();  
		myGeneric.add(2);  
		//myGeneric.add("peter");//Compile time error  
		System.out.println(myGeneric.get());
	}
	
	private static void useString()
	{
		MyGeneric<String> myGeneric=new MyGeneric<String>();  
		myGeneric.add("Ram");  
		System.out.println(myGeneric.get());
	}
}