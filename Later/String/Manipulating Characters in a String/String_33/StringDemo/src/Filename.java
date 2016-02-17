public class Filename
{
	private String fullPath;
	private char pathSeparator, extensionSeparator;

	public Filename(String str, char sep, char ext)
	{
		fullPath = str;
		pathSeparator = sep;
		extensionSeparator = ext;
	}

	/*
	 * Extension method uses lastIndexOf to locate the last
	 * occurrence of the period (.) in the file name. Then
	 * substring uses the return value of lastIndexOf to
	 * extract the file name extension — that is, the
	 * substring from the period to the end of the string.
	 * This code assumes that the file name has a period in
	 * it; if the file name does not have a period,
	 * lastIndexOf returns -1, and the substring method
	 * throws a StringIndexOutOfBoundsException.
	 * 
	 * Also, notice that the extension method uses dot + 1
	 * as the argument to substring. If the period character
	 * (.) is the last character of the string, dot + 1 is
	 * equal to the length of the string, which is one
	 * larger than the largest index into the string
	 * (because indices start at 0). This is a legal
	 * argument to substring because that method accepts an
	 * index equal to, but not greater than, the length of
	 * the string and interprets it to mean
	 * "the end of the string."
	 */
	public String extension()
	{
		int dot = fullPath.lastIndexOf(extensionSeparator);
		return fullPath.substring(dot + 1);
	}

	// gets filename without extension
	public String filename()
	{
		int dot = fullPath.lastIndexOf(extensionSeparator);
		int sep = fullPath.lastIndexOf(pathSeparator);
		return fullPath.substring(sep + 1, dot);
	}

	public String path()
	{
		int sep = fullPath.lastIndexOf(pathSeparator);
		return fullPath.substring(0, sep);
	}
}