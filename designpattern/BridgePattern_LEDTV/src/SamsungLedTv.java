public class SamsungLedTv implements LEDTV
{

		@Override
		public void switchOn()
		{
				System.out.println("Turning ON.. Samsung TV.");
		}

		@Override
		public void switchOff()
		{
				System.out.println("Turning Off.. Samsung TV.");

		}

		@Override
		public void setChannel( int channelNumber )
		{
				System.out.println("Setting channel Number " + channelNumber + ".. on Samsung TV");

		}

}
