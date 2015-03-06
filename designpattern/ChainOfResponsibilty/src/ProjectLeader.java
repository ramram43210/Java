public class ProjectLeader extends Employee
{
		// ProjectLeader can only approve upto 20 days of leave
		private int MAX_LEAVES_CAN_APPROVE = 20;

		public void applyLeave( String employeeName, int numberofDaysLeave )
		{
				 // check if ProjectLeader can process this request
				if( numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE )
				{
						ApproveLeave(employeeName, numberofDaysLeave);
				}
				// if ProjectLeader can't process the LeaveRequest then pass on to the supervisor(HR) 
	             // so that he can process
				else
				{
						supervisor.applyLeave(employeeName, numberofDaysLeave);
				}
		}

		private void ApproveLeave( String employeeName, int numberofDaysLeave )
		{
				System.out.println("ProjectLeader approved " + numberofDaysLeave + " days " + "Leave for the employee : "
				                + employeeName);

		}
}
