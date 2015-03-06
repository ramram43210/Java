import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy
{

		public void compressFiles( ArrayList<File> files, String compressedArchiveFileName )
		{
				System.out.println("Files are compressed using zip approach: '" + compressedArchiveFileName
				                + ".zip' file is created");
		}

}