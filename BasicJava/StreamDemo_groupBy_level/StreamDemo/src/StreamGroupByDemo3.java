import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * GroupBy aggregate:
 * 
 * SELECT LEVEL, count(LEVEL) 
 * FROM STUDENT 
 * GROUP BY LEVEL;
 * 
 * This example will "count the number of classes per level":
 * 
 */
public class StreamGroupByDemo3
{
	public static void main(String[] args)
	{
		List<Student> studentList = getStudentList();

		/*
		 * In an overloaded groupingBy method, you can pass a second collector.
		 * Collectors have various reduce operations which can be passed, in
		 * this case Collectors.counting which will count the number of classes
		 * in each level.
		 */
		Map<Integer, Long> groupByLevelMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getLevel,Collectors.counting()));

		for (Map.Entry<Integer, Long> entry : groupByLevelMap.entrySet())
		{
			System.out.println("Level = " + entry.getKey() + ", Count = "
					+ entry.getValue());
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