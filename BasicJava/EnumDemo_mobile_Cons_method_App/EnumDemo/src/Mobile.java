enum Mobile
{
	Samsung(500), 
	Nokia(300), 
	Motorola(400);

	int price;

	Mobile(int price)
	{
		this.price = price;
	}

	int getPrice()
	{
		return price;
	}
}
