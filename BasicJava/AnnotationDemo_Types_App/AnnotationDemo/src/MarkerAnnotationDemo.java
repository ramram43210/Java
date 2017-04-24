@interface MyMarkerAnnotation
{

}

public class MarkerAnnotationDemo
{
	@MyMarkerAnnotation
	public void display()
	{
		System.out.println("Hi");
	}

	public static void main(String args[])
	{
		MarkerAnnotationDemo markerAnnotationDemo = new MarkerAnnotationDemo();
		markerAnnotationDemo.display();
	}
}