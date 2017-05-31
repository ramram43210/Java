/**
 *
 * We are using functional interface Messageable and referring constructor with
 * the help of functional interface.
 *
 */
@FunctionalInterface
interface Messageable
{
	Message getMessage(String msg);
}

class Message
{
	public Message(String msg)
	{
		System.out.print(msg);
	}
}

public class MethodReferenceDemo
{
	public static void main(String[] args)
	{
		Messageable messageable = Message::new;
		messageable.getMessage("Hello");
	}
}