public class PrototypePatternDemo
{

	public static void main(String[] args)
	{

		Dog dog = (Dog) AnimalCache.getAnimal("dog");
		displayAnimalProperty(dog);

		Dog cloneddog1 = (Dog) AnimalCache.getAnimal("dog");
		cloneddog1.setName("Jonnie");
		cloneddog1.setAge(4);
		cloneddog1.setColor("Brown");
		displayAnimalProperty(cloneddog1);

		Dog cloneddog2 = (Dog) AnimalCache.getAnimal("dog");
		cloneddog2.setName("Tony");
		cloneddog2.setAge(5);
		cloneddog2.setColor("Brown");
		displayAnimalProperty(cloneddog2);

		Dog cloneddog3 = (Dog) AnimalCache.getAnimal("dog");
		cloneddog3.setName("Jimmy");
		cloneddog3.setAge(8);
		cloneddog3.setColor("Brown");
		displayAnimalProperty(cloneddog3);

	}

	public static void displayAnimalProperty(Animal animal)
	{
		if (animal instanceof Dog)
		{
			Dog dog = (Dog) animal;
			System.out.println(dog.toString());
			System.out.println("-----------------------------------------------------------------------------------------------------");

		}
	}

}
