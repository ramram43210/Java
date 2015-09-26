public class Student
{
	/*
	 * marksScoredInScience,marksScoredInEnglish are parameters.
	 */
	public int getTotalMarks(int marksScoredInScience, int marksScoredInEnglish)
	{

		int totalMarks = marksScoredInScience 
				    + marksScoredInEnglish; // Local Variable
		return totalMarks;
	}
}
