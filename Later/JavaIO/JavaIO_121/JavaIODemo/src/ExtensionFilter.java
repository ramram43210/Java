import java.io.File;
import java.io.FilenameFilter;

public class ExtensionFilter implements FilenameFilter
{

	private String fileExtension;

	public ExtensionFilter(String fileExtension)
	{
		this.fileExtension = fileExtension;
	}

	@Override
	public boolean accept(File dir, String name)
	{
		return (name.endsWith(fileExtension));
	}

}
