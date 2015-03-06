public class Client
{

		public static void main( String[] args )
		{
				AnimalFactory animalFactory = new AnimalFactory();
				Animal animal = null;
				String speakSound = null;
				animal = animalFactory.getAnimal("dog");
				
				System.out.println("Animal Type : "+animal.getClass().getName());
				
				speakSound = animal.speak();

				System.out.println("dog speak : "+speakSound);
				
				System.out.println();

				animal = animalFactory.getAnimal("duck");
				
				System.out.println("Animal Type : "+animal.getClass().getName());
				
				speakSound = animal.speak();

				System.out.println("duck speak : "+speakSound);
				
				System.out.println();

				animal = animalFactory.getAnimal("lion");
				
				System.out.println("Animal Type : "+animal.getClass().getName());
				
				speakSound = animal.speak();

				System.out.println("lion speak : "+speakSound);

		}

}
