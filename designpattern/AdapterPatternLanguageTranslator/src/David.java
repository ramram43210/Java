/*
 * He is from USA, So he can speak and understand only English
 */
public class David implements EnglishSpeaker
{

		public static void main( String args[] )
		{
				String replyFromRohit = new David().askQuestion("how are you?");
				System.out.println("Reply From Rohit [French Speaker can Speak and Understand only French] :  " + replyFromRohit);
		}

		@Override
		public String askQuestion( String words )
		{
				System.out.println("Question Asked by David [English Speaker and Can understand only English] : " +words);
				ITarget target = new John();
				String replyFromRohit = target.translateAndTellToOtherPerson(words, "French");
				return replyFromRohit;
		}

		@Override
		public String answerFortheQuestion( String words )
		{
				String reply = null;
				if( words.equalsIgnoreCase("where are you?") )
				{
						reply = "I am in USA";
				}
				return reply;
		}

}
