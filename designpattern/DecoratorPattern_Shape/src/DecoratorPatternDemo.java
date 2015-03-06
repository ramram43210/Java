public class DecoratorPatternDemo
{
	public static void main(String[] args)
	{

		Shape blueCircle = new BlueShapeDecorator(new Circle());

		Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

		System.out.println("\nCreate Blue color Circle using BlueShapeDecorator");
		blueCircle.draw();

		System.out.println("\nCreate Blue color Rectangle using BlueShapeDecorator");
		blueRectangle.draw();
	}
}