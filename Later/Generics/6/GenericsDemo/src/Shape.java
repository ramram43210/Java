public abstract class Shape
{
	abstract void draw();
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}
