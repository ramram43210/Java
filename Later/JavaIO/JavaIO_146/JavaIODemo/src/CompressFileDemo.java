import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

class CompressFileDemo
{
	public static void main(String args[]) throws IOException
	{
		CompressFileDemo compressFileDemo = new CompressFileDemo();
		compressFileDemo.compressFile("D:/work/HelloWorld.java",
											"D:/work/Compressed.txt");
	}

	private void compressFile(String fileToCompress, String compressFile)
			throws IOException
	{
		try (
				FileInputStream fin = new FileInputStream(fileToCompress);
				FileOutputStream fout = new FileOutputStream(compressFile);
				DeflaterOutputStream dos = new DeflaterOutputStream(fout);)
		{

			int i;
			while ((i = fin.read()) != -1)
			{
				dos.write((byte) i);
				dos.flush();
			}

		}

		System.out.println("Compression is done..");
	}
}