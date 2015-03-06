/*
 *  Invoker
 */

public class MenuOptions
{
		private Command openCommand;
		private Command saveCommand;
		private Command closeCommand;

		public MenuOptions( Command open, Command save, Command close )
		{
				this.openCommand = open;
				this.saveCommand = save;
				this.closeCommand = close;
		}

		public void clickOpen()
		{
				openCommand.execute();
		}

		public void clickSave()
		{
				saveCommand.execute();
		}

		public void clickClose()
		{
				closeCommand.execute();
		}
}