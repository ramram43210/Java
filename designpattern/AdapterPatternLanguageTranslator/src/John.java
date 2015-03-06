import java.util.HashMap;

/*
 *  John can speak and understand English and French,he acts as a Adapter or Translator
 */
public class John implements ITarget
{

		static HashMap<String, String> englishFrenchMap = new HashMap<String, String>();
		static HashMap<String, String> frenchEnglishMap = new HashMap<String, String>();
		David david = new David();
		Rohit rohit =new Rohit();

		static
		{
				englishFrenchMap.put("how are you?", "comment allez-vous?");
				englishFrenchMap.put("I am in USA", "Je suis aux Etats-Unis");
				frenchEnglishMap.put("Je suis très bien", "I am fine");
				frenchEnglishMap.put("où êtes-vous?", "where are you?");

		}

		@Override
		public String translateAndTellToOtherPerson( String words, String convertToWhichLanguage )
		{
				if( convertToWhichLanguage.equalsIgnoreCase("English") )
				{

						String englishWords = convertToEnglish(words);
						System.out.println("\nJohn Converted \"" + words + " \" to \"" + englishWords
						                + " and send the question to David");
						String englishWordsReply = david.answerFortheQuestion(englishWords);
						System.out.println("John Got reply from David in English like : " + "\"" + englishWordsReply
						                + "\"");
						String frenchConverted = convertToFrench(englishWordsReply);
						System.out.println("John Converted " + "\"" + englishWordsReply + "\"" + " to " + "\""
						                + frenchConverted + "\"" + " and send back to Rohit\n");
						return frenchConverted;

				}
				else if( convertToWhichLanguage.equalsIgnoreCase("French") )

				{
						String frenchWords = convertToFrench(words);
						System.out.println("\nJohn Converted \"" + words + " \" to \"" + frenchWords
						                + " and send the question to Rohit");
						String frenchWordsReply =rohit.answerFortheQuestion(frenchWords);
						System.out.println("John Got reply from Rohit in French like : " + "\"" + frenchWordsReply
						                + "\"");
						String englishConverted = convertToEnglish(frenchWordsReply);
						System.out.println("John Converted " + "\"" + frenchWordsReply + "\"" + " to " + "\""
						                + englishConverted + "\"" + " and send back to David\n");
						return englishConverted;

				}

				return "Sorry Cannot Covert";
		}

		public String convertToFrench( String words )
		{
				return englishFrenchMap.get(words);
		}

		public String convertToEnglish( String words )
		{
				return frenchEnglishMap.get(words);
		}

}
