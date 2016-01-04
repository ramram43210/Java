public class Animal
{
	protected void run()
	{
		System.out.println("Animal runs slowly");
	}
}

class Tiger extends Animal
{
	public void run()
	{
		System.out.println("Tiger runs fast.");
	}
}
