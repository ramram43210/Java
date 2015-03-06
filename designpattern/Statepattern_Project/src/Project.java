// This is like Context
public class Project implements ProjectState
{

		private ProjectState projectState;

		public Project()
		{
				projectState = new RequirementGatheringState();
		}

		public ProjectState getProjectState()
		{
				return projectState;
		}

		public void setProjectState( ProjectState projectState )
		{
				this.projectState = projectState;
		}

		@Override
		public void doRequirmentGathering()
		{
				projectState.doRequirmentGathering();
				/*
				 * Once RequirmentGathering is finished project internal state
				 * will be moved to DesignAndArchitectureState
				 */
				if( projectState instanceof RequirementGatheringState )
				{
						setProjectState(new DesignAndArchitectureState());
						System.out.println("\nProject internal state moved to : " + projectState.getClass().getName() +"\n" );
				}

		}

		@Override
		public void doDesignAndArchitecture()
		{
				projectState.doDesignAndArchitecture();

				/*
				 * Once DesignAndArchitecture is finished project internal state
				 * will be moved to DevelopementState
				 */
				if( projectState instanceof DesignAndArchitectureState )
				{
						setProjectState(new DevelopementState());
						System.out.println("\nProject internal state moved to : " + projectState.getClass().getName() +"\n" );
				}

		}

		@Override
		public void doDevelopement()
		{
				projectState.doDevelopement();

				/*
				 * Once Developement is finished project internal state will be
				 * moved to TestingState
				 */

				if( projectState instanceof DevelopementState )
				{
						setProjectState(new TestingState());
						System.out.println("\nProject internal state moved to : " + projectState.getClass().getName() +"\n" );
				}

		}

		@Override
		public void doTesting()
		{
				projectState.doTesting();

		}

}