import java.util.ArrayList;
import java.util.List;

public class NonStreamDemo
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
		List<Student> goodStudentList = new ArrayList<>();
		for (Student student : studentList)
		{
			if (student.getScore() >= 80)
			{
				goodStudentList.add(student);
			}
		}

		for (Student student : goodStudentList)
		{
			System.out.println(student);
		}

		/*
		 * Calculate average score of all students
		 */
		double sum = 0.0;
		for (Student student : studentList)
		{
			sum += student.getScore();
		}

		double average = sum / studentList.size();

		System.out.println("Average score: " + average);

	}

}