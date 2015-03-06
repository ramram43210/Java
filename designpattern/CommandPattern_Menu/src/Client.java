public class Client
{
		public static void main( String[] args )
		{
				WordDocument wordDocument = new WordDocument();
				Command openCommand = new OpenCommand(wordDocument);
				Command saveCommand = new SaveCommand(wordDocument);
				Command closeCommand = new CloseCommand(wordDocument);
				MenuOptions menu = new MenuOptions(openCommand, saveCommand, closeCommand);
				menu.clickOpen();
				menu.clickSave();
				menu.clickClose();
		}

}