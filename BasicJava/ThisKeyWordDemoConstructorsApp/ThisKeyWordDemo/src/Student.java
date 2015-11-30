public class Student
{

	public String name;
	public int age;

	public Student()
	{
		this("David", 45);
	}
	
	public Student(String name)
	{
		this(name, 45);
	}

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

}
