public class TwentyRsHandler extends RsHandler
{
	public void dispatchRs(long requestedAmount)
	{
		long numberofNotesToBeDispatched = requestedAmount / 20;

		if (numberofNotesToBeDispatched > 0)
		{

			if (numberofNotesToBeDispatched > 1)
			{
				System.out.println(numberofNotesToBeDispatched + " ,Twenty Rs notes are dispatched by TwentyRsHandler\n");
			}
			else
			{
				System.out.println(numberofNotesToBeDispatched + " ,Twenty Rs note is dispatched by TwentyRsHandler\n");

			}
		}

		long pendingAmountToBeProcessed = requestedAmount % 20;

		if (pendingAmountToBeProcessed > 0)
		{
			rsHandler.dispatchRs(pendingAmountToBeProcessed);

		}

	}
}
