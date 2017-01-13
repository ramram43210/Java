public class EnumDemo
{

	public static void main(String[] args)
	{
		for (Level level : Level.values())
		{
			System.out.println(level + " = " + level.getLevelCode());
		}
	}
}