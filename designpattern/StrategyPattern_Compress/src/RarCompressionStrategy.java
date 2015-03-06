import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy
{

		public void compressFiles( ArrayList<File> files, String compressedArchiveFileName )
		{
				System.out.println("Files are compressed using Rar approach: '" + compressedArchiveFileName
				                + ".rar' file is created");
		}

}