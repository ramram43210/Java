public class TryWithResourcesDemo
{

	public static void main(String[] args) throws Exception
	{
		TryWithResourcesDemo tryWithResourcesDemo = new TryWithResourcesDemo();
		tryWithResourcesDemo.writeToFileZipFileContents("files.zip",
				"myfile.txt");
		System.out
				.println("Open zip file and create output file is done.");

	}

	/*
	 * Retrieves the names of the files packaged in the zip
	 * file zipFileName and creates a text file that
	 * contains the names of these files.
	 */

	public void writeToFileZipFileContents(String zipFileName,
			String outputFileName) throws java.io.IOException
	{

		java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.US_ASCII;
		java.nio.file.Path outputFilePath = java.nio.file.Paths
				.get(outputFileName);

		// Open zip file and create output file with
		// try-with-resources statement

		try (java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(
				zipFileName);
				java.io.BufferedWriter bufferedWriter = java.nio.file.Files
						.newBufferedWriter(outputFilePath, charset))
		{

			// Enumerate each entry
			for (java.util.Enumeration entries = zipFile.entries(); entries
					.hasMoreElements();)
			{
				// Get the entry name and write it to the
				// output file
				String newLine = System.getProperty("line.separator");
				String zipEntryName = ((java.util.zip.ZipEntry) entries
						.nextElement()).getName() + newLine;
				bufferedWriter.write(zipEntryName, 0,
						zipEntryName.length());
			}
		}
	}
}
