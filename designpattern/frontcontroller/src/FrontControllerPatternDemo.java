public class FrontControllerPatternDemo
{
		public static void main( String[] args )
		{
				FrontController frontController = new FrontController();
				frontController.dispatchRequest("USER");
				System.out.println();
				frontController.dispatchRequest("ACCOUNT");
				System.out.println();
				frontController.dispatchRequest("SALARY");
		}
}
