abstract class Shape
{

		protected ColorImplementor color;

		protected ColorImplementor getColor()
		{
				return color;
		}

		protected void setColor( ColorImplementor color )
		{
				this.color = color;
		}

		abstract public void colorIt();

		abstract public void draw();
}
