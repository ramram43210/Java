class Student
{
	public String name;
	public int age;
	private String gender;

	public Student()
	{

	}

	private Student(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public void displayHello()
	{
		System.out.println("Hello");
	}
	
	
	private void displayWelcome()
	{
		System.out.println("Welcome");
	}

}
