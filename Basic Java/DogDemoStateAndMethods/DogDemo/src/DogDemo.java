public class DogDemo
{
	public static void main(String[] args)
	{

		Dog jimmyDog = new Dog();
		jimmyDog.setName("Jimmy");
		jimmyDog.setColor("Brown");
		jimmyDog.setHeight("18 Inches");
		jimmyDog.setLength("36 Inches");
		jimmyDog.setWeight("30 Pounds");

		System.out.println("Properties");
		System.out.println("----------");
		
		displayDogInformation(jimmyDog);
		
		System.out.println("\nBehaviors");
		System.out.println("----------");
		
		jimmyDog.sit("Sit fast");
		jimmyDog.layDown("Laydown fast");
		jimmyDog.shake("Shake fast with one leg");
		jimmyDog.walk("Walk fast");

		System.out.println("*********************************************");
		
		Dog tommyDog = new Dog();
		tommyDog.setName("Tommy");
		tommyDog.setColor("white");
		tommyDog.setHeight("28 Inches");
		tommyDog.setLength("46 Inches");
		tommyDog.setWeight("40 Pounds");

		System.out.println("Properties");
		System.out.println("----------");
		
		displayDogInformation(tommyDog);
		
		System.out.println("\nBehaviors");
		System.out.println("----------");
		
		tommyDog.sit("Sit slowly");
		tommyDog.layDown("Laydown slowly");
		tommyDog.shake("Shake slowly with two legs");
		tommyDog.walk("Walk slowly");

	}

	public static void displayDogInformation(Dog dog)
	{
		System.out.println("Name : "+ dog.getName());
		System.out.println("Color : "+dog.getColor());
		System.out.println("Height : "+dog.getHeight());
		System.out.println("Length : "+dog.getLength());
		System.out.println("Weight : "+dog.getWeight());
	}
}
