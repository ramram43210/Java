public class TVRemote
{

		public static void main( String[] args )
		{
				LEDTVContext context = new LEDTVContext();
				StateOfLedTv ledTvOnState = new LEDTVOnState();
				StateOfLedTv ledTvOffState = new LEDTVOffState();

				context.setStateOfLedTv(ledTvOnState);
				context.doTurnOnOrOff();

				context.setStateOfLedTv(ledTvOffState);
				context.doTurnOnOrOff();
		}

}