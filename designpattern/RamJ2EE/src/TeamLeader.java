public class TeamLeader extends Employee
{
		// TeamLeader can only approve upto 10 days of leave
		private int MAX_LEAVES_CAN_APPROVE = 10;

		public void applyLeave( String employeeName, int numberofDaysLeave )
		{
				 // check if TeamLeader can process this request
				if( numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE )
				{
						ApproveLeave(employeeName, numberofDaysLeave);
				}
				 // if TeamLeader can't process the LeaveRequest then pass on to the supervisor(ProjectLeader) 
	             // so that he can process
				else
				{
						supervisor.applyLeave(employeeName, numberofDaysLeave);
				}
		}

		private void ApproveLeave( String employeeName, int numberofDaysLeave )
		{
				System.out.println("TeamLeader approved " + numberofDaysLeave + " days " + "Leave for the employee : "
				                + employeeName);

		}
}
