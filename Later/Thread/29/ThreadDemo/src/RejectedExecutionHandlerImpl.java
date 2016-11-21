import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler
{
	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor)
	{
		System.out.println(r.toString() + " is rejected");
	}
}
