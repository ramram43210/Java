import java.io.File;

public class FileDemo
{

	public static void main(String[] args)
	{
		File file = new File("/home/start.sh");

		System.out.println("Is Execute allow : " + file.canExecute());
		System.out.println("Is Write allow : " + file.canWrite());
		System.out.println("Is Read allow : " + file.canRead());

		file.setExecutable(false);
		file.setReadable(false);
		file.setWritable(false);
		
		System.out.println("----------------------------------------");
		System.out.println("Is Execute allow : " + file.canExecute());
		System.out.println("Is Write allow : " + file.canWrite());
		System.out.println("Is Read allow : " + file.canRead());

	}

}
