public class FiveRsHandler extends RsHandler
{
	public void dispatchRs(long requestedAmount)
	{
		long numberofNotesToBeDispatched = requestedAmount / 5;
		if (numberofNotesToBeDispatched > 0)
		{

			if (numberofNotesToBeDispatched > 1)
			{
				System.out.println(numberofNotesToBeDispatched + " ,Five Rs notes are dispatched by FiveRsHandler\n");
			}
			else
			{
				System.out.println(numberofNotesToBeDispatched + " ,Five Rs note is dispatched by FiveRsHandler\n");

			}
		}

		long pendingAmountToBeProcessed = requestedAmount % 5;

		if (pendingAmountToBeProcessed > 0)
		{
			rsHandler.dispatchRs(pendingAmountToBeProcessed);

		}

	}
}
