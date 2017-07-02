import java.util.Arrays;
import java.util.List;
/**
 * 
 * With JDK8 Stream functionality How to filter the personList?
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
				.filter(x -> "Peter".equals(x.getName())) //we want "Peter" only
				.findAny()  // If 'findAny' then return found
				.orElse(null);	//If not found, return null

		System.out.println(person);
	}

}