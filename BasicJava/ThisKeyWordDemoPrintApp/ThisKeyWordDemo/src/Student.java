public class Student
{

	private String name;
	private int age;

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void printThis()
	{
		System.out.println("this          : " + this);
	}

	public static void main(String[] args)
	{
		Student studentObject = new Student("Peter", 45);
		System.out.println("studentObject : " + studentObject);
		studentObject.printThis();
	}

}
