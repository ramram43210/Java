import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		 * Find students whose score >= 80
		 */
		List<Student> goodStudentList = studentList.stream()
				.filter(s -> s.getScore() >= 80)
				.collect(Collectors.toList());

		goodStudentList.stream().forEach(System.out::println);

		System.out.println("-------------------------------");

		/*
		 * Calculate average score of all students
		 */
		double average = studentList.stream()
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
		List<Student> top3Students = studentList.stream()
				.filter(s -> s.getScore() >= 80).sorted().limit(3)
				.collect(Collectors.toList());

		System.out.println("Top 3 Students by Score:");
		top3Students.forEach(s -> System.out.println(s));

	}

}