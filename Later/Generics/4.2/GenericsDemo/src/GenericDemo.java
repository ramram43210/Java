public class GenericDemo
{

	public static void main(String[] args)
	{
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(new Integer(100));
		//integerBox.set("Ram"); //Compile time error
		Integer integerValue = integerBox.get();
		System.out.println("integerValue = "+integerValue);

		Box<String> stringBox = new Box<String>();
		stringBox.set("Peter");
		String strValue = stringBox.get();
		System.out.println("strValue = "+strValue);
		
	}

}
