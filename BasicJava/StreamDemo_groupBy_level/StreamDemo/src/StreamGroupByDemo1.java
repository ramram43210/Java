import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group by teacher name:
 * 
 * SELECT column_name, count(column_name) 
 * FROM table 
 * GROUP BY column_name;
 * 
 * This example will show how to "group classes by a teacher's name". Here you
 * will pass the groupingBy method a function in the form of a method reference
 * extracting each teacher name to the corresponding Student which will return 1
 * key to many elements. This is similar to guava's Multimap collection which
 * allows for easy mapping of a single key to multiple values.
 *
 */
public class StreamGroupByDemo1
{
	public static void main(String[] args)
	{
		List<Student> studentList = getStudentList();

		Map<String, List<Student>> groupByTeachersMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getTeacherName));

		for (Map.Entry<String, List<Student>> entry : groupByTeachersMap
				.entrySet())
		{
			System.out.println("Teacher Name : " + entry.getKey());

			List<Student> list = entry.getValue();
			for (Student student : list)
			{
				System.out.println(student);
			}
			System.out.println("-------------------------------------");
		}

	}

	private static List<Student> getStudentList()
	{
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Peter", "Mr.John", 1, "Java Basics"));
		studentList.add(new Student("Ram", "Mr.John", 1, "Webservice Basics"));
		studentList.add(new Student("Juli", "Mr.John", 2, "Advance Java"));
		studentList.add(new Student("Dave", "Mr.Kumar", 1, "Ruby basics"));
		studentList.add(new Student("Raja", "Mr.Kumar", 2, "Advance Ruby"));
		return studentList;
	}

}