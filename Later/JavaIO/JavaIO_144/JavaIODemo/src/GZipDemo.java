import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZipDemo
{

	public static void main(String[] args) throws IOException
	{
		String inputGzipFile = "D:/work/Helloworld.gz";
		String dstFile = "D:/work/Helloworld.java";

		GZipDemo gzipDemo = new GZipDemo();
		gzipDemo.deCompress(inputGzipFile, dstFile);
	}

	public void deCompress(String inputGzipFile, String dstFile) throws IOException
	{

		byte[] buffer = new byte[1024];

		/*
		 * If the Streams are within the
		 * "try-With-Resources" block, then it will be
		 * closed automatically.
		 */
		try (
				FileInputStream fis = new FileInputStream(inputGzipFile);
				GZIPInputStream gzis = new GZIPInputStream(fis);
				FileOutputStream out = new FileOutputStream(dstFile);)
		{

			int len;
			while ((len = gzis.read(buffer)) > 0)
			{
				out.write(buffer, 0, len);
			}

			System.out.println("Decompression is done..");

		}
	}
}