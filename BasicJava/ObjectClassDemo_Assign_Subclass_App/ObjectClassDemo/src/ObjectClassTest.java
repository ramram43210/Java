import java.util.ArrayList;


public class ObjectClassTest
{

	public static void main(String[] args)
	{
		Object objectRef = new Employee();
		System.out.println(objectRef);
		
		objectRef = new Student();
		System.out.println(objectRef);
		
		objectRef = new ArrayList<String>();
		System.out.println(objectRef);
		
		objectRef = new String("John");
		System.out.println(objectRef);

	}

}
