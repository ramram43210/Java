/*
 * If you are not extending the Thread class,your class
 * object would not be treated as a thread object.So you
 * need to explicitly create Thread class object.We are
 * passing the object of your class that implements
 * Runnable so that your class run() method may execute.
 */
public class DisplayRunnable implements Runnable
{
	public static void main(String args[])
	{
		DisplayRunnable displayRunnable = new DisplayRunnable();
		Thread thread = new Thread(displayRunnable);
		thread.start();
	}

	/*
	 * When an object implementing interface Runnable is
	 * used to create a thread, starting the thread causes
	 * the object's run method to be called in that
	 * separately executing thread.
	 */
	@Override
	public void run()
	{
		System.out.println("Hello Peter..");
	}
}