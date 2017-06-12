import java.util.function.Consumer;

class Car
{
	private String name;

	public Car(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

public class Mechanic
{
	public void fix(Car c)
	{
		System.out.println("Mechanic is fixing " + c.getName());
	}

	public void execute(Car car, Consumer<Car> c)
	{
		c.accept(car);
	}
}