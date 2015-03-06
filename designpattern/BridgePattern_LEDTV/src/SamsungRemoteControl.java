public class SamsungRemoteControl extends AbstractRemoteControl
{

		public SamsungRemoteControl( LEDTV ledtv )
		{
				super(ledtv);
		}

		@Override
		public void switchOn()
		{
				ledTv.switchOn();
		}

		@Override
		public void switchOff()
		{
				ledTv.switchOff();

		}

		@Override
		public void setChannel( int channelNumber )
		{
				ledTv.setChannel(channelNumber);
		}

}
