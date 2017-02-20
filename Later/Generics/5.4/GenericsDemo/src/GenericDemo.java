public class GenericDemo
{

	public static void main(String[] args)
	{
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(new Integer(100));
		integerBox.inspect(new Integer(200));
		System.out.println("-------------------");
		integerBox.inspect(new Double(20.23));
		System.out.println("-------------------");
		integerBox.inspect(new Long(2000));

		/*
		 * error: this is still String!
		 */
		//integerBox.inspect("some text");

	}

}
