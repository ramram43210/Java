import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{
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

	public static void main(String args[])
	{
		List<Rectangle> recList = new ArrayList<Rectangle>();
		recList.add(new Rectangle());
		recList.add(new Rectangle());

		List<Circle> circleList = new ArrayList<Circle>();
		circleList.add(new Circle());
		circleList.add(new Circle());

		drawShapes(recList);
		drawShapes(circleList);
	}
}