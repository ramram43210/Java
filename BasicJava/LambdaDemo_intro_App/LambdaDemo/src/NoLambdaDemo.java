
public class NoLambdaDemo
{

	public static void main(String[] args)
	{

		/*
		 * Without lambda, Dog implementation using anonymous class
		 */
		Dog dog = new Dog()
		{
			@Override
			public void eat()
			{
				System.out.println("eating chicken");
			}
		};
		dog.eat();
	}

}
