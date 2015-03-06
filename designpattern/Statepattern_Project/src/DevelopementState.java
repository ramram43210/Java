public class DevelopementState implements ProjectState
{
		@Override
		public void doRequirmentGathering()
		{
				System.out.println("Cannot do 'RequirmentGathering' because Project is in 'Developement' Phase...");
		}

		@Override
		public void doDesignAndArchitecture()
		{
				System.out.println("'DesignAndArchitecture'[Clarification of DesignAndArchitecture] you can do in ''Developement'' Phase .......");
		}

		@Override
		public void doDevelopement()
		{
				System.out.println("'Developement' has been started .............");

				System.out.println("'Developement' has been finished by 40 days .............");

		}

		@Override
		public void doTesting()
		{
				System.out.println("Cannot do 'Testing' because Project is in 'Developement' Phase...");

		}

}
