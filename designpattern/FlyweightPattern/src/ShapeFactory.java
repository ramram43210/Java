import java.util.HashMap;

public class ShapeFactory
{
		private static final HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

		public static Shape getShape( String shapeType )
		{
				Shape shape=null;
				if( shapeType.equalsIgnoreCase("circle") )
				{
						shape = (Circle) shapeMap.get("circle");

						if( shape == null )
						{
								shape = new Circle();
								shapeMap.put("circle", shape);
								System.out.println("Creating circle object with out any color in shapefactory : " + shape
								                + "\n");
						}
				}
				return shape;
		}
}