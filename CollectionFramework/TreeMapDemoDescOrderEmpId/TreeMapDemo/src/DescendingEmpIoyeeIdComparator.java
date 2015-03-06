import java.util.Comparator;

public class DescendingEmpIoyeeIdComparator implements Comparator<Integer>
{

	/*
	 * This method used to arrange the employeeId's in descending order.
	 */
	@Override
	public int compare( Integer employeeId1, Integer employeeId2 )
	{

		System.out
		        .println("\nCompare method has been called in DescendingEmpIoyeeIdComparator, \nto arrange"
		                + " the employeeId's in descending order : ");

		System.out
		        .println("employeeId1 = " + employeeId1 + ", employeeId2 = " + employeeId2 + "\n");

		if( employeeId1 < employeeId2 )
		{
			
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
