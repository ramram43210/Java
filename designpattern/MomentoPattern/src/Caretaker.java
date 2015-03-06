import java.util.ArrayList;
import java.util.List;
/*
 * Store Room
 */
public class Caretaker
{
		private List<Memento> ledTvList = new ArrayList<Memento>();

		public void addMemento( Memento m )
		{
				ledTvList.add(m);
				System.out.println("LED TV's snapshots Maintained by CareTaker :" + ledTvList);
		}

		public Memento getMemento( int index )
		{
				return ledTvList.get(index);
		}
}
