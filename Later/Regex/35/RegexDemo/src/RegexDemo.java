import java.util.Arrays;
import java.util.List;

/**
 * 
 * How to validate image file extension with regular expression
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		List<String> validImageList = Arrays.asList("cat.jpg", "cat.gif",
				"cat.png", "cat.bmp", "dog.JPG", "dog.GIF", "dog.PNG",
				"dog.BMP","rose.JpG", "rose.gIF", "rose.PNg",
				"rose.BMp");

		ImageValidator imageValidator = new ImageValidator();

		validImageList.stream().forEach(imageName -> System.out.println(
				imageName + " is Valid? = " + imageValidator.validate(imageName)));

		System.out.println("--------------------------------------");

		List<String> inValidImageList = Arrays.asList(".jpg", " .gif","dog.txt","jpg");
		
		inValidImageList.stream().forEach(imageName -> System.out.println(
				imageName + " is Valid? = " + imageValidator.validate(imageName)));

	}

}