public class InterfaceDemo
{

	public static void main(String[] args)
	{
		SportBike sportBike = new SportBike();
		sportBike.changeGear(3);
		sportBike.speedUp(60);

		sportBike.printStates();

		sportBike.applyBrakes(30);

		sportBike.printStates();

	}
}
