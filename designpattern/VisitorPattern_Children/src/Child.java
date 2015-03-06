public class Child implements Visitable
{

		private String name;

		private String healthStatus;

		public Child( String name )
		{
				super();
				this.name = name;
		}

		public String getName()
		{
				return name;
		}

		public String getHealthStatus()
		{
				return healthStatus;
		}

		public void setHealthStatus( String healthStatus )
		{
				this.healthStatus = healthStatus;
		}

		@Override
		public void accept( Visitor visitor )
		{
				visitor.visit(this);
		}

}
