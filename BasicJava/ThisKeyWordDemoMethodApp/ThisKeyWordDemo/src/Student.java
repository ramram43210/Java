public class Student
{

	public String name;
	public int age;

	public void display()
	{
		/*
		 * We can invoke the method of the current class by using the this
		 * keyword.
		 */
		this.hello();
	}

	public void hello()
	{
		System.out.println("hello");
	}

}
