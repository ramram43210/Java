public class BinarySearch implements SearchStrategy
{

		@Override
        public int search( int[] list, int elementToSearch )
        {
				
	            int position = 0;
	 
	            for (int i = 0; i < list.length; i++)
	            {
	                if (list[i] == elementToSearch)
	                {
	                    position = i;
	                    break;
	                }
	            }
	            
	            System.out.println("Position of the element has been found using BinarySearch Algorithm");
	            
	            return position;
        }

	
}