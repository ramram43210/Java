public abstract class HouseTemplate
{

		// Template method is final so subclasses can't override
		public final void buildHouse()
		{
				buildFoundation();
				buildPillars();
				buildWalls();
				buildWindows();
				System.out.println("House is built.");
		}

		// Methods to be implemented by subclasses

		public abstract void buildFoundation();

		public abstract void buildPillars();

		public abstract void buildWalls();

		public abstract void buildWindows();

}