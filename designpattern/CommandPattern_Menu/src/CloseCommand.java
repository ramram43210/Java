public class CloseCommand implements Command
{
		private WordDocument wordDocument;

		public CloseCommand( WordDocument wordDocument )
		{
				this.wordDocument = wordDocument;
		}

		@Override
		public void execute()
		{
				wordDocument.close();
		}
}