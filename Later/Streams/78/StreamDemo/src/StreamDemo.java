import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		 * Find students whose score >= 80
		 */
		List<Student> listGoodStudents = listStudents.stream()
				.filter(s -> s.getScore() >= 80)
				.collect(Collectors.toList());

		listGoodStudents.stream().forEach(System.out::println);

		System.out.println("-------------------------------");

		/*
		 * Calculate average score of all students
		 */
		double average = listStudents.stream()
				.mapToInt(s -> s.getScore()).average().getAsDouble();

		System.out.println("Average score: " + average);

		System.out.println("-------------------------------");
		/*
		 * Find top 3 students.
		 * 
		 * As you can see, the operations on a stream can be chained
		 * together (intermediate operations) and end with a terminal
		 * operation. Such a chain of stream operations is called
		 * stream pipeline.
		 */
		List<Student> top3Students = listStudents.stream()
				.filter(s -> s.getScore() >= 80).sorted().limit(3)
				.collect(Collectors.toList());

		System.out.println("Top 3 Students by Score:");
		top3Students.forEach(s -> System.out.println(s));

	}

}