/*
 * Hall
 */
public class Originator
{
		LedTV ledTV;

		public LedTV getLedTV()
		{
				return ledTV;
		}

		public void setLedTV( LedTV ledTV )
		{
				this.ledTV = ledTV;
		}

		public Memento createMemento()
		{
				return new Memento(ledTV);
		}

		public void setMemento( Memento memento )
		{
				ledTV = memento.getLedTV();
		}

		@Override
        public String toString()
        {
		        return "Originator [ledTV=" + ledTV + "]";
        }

		
		
}
