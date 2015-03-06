public class FolderProxy implements IFolder
{
		private Folder folder;
		private User   user;

		public FolderProxy( User user )
		{
				this.user = user;
		}

		@Override
		public void performReadOrWriteOperations()
		{

				if( user.getDesignation().equalsIgnoreCase("CEO") || user.getDesignation().equalsIgnoreCase("Manager") )
				{
						folder = new Folder();
						System.out.println(this.getClass()+" : Folder Proxy makes call to the RealFolder 'performReadOrWriteOperations method'");
						folder.performReadOrWriteOperations();
				}
				else
				{
						System.out.println(this.getClass()+": Folder proxy says 'You don't have access to this folder'");
				}

		}

}
