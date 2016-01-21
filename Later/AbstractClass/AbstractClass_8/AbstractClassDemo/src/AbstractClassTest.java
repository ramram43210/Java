public class AbstractClassTest
{

	public static void main(String[] args)
	{
		Shape shapeRef = new Rectangle();
		shapeRef.draw();
		
		shapeRef = new Circle();
		shapeRef.draw();
	}

}
