import java.util.ArrayList;
import java.util.List;

public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Alice", 82));
		studentList.add(new Student("Bob", 90));
		studentList.add(new Student("Carol", 67));
		studentList.add(new Student("David", 80));
		studentList.add(new Student("Eric", 55));
		studentList.add(new Student("Frank", 49));
		studentList.add(new Student("Gary", 88));
		studentList.add(new Student("Henry", 98));
		studentList.add(new Student("Ivan", 66));
		studentList.add(new Student("John", 52));

		/*
		 * The following code may execute stream operations in
		 * parallel
		 */
		studentList.parallelStream().filter(s -> s.getScore() >= 80)
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
		studentList.stream().sorted().parallel()
				.filter(s -> s.getScore() >= 80)
				.forEach(System.out::println);

	}

}