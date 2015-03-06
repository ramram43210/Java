public class Dogtail
{
		private String tailLength; // long or small

		public String getTailLength()
		{
				return tailLength;
		}

		public void setTailLength( String tailLength )
		{
				this.tailLength = tailLength;
		}

		@Override
        public String toString()
        {
		        return "Dogtail [tailLength=" + tailLength + "]";
        }

		
}
