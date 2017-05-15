import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2
{
	public static void main(String[] args)
	{
		Student student1 = new Student();
		student1.setName("Peter");
		student1.addBook("Java in Action");
		student1.addBook("Spring in Action");
		student1.addBook("Ruby in Action");

		Student student2 = new Student();
		student2.setName("John");
		student2.addBook("Learning Oracle");
		student2.addBook("Learning Java Script");

		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);

		List<String> bookList = list.stream()
				.map(student -> student.getBookSet()) // Stream<Set<String>>
				.flatMap(student -> student.stream()) // Stream<String>
				.distinct().collect(Collectors.toList());

		bookList.forEach(x -> System.out.println(x));
	}

}