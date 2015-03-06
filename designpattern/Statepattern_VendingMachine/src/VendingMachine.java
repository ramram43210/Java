// This is like Context
public class VendingMachine implements VendingMachineState
{

		private VendingMachineState vendingMachineState;

		public VendingMachine()
		{
				vendingMachineState = new NoMoneyState();
		}

		public VendingMachineState getVendingMachineState()
		{
				return vendingMachineState;
		}

		public void setVendingMachineState( VendingMachineState vendingMachineState )
		{
				this.vendingMachineState = vendingMachineState;
		}

		@Override
		public void selectProductAndInsertMoney( int amount, String productName )
		{
				vendingMachineState.selectProductAndInsertMoney(amount, productName);
				VendingMachineState hasMoneyState = new HasMoneyState();
				/*
				 * Money has been inserted so vending Machine changed the
				 * internal state to 'hasMoneyState'
				 */
				
				if( vendingMachineState instanceof NoMoneyState )
				{
						setVendingMachineState(hasMoneyState);
						System.out.println("VendingMachine internal state has been moved to : "
						                + vendingMachineState.getClass().getName());
				}

		}

		@Override
		public void dispenseProduct()
		{
				VendingMachineState noMoenyState = new NoMoneyState();
				vendingMachineState.dispenseProduct();

				/*
				 * Product has been dispensed so vending Machine changed the
				 * internal state to 'NoMoneyState'
				 */
				if( vendingMachineState instanceof HasMoneyState )
				{
						setVendingMachineState(noMoenyState);
						System.out.println("VendingMachine internal state has been moved to : "
						                + vendingMachineState.getClass().getName());
				}

		}

}