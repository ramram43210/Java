public class HasMoneyState implements VendingMachineState
{

		@Override
		public void selectProductAndInsertMoney( int amount, String productName )
		{
				System.out.println("Already Vending machine has money and product selected,So wait till it finish the current dispensing process ... ");

		}

		@Override
		public void dispenseProduct()
		{
				System.out.println("Vending Machine  dispensed the product ...");

		}

}