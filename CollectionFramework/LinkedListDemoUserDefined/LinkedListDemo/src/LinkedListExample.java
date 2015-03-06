import java.util.LinkedList;

/*
 * Storing user-defined class objects.
 */
public class LinkedListExample
{

	public static void main(String[] args)
	{
		LinkedList<Student> linkedList = new LinkedList<Student>();

		Student john = new Student("John", 32);
		Student david = new Student("David", 42);
		Student peter = new Student("Peter", 52);

		linkedList.add(john);
		linkedList.add(david);
		linkedList.add(peter);

		/*
		 * Using for each loop getting each student object from the linkedList
		 */
		for (Student student : linkedList)
		{
			System.out.println(student.toString());
		}
	}
}
