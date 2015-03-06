import java.util.Comparator;

public class DescendingEmployeeIdComparator implements Comparator<Integer>
{

	/*
	 * This method used to arrange the employeeId's in descending order.
	 */
	@Override
	public int compare( Integer empId1, Integer empId2 )
	{

		if( empId1 < empId2 )
		{

			return 1;
		}
		else
		{
			return -1;
		}
	}

}
