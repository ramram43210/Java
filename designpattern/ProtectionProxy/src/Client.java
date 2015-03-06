public class Client
{
		public static void main( String[] args )
		{

				new Client().folderAccess();
		}

		private  void folderAccess()
        {
		        System.out.println(this.getClass()+" : Client passing user with designation 'CEO' to folderproxy");
				User john = new User("John", "John123","CEO");
				FolderProxy folderProxy = new FolderProxy(john);
				folderProxy.performReadOrWriteOperations();
				System.out.println("\n***************************************************************************************\n");
				System.out.println(this.getClass()+" : Client passing user with designation 'Developer' to folderproxy");
				User raj = new User("Raj", "Raj123","Developer");
				FolderProxy folderProxyWrong = new FolderProxy(raj);
				folderProxyWrong.performReadOrWriteOperations();
				
        }
		
		

}
