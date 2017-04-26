import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamMinMaxDemo
{
	public static void main(String[] args)
	{
		OptionalInt optionalIntMin = IntStream.of(1, 2, 3).min();
		System.out.println("optionalIntMin = " + optionalIntMin);
		System.out.println("min = " + optionalIntMin.getAsInt());

		OptionalInt optionalIntMax = IntStream.of(1, 2, 3).max();
		System.out.println("optionalIntMax = " + optionalIntMax);
		System.out.println("max = " + optionalIntMax.getAsInt());

	}
}