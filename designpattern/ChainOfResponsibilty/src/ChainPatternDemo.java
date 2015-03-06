
public class ChainPatternDemo
{

		public static void main( String[] args )
		{
				TeamLeader teamLeader= new TeamLeader();
				ProjectLeader projectLeader= new ProjectLeader();
				HR hr=new HR();
				teamLeader.setNextSupervisor(projectLeader);
				projectLeader.setNextSupervisor(hr);
				
				teamLeader.applyLeave("David", 9);
				System.out.println();
				teamLeader.applyLeave("John", 18);
				System.out.println();
				teamLeader.applyLeave("Steve", 30);
				System.out.println();
				teamLeader.applyLeave("Rohan", 50);

		}

}
