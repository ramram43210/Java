public class ChildSpecialistDoctor implements Visitor
{

		private String name;

		public ChildSpecialistDoctor( String name )
		{
				super();
				this.name = name;
		}

		public String getName()
		{
				return name;
		}

		@Override
		public void visit( Visitable visitable )
		{
				Child child = (Child) visitable;
				child.setHealthStatus("Bad");
				System.out.println("ChildSpecialistDoctor: '" + this.getName() + "' did the checkup of the child: '"
				                + child.getName()
				                + "' and found health is not good so updated the health status as 'Bad'\n");

		}

}
