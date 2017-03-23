public class EnumDemo
{

	public static void main(String[] args)
	{
	
		Level[] levelArray = Level.values();
		for (Level level : levelArray)
		{
			System.out.println(level + " = " + level.getLevelCode());
		}
	}
}