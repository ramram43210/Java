public class DesignAndArchitectureState implements ProjectState
{
		@Override
		public void doRequirmentGathering()
		{
				System.out.println("'RequirmentGathering'[Clarification of Requirement] you can do in ''DesignAndArchitecture'' Phase .......");
		}

		@Override
		public void doDesignAndArchitecture()
		{
				System.out.println("'DesignAndArchitecture' has been started .............");

				System.out.println("'DesignAndArchitecture' has been finished by 10 days .............");
		}

		@Override
		public void doDevelopement()
		{
				System.out.println("Cannot do 'developement' because Project is in 'DesignAndArchitecture' Phase...");

		}

		@Override
		public void doTesting()
		{
				System.out.println("Cannot do 'Testing' because Project is in 'DesignAndArchitecture' Phase...");

		}

}