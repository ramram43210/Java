public class ATM
{
		private static HundredRsHandler hundredRsHandler = new HundredRsHandler();
		private static FiftyRsHandler   fiftyRsHandler   = new FiftyRsHandler();
		private static TwentyRsHandler  twentyRsHandler  = new TwentyRsHandler();
		private static FiveRsHandler    fiveRsHandler    = new FiveRsHandler();

		static
		{
				// Prepare the chain of Handlers
				hundredRsHandler.nextHandler(fiftyRsHandler);
				fiftyRsHandler.nextHandler(twentyRsHandler);
				twentyRsHandler.nextHandler(fiveRsHandler);
		}

		public void withdraw( long requestedAmount )
		{

				hundredRsHandler.dispatchRs(requestedAmount);
		}
}
