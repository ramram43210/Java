public class BirdDemo
{
	public static void main(String[] args)
	{

		Bird sparrowBird = new Bird();
		sparrowBird.setName("Sparrow");
		sparrowBird.setColor("Brown");
		sparrowBird.setCanSwim("No");
		sparrowBird.setAvgLifeTime("3y");
		sparrowBird.setWeight("0.024kg");

		System.out.println("Characteristics");
		System.out.println("--------------");
		
		displayBirdInformation(sparrowBird);
		
		System.out.println("\nBehaviors");
		System.out.println("----------");
		
		sparrowBird.fly("Can fly 46km/h");
		sparrowBird.walk("Can walk 1km/h");
		
		System.out.println("*********************************************");
		
		Bird penguinBird = new Bird();
		penguinBird.setName("Penguin");
		penguinBird.setColor("White and Black");
		penguinBird.setCanSwim("Yes");
		penguinBird.setAvgLifeTime("20y");
		penguinBird.setWeight("15kg");

		System.out.println("Characteristics");
		System.out.println("-------------");
		
		displayBirdInformation(penguinBird);
		
		System.out.println("\nBehaviors");
		System.out.println("----------");
		
		penguinBird.fly("Cannot fly");
		penguinBird.walk("Can walk 3 to 4 km/h");

	}

	public static void displayBirdInformation(Bird bird)
	{
		System.out.println("Name : "+ bird.getName());
		System.out.println("Color : "+bird.getColor());
		System.out.println("Can Swim : "+bird.getCanSwim());
		System.out.println("Avg Life time : "+bird.getAvgLifeTime());
		System.out.println("Weight : "+bird.getWeight());
	}
}
