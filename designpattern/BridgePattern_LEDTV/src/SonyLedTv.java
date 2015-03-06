public class SonyLedTv implements LEDTV
{

		@Override
		public void switchOn()
		{
				System.out.println("Turning ON.. Sony TV.");
		}

		@Override
		public void switchOff()
		{
				System.out.println("Turning Off.. Sony TV.");

		}

		@Override
		public void setChannel( int channelNumber )
		{
				System.out.println("Setting channel Number " + channelNumber + ".. on Sony TV");

		}

}
