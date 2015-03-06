abstract class AbstractRemoteControl
{

		protected LEDTV ledTv;

		protected AbstractRemoteControl( LEDTV ledTv )
		{
				this.ledTv = ledTv;
		}

		public abstract void switchOn();

		public abstract void switchOff();

		public abstract void setChannel( int channelNumber );

}
