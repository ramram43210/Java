public abstract class Shape
{
	abstract void draw();

}

class Rectangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Rectangle...");
	}
}

class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Circle...");
	}
}
