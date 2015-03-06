import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

public class MyRowSetListener implements RowSetListener
{
	
	/*
	 * A cursor movement.
	 */
	@Override
	public void cursorMoved( RowSetEvent event )
	{
		System.out.println("Cursor Moved method is called in "+this.getClass().getName());
		System.out.println(event.toString());
	}


	/*
	 * The update, insertion, or deletion of a row.
	 */
	
	@Override
	public void rowChanged( RowSetEvent event )
	{
		System.out.println("Cursor Changed method is called in "+this.getClass().getName());
		System.out.println(event.toString());
	}


	/*
	 * A change to the entire RowSet contents.
	 */
	@Override
	public void rowSetChanged( RowSetEvent event )
	{
		System.out.println("RowSet changed method is called in "+this.getClass().getName());
		System.out.println(event.toString());
	}
}
