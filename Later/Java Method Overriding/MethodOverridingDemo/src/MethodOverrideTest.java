public class MethodOverrideTest
{

	public static void main(String[] args)
	{
		Animal animal = new Lion();
		animal.eat();

		animal = new Cow();
		animal.eat();
	}

}
