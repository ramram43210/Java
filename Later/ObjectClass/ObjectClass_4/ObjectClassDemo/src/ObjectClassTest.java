import java.util.ArrayList;
import java.util.HashSet;

public class ObjectClassTest
{

	public static void main(String[] args)
	{
		Employee employeeObj = new Employee();

		/*
		 * Returns the Class object that represents the
		 * runtime class of this object.
		 */

		System.out.println("employeeObj.getClass() = "
				+ employeeObj.getClass());

		ArrayList<String> arrayListObj = new ArrayList<String>();

		System.out.println("arrayListObj.getClass() = "
				+ arrayListObj.getClass());

		HashSet<String> hashSetObj = new HashSet<String>();

		System.out.println("hashSetObj.getClass() = "
				+ hashSetObj.getClass());

	}

}
