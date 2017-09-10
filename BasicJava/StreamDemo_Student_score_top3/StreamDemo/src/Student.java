public class Student implements Comparable<Student> 
{
	private String name;
	private int score;

	public Student(String name, int score)
	{
		this.name = name;
		this.score = score;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public int getScore()
	{
		return this.score;
	}

	@Override
	public String toString()
	{
		return this.name + " - " + this.score;
	}

	@Override
	public int compareTo(Student another)
	{
		return another.getScore() - this.score;
	}
}