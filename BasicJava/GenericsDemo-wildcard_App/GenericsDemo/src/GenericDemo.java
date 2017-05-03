import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{

	public static void main(String args[])
	{
		List<Rectangle> recList = new ArrayList<Rectangle>();
		recList.add(new Rectangle());
		recList.add(new Rectangle());
		drawShapes(recList);

		List<Circle> circleList = new ArrayList<Circle>();
		circleList.add(new Circle());
		circleList.add(new Circle());		
		drawShapes(circleList);
	}

	/*
	 * This method accepts only the list contains child class of Shape
	 */
	public static void drawShapes(List<? extends Shape> shapeList)
	{
		for (Shape shape : shapeList)
		{
			shape.draw();
		}
	}

}