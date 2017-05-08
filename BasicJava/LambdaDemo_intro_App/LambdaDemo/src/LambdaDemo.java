public class LambdaDemo
{

	public static void main(String[] args)
	{

		/*
		 * With lambda
		 */
		Dog dog = () ->
		{
			System.out.println("eating chicken");
		};

		dog.eat();

	}

}
