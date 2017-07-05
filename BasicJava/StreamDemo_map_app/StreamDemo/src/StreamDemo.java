import java.util.Arrays;
import java.util.List;

/**
 * 
 * How to convert Stream<Person> to Stream<String> using map method of
 * Stream.
 *
 */
public class StreamDemo
{
	public static void main(String[] args)
	{

		List<Person> personList = Arrays.asList(new Person(1, "Ram", 25),
				new Person(2, "Peter", 31),
				new Person(3, "Steve", 25),
				new Person(4, "Balu", 32));
		
		
		String name = personList.stream() //convert list to stream		 		   
				.filter(x -> "Peter".equals(x.getName())) // we want "Peter" only
				.map(Person::getName) //convert Stream<Person> to Stream<String>
				.findAny()  // If 'findAny' then return found									
				.orElse(null);	// If not found, return null
		
		System.out.println(name);
	}

}