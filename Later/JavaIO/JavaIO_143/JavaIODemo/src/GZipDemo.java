import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZipDemo
{

	public static void main(String[] args) throws IOException
	{
		String outputGzipFile = "D:/work/Helloworld.gz";
		String sourceFile = "D:/work/Helloworld.java";

		GZipDemo gzipDemo = new GZipDemo();
		gzipDemo.gzipIt(outputGzipFile, sourceFile);
	}

	public void gzipIt(String gzipFile, String sourceFile) throws IOException
	{

		byte[] buffer = new byte[1024];

		/*
		 * If the Streams are within the
		 * "try-With-Resources" block, then it will be
		 * closed automatically.
		 */
		try (
				FileOutputStream fos = new FileOutputStream(gzipFile);
				GZIPOutputStream gzos = new GZIPOutputStream(fos);
				FileInputStream fin = new FileInputStream(sourceFile);)
		{

			int len;
			while ((len = fin.read(buffer)) > 0)
			{
				gzos.write(buffer, 0, len);
			}

			gzos.finish();

			System.out.println("Gzip compression has been done..");

		}

	}
}