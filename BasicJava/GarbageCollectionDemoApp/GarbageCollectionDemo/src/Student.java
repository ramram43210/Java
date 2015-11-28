public class Student
{

	String name;
	int age;

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	/*
	 * The finalize() method is invoked each time before the object is garbage
	 * collected. This method can be used to perform cleanup processing. This
	 * method is defined in Object class.
	 */
	public void finalize()
	{
		System.out.println(this + "object is garbage collected," + " name :"
				+ this.name);

	}

}
