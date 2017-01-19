class Animal
{
	@Deprecated
	void eatChicken()
	{
		System.out.println("Eating 2 chicken legs");
	}
}

public class AnnotationsDemo
{
	public static void main(String args[])
	{
		Animal animal=new Animal();  
		animal.eatChicken();
	}
}