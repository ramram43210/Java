import java.util.Arrays;
import java.util.List;

public class LambdaDemo
{
	public static void main(String[] args)
	{

		List<Person> personList = Arrays.asList(new Person("Carla", 33),
				new Person("Balu", 32), new Person("Bharth", 40),
				new Person("Ajay", 31));

		personList.stream().filter(person -> person.getName().startsWith("B"))
				.forEach(person -> System.out.println(person));
	}

}
