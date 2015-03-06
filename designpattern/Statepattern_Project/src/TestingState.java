public class TestingState implements ProjectState
{
		@Override
		public void doRequirmentGathering()
		{
				System.out.println("Cannot do 'RequirmentGathering' because Project is in 'Testing' Phase...");
		}

		@Override
		public void doDesignAndArchitecture()
		{
				System.out.println("Cannot do 'DesignAndArchitecture' because Project is in 'Testing' Phase...");
		}

		@Override
		public void doDevelopement()
		{
				System.out.println("'Developement'[Bug fixes] you can do in ''Testing'' Phase .......");

		}

		@Override
		public void doTesting()
		{
				System.out.println("'Testing' has been started .............");

				System.out.println("'Testing' has been finished by 20 days .............");

		}

}
