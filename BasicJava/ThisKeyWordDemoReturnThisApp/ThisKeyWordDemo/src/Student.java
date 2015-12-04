public class Student
{

	public String name;
	public int age;

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	/*
	 * 
	 * We can return the this keyword as an statement from the method. In such
	 * case, return type of the method must be the class type (non-primitive).
	 */
	public Student getStudent()
	{
		return this;
	}

}
