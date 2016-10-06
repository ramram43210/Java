import java.io.File;
import java.io.FilenameFilter;

/*
 * boolean accept(File dir, String name)
 * 
 * Parameters: 
 * ----------
 * 
 * dir - the directory in which the file was found. 
 * name - the name of the file.
 */
public class ExtensionFilter implements FilenameFilter
{

	private String fileExtension;

	public ExtensionFilter(String fileExtension)
	{
		this.fileExtension = fileExtension;
	}

	/*
	 * Tests if a specified file should be included in a
	 * file list.
	 * 
	 * Returns: true if and only if the name should be
	 * included in the file list; false otherwise.
	 */
	@Override
	public boolean accept(File dir, String name)
	{
		return (name.endsWith(fileExtension));
	}

}
