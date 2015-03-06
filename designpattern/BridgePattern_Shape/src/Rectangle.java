public class Rectangle extends Shape
{

		public void colorIt()
		{
				System.out.print("Rectangle filled with ");
				color.fillColor();
		}

		@Override
		public void draw()
		{
				System.out.println("Rectangale has been drawn with out any color");
		}
}
