public class LEDTVRemote implements Remote
{

	@Override
	public void switchOn()
	{
		System.out.println("switchOn method of LEDTVRemote is called"
				+ " and Remote is calling switchOnTV method of LED TV ");
		LedTV ledtv = new LedTV("106 Cm",true);
		ledtv.switchOnTV();
	}

	@Override
	public void switchOff()
	{
		System.out.println("switchOff method of LEDTVRemote is called"
				+ " and Remote is calling switchOffTV method of LED TV ");
		LedTV ledtv = new LedTV("106 Cm",true);
		ledtv.switchOffTV();
	}

}
