import java.io.File;
import java.util.ArrayList;

public class CompressionContext
{
		private CompressionStrategy strategy;

		//Client will set what CompressionStrategy to use by calling this method
		public void setCompressionStrategy( CompressionStrategy strategy )
		{
				this.strategy = strategy;
		}

		public void createArchive( ArrayList<File> files,String compressedArchiveFileName )
		{
				strategy.compressFiles(files,compressedArchiveFileName);
		}

}