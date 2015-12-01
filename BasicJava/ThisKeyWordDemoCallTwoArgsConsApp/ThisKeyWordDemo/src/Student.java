public class Student
{

	public String name;
	public int age;
	public String city;

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String city)
	{
		/*
		 * The this() constructor call should be used to reuse the constructor
		 * in the constructor. It maintains the chain between the constructors
		 * i.e. it is used for constructor chaining.
		 * 
		 * Now no need to initialize name and age.
		 */
		this(name, age);
		this.city = city;
	}

}
