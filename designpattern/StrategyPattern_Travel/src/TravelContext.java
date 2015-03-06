public class TravelContext
{
	private TravelStrategy travelStrategy;

	// Client will set what TravelStrategy to use by calling this method
	public void setTravelStrategy(TravelStrategy strategy)
	{
		this.travelStrategy = strategy;
	}

	public TravelStrategy getTravelStrategy()
	{
		return travelStrategy;
	}

	public void gotoAirport()
	{
		travelStrategy.gotoAirport();
	}

}