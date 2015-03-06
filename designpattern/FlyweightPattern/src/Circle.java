public class Circle implements Shape
{
		private String    color;
		private final int x      = 10;
		private final int y      = 20;
		private final int radius = 30;

		public Circle()
		{
		}

		public Circle( String color )
		{
				this.color = color;
		}

		public String getColor()
		{
				return color;
		}

		public void setColor( String color )
		{
				this.color = color;
		}

		@Override
		public void draw()
		{
				System.out.println(this+" : Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :"
				                + radius);
		}
}