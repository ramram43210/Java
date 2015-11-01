public class LEDBulbSwitch implements Switch
{

	@Override
	public void switchOn()
	{
		LedBulb ledbulb = new LedBulb("'A' shape","2.3 inch");
		ledbulb.switchOnTheLedBulb();
	}

	@Override
	public void switchOff()
	{
		LedBulb ledbulb = new LedBulb("'A' shape","2.3 inch");
		ledbulb.switchOffTheLedBulb();
	}

}
