import java.util.Comparator;

public class AscendingEmployeeIdComparator implements Comparator<Integer>
{

	/*
	 * This method used to arrange the employeeId's in ascending order.
	 */
	@Override
	public int compare( Integer employeeId1, Integer employeeId2 )
	{

		System.out
		        .print("Compare method has been called in AscendingEmployeeIdComparator,\nto arrange"
		                + " the EmpId's in ascending order : ");

		System.out
		        .println("employeeId1 = " + employeeId1 + ", employeeId2 = " + employeeId2 + "\n");

		if( employeeId1 < employeeId2 )
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}

}
