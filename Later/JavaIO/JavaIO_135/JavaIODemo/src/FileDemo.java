import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo
{
	public static void main(String[] args) throws IOException
	{
		File srcDir = new File("D:/Work/java");
		File destDir = new File("D:/work/javanew");

		// Make sure srcDir exists
		if (!srcDir.exists())
		{
			System.out.println("Directory does not exist.");
		}
		else
		{
			copyFolder(srcDir, destDir);
		}

	}

	public static void copyFolder(File src, File dest) throws IOException
	{

		if (src.isDirectory())
		{

			// if directory not exists, create it
			if (!dest.exists())
			{
				dest.mkdir();
				System.out.println("Directory copied from " + src + "  to "
						+ dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String fileName : files)
			{
				// construct the src and dest file structure
				File srcFile = new File(src, fileName);
				File destFile = new File(dest, fileName);
				// recursive copy
				copyFolder(srcFile, destFile);
			}

		}
		else
		{
			// If file, then copy it
			fileCopy(src, dest);
		}
	}

	private static void fileCopy(File srcDir, File destDir)
			throws FileNotFoundException, IOException
	{

		InputStream in = null;
		OutputStream out = null;

		try
		{
			// If file, then copy it
			in = new FileInputStream(srcDir);
			out = new FileOutputStream(destDir);

			byte[] buffer = new byte[1024];

			int length;
			// Copy the file content in bytes
			while ((length = in.read(buffer)) > 0)
			{
				out.write(buffer, 0, length);
			}

		}
		finally
		{
			if (in != null)
			{
				in.close();
			}
			if (out != null)
			{
				out.close();
			}
		}
		System.out.println("File copied from " + srcDir + " to " + destDir);
	}
}
