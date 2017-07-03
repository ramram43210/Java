import java.util.Arrays;
import java.util.List;

/**
 * 
 * How to filter the person object from personList based on Name and
 * age?
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
		
		
		Person person = personList.stream() //convert list to stream		 		   
				.filter(x -> "Peter".equals(x.getName()) && 31 ==x.getAge() ) // we want "Peter" with age 31 only
				.findAny()  // If 'findAny' then return found									
				.orElse(null);	// If not found, return null
		
		System.out.println(person);
	}

}