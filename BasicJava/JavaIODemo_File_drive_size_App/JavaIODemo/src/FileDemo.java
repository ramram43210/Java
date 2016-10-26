import java.io.File;

public class FileDemo
{

	public static void main(String[] args)
	{
		File file = new File("c:");
		/*
		 * Returns the size of the partition named by this
		 * abstract pathname.
		 */
		long totalSpace = file.getTotalSpace();
		/*
		 * Returns the number of bytes available to this
		 * virtual machine on the partition named by this
		 * abstract pathname.
		 */
		long usableSpace = file.getUsableSpace();
		/*
		 * Returns the number of unallocated bytes in the
		 * partition named by this abstract path name.
		 */
		long freeSpace = file.getFreeSpace();

		System.out.println(" === bytes ===");
		System.out.println("Total size : " + totalSpace + " bytes");
		System.out.println("Space free : " + usableSpace + " bytes");
		System.out.println("Space free : " + freeSpace + " bytes");

		System.out.println(" === gigabyte ===");
		System.out.println("Total size : " + totalSpace / 1024 / 1024 / 1024 + " GB");
		System.out.println("Space free : " + usableSpace / 1024 / 1024 / 1024 + " GB");
		System.out.println("Space free : " + freeSpace / 1024 / 1024 /1024 + " GB");
	}

}
