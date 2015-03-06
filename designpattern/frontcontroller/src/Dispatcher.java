public class Dispatcher
{
		private SalaryView  salaryView;
		private UserView    userView;
		private AccountView accountView;

		public Dispatcher()
		{
				salaryView = new SalaryView();
				userView = new UserView();
				accountView = new AccountView();
		}

		public void dispatch( String request )
		{
				if( request.equalsIgnoreCase("USER") )
				{
						userView.show();
				}
				else if( request.equalsIgnoreCase("ACCOUNT") )
				{
						accountView.show();
				}
				else
				{
						salaryView.show();
				}
		}
}
