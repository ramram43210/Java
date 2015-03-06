public class SonyRemoteControl extends AbstractRemoteControl
{
		public SonyRemoteControl( LEDTV ledtv )
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
