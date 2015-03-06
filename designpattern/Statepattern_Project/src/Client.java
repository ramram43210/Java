public class Client
{

		public static void main( String[] args )
		{
				/*
				 * Initially Project in 'RequirementGatheringState'
				 */
				Project project = new Project();

				System.out.println("Project internal state is  : " + project.getProjectState().getClass().getName()+"\n");

				project.doDesignAndArchitecture();
				project.doDevelopement();
				project.doTesting();
				project.doRequirmentGathering();

				System.out.println();

				
				project.doDesignAndArchitecture();
				
				project.doTesting();
				
				project.doDevelopement();
				
				project.doRequirmentGathering();

		}

}