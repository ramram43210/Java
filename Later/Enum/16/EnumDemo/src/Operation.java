public enum Operation
{
	PLUS, MINUS, MULTIPLY, DIVIDE;

	long calculate(long x, long y)
	{
		switch (this)
		{
		case PLUS:
			return x + y;
		case MINUS:
			return x - y;
		case MULTIPLY:
			return x * y;
		case DIVIDE:
			return x / y;
		default:
			throw new AssertionError("Unknown operations " + this);
		}
	}

}