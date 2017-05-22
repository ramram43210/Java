import java.util.ArrayList;
import java.util.List;

public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Student> listStudents = new ArrayList<>();

		listStudents.add(new Student("Alice", 82));
		listStudents.add(new Student("Bob", 90));
		listStudents.add(new Student("Carol", 67));
		listStudents.add(new Student("David", 80));
		listStudents.add(new Student("Eric", 55));
		listStudents.add(new Student("Frank", 49));
		listStudents.add(new Student("Gary", 88));
		listStudents.add(new Student("Henry", 98));
		listStudents.add(new Student("Ivan", 66));
		listStudents.add(new Student("John", 52));

		/*
		 * The following code may execute stream operations in
		 * parallel
		 */
		listStudents.parallelStream().filter(s -> s.getScore() >= 80)
				.sorted().limit(3).forEach(System.out::println);

		System.out.println("------------------------------");

		/*
		 * The Collection’s stream() method returns a sequential
		 * stream. We can convert a sequential stream to a parallel
		 * stream by calling the parallel() method on the current
		 * stream.
		 * 
		 * The following example shows a stream executes the sorted
		 * operation sequentially, and then execute the filter
		 * operation in parallel
		 */
		listStudents.stream().sorted().parallel()
				.filter(s -> s.getScore() >= 80)
				.forEach(System.out::println);

	}

}