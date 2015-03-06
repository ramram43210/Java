import java.io.File;
import java.util.ArrayList;

public class Client
{

		public static void main( String[] args )
		{

				ArrayList<File> fileList = new ArrayList<File>();
				fileList.add(new File("D:\\Javafiles\\Javadoc.txt"));
				fileList.add(new File("D:\\Javafiles\\Release.txt"));

				CompressionContext ctx = null;

				ctx = new CompressionContext();
				ctx.setCompressionStrategy(new ZipCompressionStrategy());
				ctx.createArchive(fileList,"Javafiles");

				ctx = new CompressionContext();
				ctx.setCompressionStrategy(new RarCompressionStrategy());
				ctx.createArchive(fileList,"Javafiles");

		}
}