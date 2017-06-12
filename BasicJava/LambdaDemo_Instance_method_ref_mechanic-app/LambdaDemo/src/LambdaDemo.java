import java.util.function.Consumer;

public class LambdaDemo
{
	public static void main(String[] args)
	{

		final Mechanic mechanic = new Mechanic();
		Car car = new Car("Honda Jazz");

		// Using an anonymous class
		mechanic.execute(car, new Consumer<Car>()
		{
			public void accept(Car c)
			{
				mechanic.fix(c);
			}
		});

		// Using a lambda expression
		mechanic.execute(car, c -> mechanic.fix(c));

		// Using a method reference
		mechanic.execute(car, mechanic::fix);
	}

}
