import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group by class level:
 * 
 * SELECT column_name, count(column_name) 
 * FROM table 
 * GROUP BY column_name; 
 * 
 * This example will show "show all classes by level".
 *
 */
public class StreamGroupByDemo2
{
	public static void main(String[] args)
	{
		List<Student> studentList = getStudentList();

		Map<Integer, List<Student>> groupByLevelMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getLevel));

		for (Map.Entry<Integer, List<Student>> entry : groupByLevelMap
				.entrySet())
		{
			System.out.println("Level : " + entry.getKey());

			List<Student> list = entry.getValue();
			for (Student student : list)
			{
				System.out.println(student);
			}
			System.out.println("----------------------------------");
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