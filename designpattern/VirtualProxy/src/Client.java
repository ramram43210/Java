class Client
{

		/**
		 * Test method
		 */
		public static void main( String[] args )
		{
				final Image IMAGE1 = new ProxyImage("HiResolution_100MB_Dog Photo");
				final Image IMAGE2 = new ProxyImage("HiResolution_100MB_Lion photo");

				System.out.println("IMAGE1["+IMAGE1+"] calling displayImage first time :");
				IMAGE1.displayImage(); // loading necessary
				
				System.out.println("IMAGE1["+IMAGE1+"] calling displayImage second time :");
				IMAGE1.displayImage(); // loading unnecessary
				
				System.out.println("IMAGE1["+IMAGE1+"] calling displayImage third time :");
								IMAGE1.displayImage(); // loading unnecessary
								
				System.out.println("###############################################################\n");

				System.out.println("IMAGE2["+IMAGE2+"] calling displayImage first time :");
				IMAGE2.displayImage(); // loading necessary
				
				System.out.println("IMAGE2["+IMAGE2+"] calling displayImage second time :");
				IMAGE2.displayImage(); // loading unnecessary

				
		}

}