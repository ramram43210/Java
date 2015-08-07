/**
 * Car class is the blueprint from which individual car 
 * objects are created.
 */
public class Car
{
	private String brand = null;
	private String model = null;
	private String color = null;

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

}