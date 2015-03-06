public class RequirementGatheringState implements ProjectState
{

		@Override
		public void doRequirmentGathering()
		{
				System.out.println("'RequirmentGathering' has been started .............");

				System.out.println("'RequirmentGathering' has been finished by 7 days .............");

		}

		@Override
		public void doDesignAndArchitecture()
		{
				System.out.println("Cannot do 'DesignAndArchitecture' because Project is in 'RequirmentGathering' Phase...");

		}

		@Override
		public void doDevelopement()
		{
				System.out.println("Cannot do 'developement' because Project is in 'RequirmentGathering' Phase...");

		}

		@Override
		public void doTesting()
		{
				System.out.println("Cannot do 'Testing' because Project is in 'RequirmentGathering' Phase...");

		}

}