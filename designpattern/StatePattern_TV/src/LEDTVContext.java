public class LEDTVContext implements StateOfLedTv
{

	private StateOfLedTv stateOfLedTv;

	public StateOfLedTv getStateOfLedTv()
	{
		return stateOfLedTv;
	}

	public void setStateOfLedTv(StateOfLedTv stateOfLedTv)
	{
		this.stateOfLedTv = stateOfLedTv;

	}

	@Override
	public void doTurnOnOrOff()
	{
		System.out.println("Current state : " + stateOfLedTv.getClass().getName());
		stateOfLedTv.doTurnOnOrOff();

	}

}