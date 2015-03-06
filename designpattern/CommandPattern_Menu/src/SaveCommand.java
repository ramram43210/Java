public class SaveCommand implements Command
{

		private WordDocument wordDocument;

		public SaveCommand( WordDocument wordDocument )
		{
				this.wordDocument = wordDocument;
		}

		@Override
		public void execute()
		{
				wordDocument.save();
		}
}