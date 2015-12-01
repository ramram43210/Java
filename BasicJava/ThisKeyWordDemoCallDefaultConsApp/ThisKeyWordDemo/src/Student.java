public class Student
{

	public String name;
	public int age;

	public Student()
	{
		System.out.println("Default constructor is invoked ...");
	}

	public Student(String name, int age)
	{
		/*
		 * The this() constructor call can be used to invoke the current class
		 * constructor (constructor chaining). This approach is better if you
		 * have many constructors in the class and want to reuse that
		 * constructor.
		 *
		 *  Call to this() must be the first statement in constructor.
		 */
		this();
		this.name = name;
		this.age = age;
	}

}
