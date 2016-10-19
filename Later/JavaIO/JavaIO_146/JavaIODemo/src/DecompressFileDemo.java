import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class DecompressFileDemo
{

	public static void main(String[] args) throws IOException
	{
		DecompressFileDemo decompressFileDemo = new DecompressFileDemo();
		decompressFileDemo.decompressFile("D:/work/Compressed.txt",
											"D:/work/HelloWorld.java");

	}

	private void decompressFile(String fileToDeCompress, String deCompressFile)
			throws IOException
	{
		try (
				FileInputStream fin = new FileInputStream(fileToDeCompress);
				InflaterInputStream in = new InflaterInputStream(fin);
				FileOutputStream fout = new FileOutputStream(deCompressFile);)
		{

			int i;
			while ((i = in.read()) != -1)
			{
				fout.write((byte) i);
				fout.flush();
			}

		}

		System.out.println("DeCompression is done..");

	}

}
