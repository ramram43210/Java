
public class MobilePhone
{

		public static void main(String args[])
		{
			new MobilePhone().chargeMe();	
		}
		
		public void chargeMe()
		{
				ITarget target = new MobilePhoneCharger();
				Volt volt=target.get9Volt();
				System.out.println("Mobile phone is charging using : "+volt.getVolts() + "v");
		}
}
