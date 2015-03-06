public class FiftyRsHandler extends RsHandler
{
	public void dispatchRs(long requestedAmount)
	{
		long numberofNotesToBeDispatched = requestedAmount / 50;
		if (numberofNotesToBeDispatched > 0)
		{
			if (numberofNotesToBeDispatched > 1)
			{
				System.out.println(numberofNotesToBeDispatched + " ,Fifty Rs notes are dispatched by FiftyRsHandler\n");
			}
			else
			{
				System.out.println(numberofNotesToBeDispatched + " ,Fifty Rs note is dispatched by FiftyRsHandler\n");

			}

		}

		long pendingAmountToBeProcessed = requestedAmount % 50;

		if (pendingAmountToBeProcessed > 0)
		{
			rsHandler.dispatchRs(pendingAmountToBeProcessed);

		}

	}
}
