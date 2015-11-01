public class PersonDemo
{
	public static void main(String[] args)
	{

		Person jackieChan = new Person();
		/*
		 * Setting Attributes/Properties/Characteristics.
		 */
		jackieChan.name = "Jackie Chan";
		jackieChan.age =53;
		jackieChan.sex = "Male";
		jackieChan.height = "5’.9’'";
		jackieChan.weight = "52 Kg";

		System.out.println("Attributes");
		System.out.println("--------------");
		
		displayPersonInformation(jackieChan);
		
		System.out.println("\nBehaviors");
		System.out.println("----------");
		
		jackieChan.eat("Can eat only Chinese food");
		jackieChan.fight("Can do Martial art or Kung Fu Fight");
		
		System.out.println("*********************************************");
		
		
		Person angelinaJolie  = new Person();
		/*
		 * Setting Attributes/Properties/Characteristics.
		 */
		angelinaJolie.name = "Angelina Jolie";
		angelinaJolie.age =45;
		angelinaJolie.sex = "FeMale";
		angelinaJolie.height = "6’.2’'";
		angelinaJolie.weight = "45 Kg";

		System.out.println("Attributes");
		System.out.println("--------------");
		
		displayPersonInformation(angelinaJolie);
		
		System.out.println("\nBehaviors");
		System.out.println("----------");
		
		angelinaJolie.eat("Can eat only American food");
		angelinaJolie.fight("Can do karate fight");
		
		System.out.println("*********************************************");
		
	
	}

	public static void displayPersonInformation(Person person)
	{
		System.out.println("Name : "+ person.name);
		System.out.println("Age : "+person.age);
		System.out.println("sex : "+person.sex);
		System.out.println("Height : "+person.height);
		System.out.println("Weight : "+person.weight);
	}
}
