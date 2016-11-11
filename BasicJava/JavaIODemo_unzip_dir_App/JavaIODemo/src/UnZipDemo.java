import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipDemo
{
	private static final String INPUT_ZIP_FILE = "D:/work/Java.zip";
	private static final String OUTPUT_FOLDER = "D:/work/java";

	public static void main(String[] args) throws IOException
	{
		UnZipDemo unZipDemo = new UnZipDemo();
		unZipDemo.unZip(INPUT_ZIP_FILE, OUTPUT_FOLDER);
	}

	public void unZip(String zipFile, String outputFolder) throws IOException
	{

		createDir(outputFolder);

		/*
		 * If the Streams are within the
		 * "try-With-Resources" block, then it will be
		 * closed automatically.
		 */
		try (
				// Get the zip file content
				ZipInputStream zis = new ZipInputStream(new FileInputStream(
																		zipFile)))
		{
			// Get the zipped file list entry
			ZipEntry ze = zis.getNextEntry();
			byte[] buffer = new byte[1024];
			while (ze != null)
			{

				String fileName = ze.getName();
				File newFile = new File(outputFolder + File.separator
																+ fileName);

				System.out.println("file unzip : " + newFile.getAbsoluteFile());

				/*
				 * Create all non exists folders
				 */
				new File(newFile.getParent()).mkdirs();

				FileOutputStream fos = new FileOutputStream(newFile);

				int len;
				while ((len = zis.read(buffer)) > 0)
				{
					fos.write(buffer, 0, len);
				}

				fos.close();
				ze = zis.getNextEntry();
			}

			zis.closeEntry();

			System.out.println("Unzip is completed..");
		}

	}

	private void createDir(String outputFolder)
	{
		/*
		 * Create output directory is not exists
		 */
		File folder = new File(outputFolder);
		if (!folder.exists())
		{
			folder.mkdir();
		}
	}
}