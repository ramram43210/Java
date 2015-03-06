public class Dog implements Animal
{

		private String  name;
		private int     age;
		private String  color;
		private Dogleg  dogleg;
		private Dogtail dogtail;
		private Dogear  dogear;
		private Dogeye  dogeye;

		public Dog( String name, int age, String color, Dogleg dogleg, Dogtail dogtail, Dogear dogear, Dogeye dogeye )
		{
				super();
				this.name = name;
				this.age = age;
				this.color = color;
				this.dogleg = dogleg;
				this.dogtail = dogtail;
				this.dogear = dogear;
				this.dogeye = dogeye;
		}

		public Dogleg getDogleg()
		{
				return dogleg;
		}

		public void setDogleg( Dogleg dogleg )
		{
				this.dogleg = dogleg;
		}

		public Dogtail getDogtail()
		{
				return dogtail;
		}

		public void setDogtail( Dogtail dogtail )
		{
				this.dogtail = dogtail;
		}

		public Dogear getDogear()
		{
				return dogear;
		}

		public void setDogear( Dogear dogear )
		{
				this.dogear = dogear;
		}

		public Dogeye getDogeye()
		{
				return dogeye;
		}

		public void setDogeye( Dogeye dogeye )
		{
				this.dogeye = dogeye;
		}

		public String getName()
		{
				return name;
		}

		public void setName( String name )
		{
				this.name = name;
		}

		public int getAge()
		{
				return age;
		}

		public void setAge( int age )
		{
				this.age = age;
		}

		public String getColor()
		{
				return color;
		}

		public void setColor( String color )
		{
				this.color = color;
		}

		public Animal clone()
		{

				Dog dogObject = null;

				try
				{

						dogObject = (Dog) super.clone();

				}

				catch( CloneNotSupportedException e )
				{

						e.printStackTrace();

				}

				return dogObject;
		}

		@Override
		public String toString()
		{
				return "Dog [name=" + name + ", age=" + age + ", color=" + color + ", dogleg=" + dogleg + ", dogtail="
				                + dogtail + ", dogear=" + dogear + ", dogeye=" + dogeye + "]";
		}

}