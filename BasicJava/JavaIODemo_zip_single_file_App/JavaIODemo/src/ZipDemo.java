import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDemo
{
	public static void main(String[] args) throws IOException
	{
		ZipDemo zipDemo = new ZipDemo();
		File file = new File("D:/work/HelloWorld.java");
		zipDemo.zipFile("D:/work/java.zip", file);
	}

	private void zipFile(String outputZipFileName, File file)
			throws IOException
	{
		byte[] buffer = new byte[1024];

		/*
		 * All Streams will be closed automatically because they
		 * are within the "try-With-Resources" block.
		 */
		try (FileOutputStream fos = new FileOutputStream(outputZipFileName);
				ZipOutputStream zos = new ZipOutputStream(fos);
				FileInputStream fin = new FileInputStream(file))
		{

			ZipEntry ze = new ZipEntry(file.getName());
			zos.putNextEntry(ze);

			int len;
			while ((len = fin.read(buffer)) > 0)
			{
				zos.write(buffer, 0, len);
			}

			/*
			 * Closes the current ZIP entry and positions
			 * the stream for writing the next entry.
			 */
			zos.closeEntry();
		}

		System.out.println("Zip file is created...");
	}
	
}
