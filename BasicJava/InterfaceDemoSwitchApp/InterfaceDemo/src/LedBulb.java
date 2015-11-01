public class LedBulb
{

	private String shape;
	private String diameter;

	public LedBulb(String shape, String diameter)
	{
		super();
		this.shape = shape;
		this.diameter = diameter;
	}

	public String getShape()
	{
		return shape;
	}

	public void setShape(String shape)
	{
		this.shape = shape;
	}

	public String getDiameter()
	{
		return diameter;
	}

	public void setDiameter(String diameter)
	{
		this.diameter = diameter;
	}

	public void switchOnTheLedBulb()
	{
		System.out.println(shape +" Led Bulb is switched on");
	}

	public void switchOffTheLedBulb()
	{
		System.out.println(shape +" Led Bulb is switched off");
	}

}
