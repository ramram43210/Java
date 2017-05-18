import java.util.ArrayList;
import java.util.List;

public class NonStreamDemo
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
		List<Student> listGoodStudents = new ArrayList<>();
		for (Student student : listStudents)
		{
			if (student.getScore() >= 80)
			{
				listGoodStudents.add(student);
			}
		}

		for (Student student : listGoodStudents)
		{
			System.out.println(student);
		}

		/*
		 * Calculate average score of all students
		 */
		double sum = 0.0;
		for (Student student : listStudents)
		{
			sum += student.getScore();
		}

		double average = sum / listStudents.size();

		System.out.println("Average score: " + average);

	}

}