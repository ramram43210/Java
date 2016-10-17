import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDemo
{
	private ArrayList<String> fileList;
	private static final String OUTPUT_ZIP_FILE = "D:/work/Java.zip";
	private static final String SOURCE_FOLDER = "D:/work/java";

	public ZipDemo()
	{
		fileList = new ArrayList<String>();
	}

	public static void main(String[] args) throws IOException
	{
		ZipDemo zipDemo = new ZipDemo();
		zipDemo.generateFileList(new File(SOURCE_FOLDER));
		zipDemo.zipIt(OUTPUT_ZIP_FILE);
	}

	public void zipIt(String zipFile) throws IOException
	{

		byte[] buffer = new byte[1024];

		/*
		 * If the Streams are within the
		 * "try-With-Resources" block, then it will be
		 * closed automatically.
		 */
		try (
				FileOutputStream fos = new FileOutputStream(zipFile);
				ZipOutputStream zos = new ZipOutputStream(fos))
		{

			System.out.println("Output to Zip : " + zipFile);

			for (String file : this.fileList)
			{

				System.out.println("File Added : " + file);
				ZipEntry ze = new ZipEntry(file);
				zos.putNextEntry(ze);

				FileInputStream in = new FileInputStream(SOURCE_FOLDER
						+ File.separator + file);

				int len;
				while ((len = in.read(buffer)) > 0)
				{
					zos.write(buffer, 0, len);
				}

				in.close();
			}

			zos.closeEntry();

			System.out.println("Zip file is created...");
		}

	}

	/**
	 * Traverse a directory and get all files, and add the
	 * file into fileList.
	 */
	public void generateFileList(File node)
	{

		// add file only
		if (node.isFile())
		{
			fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));
		}

		if (node.isDirectory())
		{
			String[] subNote = node.list();
			for (String filename : subNote)
			{
				generateFileList(new File(node, filename));
			}
		}

	}

	/**
	 * Format the file path for zip
	 */
	private String generateZipEntry(String file)
	{
		return file.substring(SOURCE_FOLDER.length() + 1, file.length());
	}
}
