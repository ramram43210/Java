public class StudentTest
{

	public static void main(String[] args)
	{
		Student johnReferenceVariable = new Student("John", 25);
		johnReferenceVariable = null; // now the object referred by
										// johnReferenceVariable is available
										// for garbage collection

		Student ref1 = new Student("Juli", 25);
		Student ref2 = new Student("Dave", 29);
		ref1 = ref2; // now the first object referred by ref1 is available for
						// garbage collection.

		new Student("Peter", 28);
		
	}

}
