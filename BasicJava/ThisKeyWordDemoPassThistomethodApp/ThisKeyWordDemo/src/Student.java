public class Student
{

	public String name;
	public int age;

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void display()
	{
		/*
		 * The this keyword can also be passed as an argument in the method. It
		 * is mainly used in the event handling.
		 * 
		 * In event handling (or) in a situation where we have to provide
		 * reference of a class to another one.
		 */
		displayFields(this);
	}

	public void displayFields(Student studentObj)
	{
		System.out.println("Name : " + studentObj.name);
		System.out.println("Age  : " + studentObj.age);
	}

}
