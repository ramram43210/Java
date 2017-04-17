enum Car
{
	TATA(2), 
	AUDI(60), 
	FIAT(20), 
	HONDA(15);

	private int price;

	Car(int price)
	{
		this.price = price;
	}

	int getPrice()
	{
		return price;
	}
}

public class EnumDemo
{
	public static void main(String args[])
	{
		Car[] carArray = Car.values();
		System.out.println("All car prices:");
		for (Car car : carArray)
		{
			System.out.println(car + " costs " + car.getPrice()
					+ " thousand dollars.");
		}

	}
}