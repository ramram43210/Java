public class LinearSearch implements SearchStrategy
{

		@Override
		public int search( int[] list, int elementToSearch )
		{
				int beg = 0;
				int end = list.length - 1;
				int mid = (int) ((beg + end) / 2);
				int position = 0;

				while( beg <= end && list[mid] != elementToSearch )
				{
						if( elementToSearch < list[mid] )
								end = mid - 1;
						else
								beg = mid + 1;

						mid = (int) ((beg + end) / 2);
				}

				if( list[mid] == elementToSearch )
						position = mid;
				else
						position = 0;

				 System.out.println("Position of the element has been found using LinearSearch Algorithm");
				
				 return position;
		}

}