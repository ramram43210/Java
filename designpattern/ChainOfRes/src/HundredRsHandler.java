public class HundredRsHandler extends RsHandler
{

	public void dispatchRs(long requestedAmount)
	{
		long numberofNotesToBeDispatched = requestedAmount / 100;
		if (numberofNotesToBeDispatched > 0)
		{
			if(numberofNotesToBeDispatched>1)
			{
				System.out.println(numberofNotesToBeDispatched + " ,Hundred Rs notes are dispatched by HundredRsHandler\n");
			}
			else
			{
				System.out.println(numberofNotesToBeDispatched + " ,Hundred Rs note is dispatched by HundredRsHandler\n");
				
			}
		}

		long pendingAmountToBeProcessed = requestedAmount % 100;

		if (pendingAmountToBeProcessed > 0)
		{
			rsHandler.dispatchRs(pendingAmountToBeProcessed);

		}

	}

}
