public class BusinessDelegate
{
		private BusinessLookUp  lookupService = new BusinessLookUp();
		private BusinessService businessService;

		public void doTask( String serviceType )
		{
				businessService = lookupService.getBusinessService(serviceType);

				System.out.println(businessService.toString() + " : Got business serve object after do the look up");

				businessService.doProcessing();
		}
}
