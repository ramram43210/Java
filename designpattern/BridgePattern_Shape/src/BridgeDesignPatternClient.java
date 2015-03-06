import java.util.Scanner;

public class BridgeDesignPatternClient
{

		public static void main( String[] args )
		{

				System.out.println("Please enter the color you want to fill  : 'Green' or 'Blue'");
				Scanner scanner = new Scanner(System.in);
				String color = scanner.next();
				System.out.println("color : " + color);

				Shape rectangleShape = new Rectangle();
				rectangleShape.draw();
				Shape circleShape = new Circle();
				circleShape.draw();
				System.out.println();
				if( "blue".equalsIgnoreCase(color) )
				{
						rectangleShape.setColor(new BlueColorImplementor());
						rectangleShape.colorIt();

						circleShape.setColor(new BlueColorImplementor());
						circleShape.colorIt();

				}
				else if( "green".equalsIgnoreCase(color) )
				{
						rectangleShape.setColor(new GreenColorImplementor());
						rectangleShape.colorIt();

						circleShape.setColor(new GreenColorImplementor());
						circleShape.colorIt();
				}

		}
}
