class DisplayMessage
{
	/*
	 * Declaring two synchronized method displayName() and
	 * displayHello().one synchronized method calling to
	 * another one.
	 */
	public synchronized void displayName()
	{
		displayHello();
		System.out.println("Peter");
	}

	public synchronized void displayHello()
	{
		System.out.print("Hello ");
	}
}