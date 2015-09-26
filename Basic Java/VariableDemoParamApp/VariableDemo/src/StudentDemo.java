public class StudentDemo
{

	public static void main(String[] args)
	{
		Student student = new Student();
		int totalMarksOftheStudent = student.getTotalMarks(50,40);
		System.out.println("Total Marks : "+totalMarksOftheStudent);
	}

}
