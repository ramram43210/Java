import java.util.Map;

public class EnvMap
{
	public static void main(String[] args)
	{
		/*
		 * Returns an unmodifiable string map view of the
		 * current system environment.
		 */
		Map<String, String> env = System.getenv();
		for (String envName : env.keySet())
		{
			/*
			 * Gets the value of the specified environment
			 * variable.
			 */
			String envValue = env.get(envName);
			System.out.format("%s=%s%n", envName, envValue);
		}
	}
}