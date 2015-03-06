
public class Client
{

		public static void main( String[] args )
		{

				SonyRemoteControl sonyRemoteControl = new SonyRemoteControl(new SonyLedTv());
				sonyRemoteControl.switchOn();
				sonyRemoteControl.switchOff();
				sonyRemoteControl.setChannel(20);
				
				System.out.println("**********************************************************************");
				
				SamsungRemoteControl samsungRemoteControl = new SamsungRemoteControl(new SamsungLedTv());
				samsungRemoteControl.switchOn();
				samsungRemoteControl.switchOff();
				samsungRemoteControl.setChannel(20);
				
		}
}
